package edu.symplifica.creational_patterns.factory_method;

import edu.symplifica.creational_patterns.factory_method.factory.Dialog;
import edu.symplifica.creational_patterns.factory_method.factory.HtmlDialog;
import edu.symplifica.creational_patterns.factory_method.factory.WindowDialog;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter system type: ");
        String systemType = myObj.nextLine();

        Dialog dialog;
        if (systemType.equals("HTML")) {
            dialog = new HtmlDialog();
        } else {
            dialog = new WindowDialog();
        }

        dialog.renderWindow();

    }
}
