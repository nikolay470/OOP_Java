package DZ.seminar_2;

//Абстрактный класс Vehicle. Родительский класс для всех типов транспорта
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

    public abstract void startEngine(); // Метод запуска двигателя
    public abstract void stopEngine(); // Метод остановки двигателя
    public abstract void accelerate(int speed); // Метод набора скорости
    public abstract void stopMovement(); // Метод остановки движения
    public abstract void displayInfo(); // Метод вывода информации об ТС на экран
}






















