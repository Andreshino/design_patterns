package edu.symplifica.structural_patterns.decorator;

import edu.symplifica.structural_patterns.decorator.data_source.DataSource;
import edu.symplifica.structural_patterns.decorator.data_source.FileDataSource;
import edu.symplifica.structural_patterns.decorator.decorators.CompressionDecorator;
import edu.symplifica.structural_patterns.decorator.decorators.DataSourceDecorator;
import edu.symplifica.structural_patterns.decorator.decorators.EncryptionDecorator;

public class Client {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
