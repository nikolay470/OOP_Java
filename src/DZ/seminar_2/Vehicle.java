package DZ.seminar_2;

public abstract class Vehicle {
    protected int id;
    protected String brand;
    protected String model;
    protected int yearOfRelease;

    public Vehicle(int initID, String initBrand, String initModel, int initYearOfRelease) {
        id = initID;
        brand = initBrand;
        model = initModel;
        yearOfRelease = initYearOfRelease;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate(int speed);
    public abstract void stopMovement();
    public abstract void displayInfo();
}






















