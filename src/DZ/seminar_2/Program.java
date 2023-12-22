package DZ.seminar_2;

public class Program {
    public static void main(String[] args) {
        Car car_1 = new Car(
                1, "Lada", "Priora",
                2015, 43, 25)
                ;
        Aircraft aircraft_1 = new Aircraft(
                2, "Boing", "747",
                2017, 10_000
        );
        Boat boat_1 = new Boat(3, "Аква", "2900", 2019, 50);

        car_1.displayInfo();
        System.out.println();
        car_1.startEngine();
        car_1.accelerate(60);
        System.out.println("До заправки: " + car_1.getCurrentFuelCapacity());
        car_1.refuel(15);
        System.out.println("После заправки: " + car_1.getCurrentFuelCapacity());
        car_1.stopMovement();
        car_1.stopEngine();
        System.out.println();

        aircraft_1.displayInfo();
        System.out.println();
        aircraft_1.startEngine();
        aircraft_1.accelerate(260);
        aircraft_1.takeoff();
        System.out.println("Статус полета: " + aircraft_1.isFlying());
        aircraft_1.land();
        System.out.println("Статус полета: " + aircraft_1.isFlying());
        aircraft_1.stopMovement();
        aircraft_1.stopEngine();
        System.out.println();

        boat_1.displayInfo();
        System.out.println();
        boat_1.startEngine();
        boat_1.startSwimming(40);
        System.out.println("Статус движения по воде: " + boat_1.isSailing());
        boat_1.stopSwimming();
        System.out.println("Статус движения по воде: " + boat_1.isSailing());
        boat_1.stopEngine();
    }
}
