package DZ.seminar_2;

public class Aircraft extends Vehicle implements Flyable{
    private final int MaxAltitude;
    private int speed;
    private boolean flightStatus;
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
    public void displayInfo() {
        System.out.printf(
                "Самолет\nID: %d\nБрэнд: %s\nМарка: %s\n"
                +"Год выпуска: %d\nМаксимальная высота полета: %d\n",
                this.id, this.brand, this.model, this.yearOfRelease, this.MaxAltitude
        );
    }

    public boolean isFlying() {
        return this.flightStatus;
    }

    private void changedFlightStatus() {
        this.flightStatus = !this.flightStatus;
    }

    @Override
    public void takeoff() {
        if (this.speed >= 250) {
            changedFlightStatus();
            System.out.println("Самолет взлетает...\n");
        }
        else {
            System.out.println("Скорости недостаточно для взлета\nНеобходимо набрать скорость 250 км/ч или выше\n");
        }
    }

    @Override
    public void land() {
        if (this.speed < 250) {
            changedFlightStatus();
            System.out.println("Самолет снижается и совершает посадку\n");
        }
        else {
            System.out.println("Скорость слишком высокая для посадки\nПонизьте скорость до значений ниже 250 км/ч\n");
        }
    }
}





















