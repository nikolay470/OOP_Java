package DZ.seminar_2;

// Класс Car представляет автомобиль
public class Car extends Vehicle{
    private final int FuelCapacity; // емкость топливного бака
    private int currentFuelCapacity; // текущий уровень топлива в баке
    public Car(
            int id, String brand,
            String model, int yearOfRelease,
            int fuelCapacity, int currentFuelCapacity
    )
    {
        super(id, brand, model, yearOfRelease);
        this.FuelCapacity = fuelCapacity;
        this.currentFuelCapacity = currentFuelCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель заглушен");
    }

    @Override
    public void accelerate(int speed) {
        System.out.printf("Автомобиль набрал скорость до %d\n", speed);
    }

    @Override
    public void stopMovement() {
        System.out.println("Автомобиль остановился");
    }

    @Override
    public void displayInfo() { // Информация об автомобиле
        System.out.printf(
                "Автомобиль:\nID: %d\nМарка: %s\nМодель: %s\n"
                +"Год выпуска: %d\nОбъем бензобака: %d л\n",
                this.id, this.brand, this.model, this.yearOfRelease, this.FuelCapacity);
    }

    public int getCurrentFuelCapacity(){
        return this.currentFuelCapacity;
    } // Изменение уровня топлива в баке

    public void refuel(int liters) { // Метод заправки
        int newVolume = this.currentFuelCapacity + liters;
        if (newVolume <= this.FuelCapacity){
            this.currentFuelCapacity = newVolume;
        }
        else {
            int extraVolume = newVolume - this.FuelCapacity;
            this.currentFuelCapacity = this.currentFuelCapacity + (this.FuelCapacity - this.currentFuelCapacity);
            System.out.printf("Заправляемого топлива слишком много! Остался излишек %d л\n", extraVolume);
        }
    }
}




















