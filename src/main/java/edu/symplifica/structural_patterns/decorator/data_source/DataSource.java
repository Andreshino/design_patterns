package edu.symplifica.structural_patterns.decorator.data_source;

public interface DataSource {
    void writeData(String data);

    String readData();
}
