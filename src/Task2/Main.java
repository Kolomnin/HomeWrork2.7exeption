package Task2;


public class Main {
    public static void main(String[] args) throws Exception {

        Bus bus1 = new Bus("Паз", "т34-100", 2.5);
        System.out.println(bus1);
        bus1.startMoving();
        bus1.pitStop();
        bus1.bestLapTime();
        bus1.maxSpeed();
        bus1.endMoving();
        System.out.println();

        Bus bus2 = new Bus("Man", "Voyager", 6.2);
        System.out.println(bus2);
        bus2.startMoving();
        bus2.pitStop();
        bus2.bestLapTime();
        bus2.maxSpeed();
        bus2.endMoving();
        System.out.println();

        Bus bus3 = new Bus("Volkswagen", "Transporter", 5.5);
        System.out.println(bus3);
        bus3.startMoving();
        bus3.pitStop();
        bus3.bestLapTime();
        bus3.maxSpeed();
        bus3.endMoving();
        System.out.println();

        Bus bus4 = new Bus("Ford", "Transit", 4.5);
        System.out.println(bus4);
        bus4.startMoving();
        bus4.pitStop();
        bus4.bestLapTime();
        bus4.maxSpeed();
        bus4.endMoving();
        System.out.println();

        Car car1 = new Car("Lada", "Niva", 1.6);
        System.out.println(car1);
        car1.startMoving();
        car1.pitStop();
        car1.bestLapTime();
        car1.maxSpeed();
        car1.endMoving();
        System.out.println();

        Car car2 = new Car("Lada", "Vesta", 1.6);
        System.out.println(car2);
        car2.startMoving();
        car2.pitStop();
        car2.bestLapTime();
        car2.maxSpeed();
        car2.endMoving();
        System.out.println();

        Car car3 = new Car("Volvo", "s60", 2.4);
        System.out.println(car3);
        car3.startMoving();
        car3.pitStop();
        car3.bestLapTime();
        car3.maxSpeed();
        car3.endMoving();
        System.out.println();

        Car car4 = new Car("Volkswagen", "Jetta", 1.8);
        System.out.println(car4);
        car4.startMoving();
        car4.pitStop();
        car4.bestLapTime();
        car4.maxSpeed();
        car4.endMoving();
        System.out.println();

        Truck truck1 = new Truck("Scania", "VF-100", 12.0);
        System.out.println(truck1);
        truck1.startMoving();
        truck1.pitStop();
        truck1.bestLapTime();
        truck1.maxSpeed();
        truck1.endMoving();
        System.out.println();

        Truck truck2 = new Truck("Kamaz", "KZ10", 10.0);
        System.out.println(truck2);
        truck2.startMoving();
        truck2.pitStop();
        truck2.bestLapTime();
        truck2.maxSpeed();
        truck2.endMoving();
        System.out.println();

        Truck truck3 = new Truck("MAN", "JetFly", 11.0);
        System.out.println(truck3);
        truck3.startMoving();
        truck3.pitStop();
        truck3.bestLapTime();
        truck3.maxSpeed();
        truck3.endMoving();
        System.out.println();

        Truck truck4 = new Truck("Dodge", "Ram", 6.0);
        System.out.println(truck4);
        truck4.startMoving();
        truck4.pitStop();
        truck4.bestLapTime();
        truck4.maxSpeed();
        truck4.endMoving();
        System.out.println();

        LicenseB ivan = new LicenseB("Ivan", "B" , 5.0);
        System.out.println(ivan);
        ivan.startMoving(car4);
        ivan.refuel(car4);
        ivan.endMoving(car4);
        System.out.println();

        LicenseD pasha = new LicenseD("Pasha", "D", 5.10);
        System.out.println(pasha);
        pasha.startMoving(bus1);
        pasha.refuel(bus1);
        pasha.endMoving(bus1);
        System.out.println();

        LicenseC vitia = new LicenseC("Vitia", "C", 1.5);
        System.out.println(vitia);
        vitia.startMoving(truck3);
        vitia.refuel(truck3);
        vitia.endMoving(truck3);
        System.out.println();

        System.out.println(vitia.getLicenseDriver());
        vitia.checkLicense();




        CheckDiagnostics(car1, car2, car3, truck2);
    }

    public static boolean CheckDiagnostics(Transport... transports) {
        int count = 0;

        try {
            for (Transport transport : transports) {
                transport.passDiagnostics();
                count++;
            }
        } catch (DiagnosticsException e) {
            System.out.println("Something went wrong:" );
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Diagnostics is true - " + count + " point");
        }
        return false;
    }
}