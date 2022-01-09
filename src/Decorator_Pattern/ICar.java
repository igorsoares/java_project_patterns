package Decorator_Pattern;

public interface ICar {
    String getMake();

    void setMake();

    String getModel();

    void setModel();

    double getEngineSize();

    void setEngineSize();

    String getTransmission();

    void setTransmission();

    double getPrice();

    void setPrice(double price);

    boolean isAllTerrain();

    void setAllTerrain(boolean allTerrain);
}
