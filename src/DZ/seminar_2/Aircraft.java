package DZ.seminar_2;

import DZ.seminar_2.Interface.Flyable;

// Класс Aircraft представляет самолет
public class Aircraft extends Vehicle implements Flyable {
    private final int MaxAltitude; // Максмальная высота полета
    private int speed; // скорость
    private boolean flightStatus; // статус полета
    public Aircraft(int id, String brand, String model, int yearOfRelease, int maxAltitude) {
        super(id, brand, model, yearOfRelease);
        this.MaxAltitude = maxAltitude;
        this.flightStatus = false;
        this.speed = 0;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель самолета запущен");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель самолета заглушен");
    }

    @Override
    public void accelerate(int speed) {
        this.speed = speed;
        System.out.printf("Самолет набрал скорость до %d\n", speed);
    }

    @Override
    public void stopMovement() {
        this.speed = 0;
        System.out.println("Самолет остановлен");
    }

    @Override
    public void displayInfo() { // Информация об самолете
        System.out.printf(
                "Самолет\nID: %d\nБрэнд: %s\nМарка: %s\n"
                +"Год выпуска: %d\nМаксимальная высота полета: %d м\n",
                this.id, this.brand, this.model, this.yearOfRelease, this.MaxAltitude
        );
    }

    public boolean isFlying() {
        return this.flightStatus;
    } // Проверка летит самолет или нет

    @Override
    public void takeoff() { // Метод взлета
        if (this.speed >= 250) {
            this.flightStatus = true;
            System.out.println("Самолет взлетает...");
        }
        else {
            System.out.println("Скорости недостаточно для взлета\nНеобходимо набрать скорость 250 км/ч или выше");
        }
    }

    @Override
    public void land() { // Метод приземления
            this.flightStatus = false;
            System.out.println("Самолет снижается и совершает посадку");
    }
}





















