package edu.symplifica.creational_patterns.builder.builders;

import edu.symplifica.creational_patterns.builder.cars.Car;
import edu.symplifica.creational_patterns.builder.cars.CarType;
import edu.symplifica.creational_patterns.builder.components.Engine;
import edu.symplifica.creational_patterns.builder.components.GPSNavigator;
import edu.symplifica.creational_patterns.builder.components.Transmission;
import edu.symplifica.creational_patterns.builder.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
