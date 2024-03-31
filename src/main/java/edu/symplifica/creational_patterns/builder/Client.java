package edu.symplifica.creational_patterns.builder;

import edu.symplifica.creational_patterns.builder.builders.Builder;
import edu.symplifica.creational_patterns.builder.builders.CarBuilder;
import edu.symplifica.creational_patterns.builder.builders.CarManualBuilder;
import edu.symplifica.creational_patterns.builder.cars.Car;
import edu.symplifica.creational_patterns.builder.cars.Manual;
import edu.symplifica.creational_patterns.builder.director.Director;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter car type: ");
        String carType = myObj.nextLine();
        switch (carType) {
            case "city":
                director.constructCityCar(carBuilder);
                director.constructCityCar(manualBuilder);
                break;
            case "sports":
                director.constructSportsCar(carBuilder);
                director.constructSportsCar(manualBuilder);
                break;
            case "suv":
                director.constructSUV(carBuilder);
                director.constructSUV(manualBuilder);
                break;
        }

        Car car = carBuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
