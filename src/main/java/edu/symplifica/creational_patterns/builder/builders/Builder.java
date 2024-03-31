package edu.symplifica.creational_patterns.builder.builders;

import edu.symplifica.creational_patterns.builder.cars.CarType;
import edu.symplifica.creational_patterns.builder.components.Engine;
import edu.symplifica.creational_patterns.builder.components.GPSNavigator;
import edu.symplifica.creational_patterns.builder.components.Transmission;
import edu.symplifica.creational_patterns.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
