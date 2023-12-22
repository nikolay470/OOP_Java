package DZ.seminar_2;

import DZ.seminar_2.Interface.Swimmable;

// Класс Boat представляет лодку
public class Boat extends Vehicle implements Swimmable {
    private final int MaxSpeedInAqua; // Максимальная скорость
    private int speed; // Текущая скорость
    private boolean sailingStatus; // Статус движения по воде

    public Boat(int id, String brand, String model, int yearOfRelease, int maxSpeedInAqua) {
        super(id, brand, model, yearOfRelease);
        this.MaxSpeedInAqua = maxSpeedInAqua;
        this.sailingStatus = false;
        this.speed = 0;
    }

    public boolean isSailing() { // Проверка статуса
        return this.sailingStatus;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель лодки запущен");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель лодки заглушен");
    }

    @Override
    public void accelerate(int speed) {
        if (speed <= MaxSpeedInAqua) {
            this.speed = speed;
            this.sailingStatus = true;
            System.out.printf("Лодка набрала скорость %d\n", this.speed);
        }
        else {
            this.speed = this.MaxSpeedInAqua;
            this.sailingStatus = true;
            System.out.printf(
                    "Скорость которую нужно набрать слишком высока!\n"
                    +"Максимальная скорость составляет %d км/ч\n",
                    this.MaxSpeedInAqua
            );
        }
    }

    @Override
    public void stopMovement() {
        this.speed = 0;
        this.sailingStatus = false;
        System.out.println("Лодка остановлена");
    }

    @Override
    public void displayInfo() { // Информация об лодке
        System.out.printf(
                "Лодка\nID: %d\nБрэнд: %s\nМодель: %s\n"
                +"Год выпуска: %d\nМаксимальная скорость: %d км/ч\n",
                this.id, this.brand, this.model, this.yearOfRelease, this.MaxSpeedInAqua
        );
    }

    @Override
    public void startSwimming(int speed) { // Начало движения по воде
        this.accelerate(speed);
    }

    @Override
    public void stopSwimming() { // Остановка движения
        this.stopMovement();
    }
}
























