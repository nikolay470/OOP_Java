package DZ.seminar_2;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class Boat extends Vehicle implements Swimmable {
    private final int MaxSpeedInAqua;
    private int speed;
    private boolean sailing;

    public Boat(int id, String brand, String model, int yearOfRelease, int maxSpeedInAqua) {
        super(id, brand, model, yearOfRelease);
        this.MaxSpeedInAqua = maxSpeedInAqua;
        this.sailing = false;
        this.speed = 0;
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
            this.sailing = true;
            System.out.printf("Лодка набрала скорость %d\n", this.speed);
        }
        else {
            this.speed = this.MaxSpeedInAqua;
            this.sailing = true;
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
        this.sailing = false;
        System.out.println("Лодка остановлена");
    }

    @Override
    public void displayInfo() {
        System.out.println();
    }
}
























