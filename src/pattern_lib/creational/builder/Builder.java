package pattern_lib.creational.builder;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setDoors(int doors);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
