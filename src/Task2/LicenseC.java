package Task2;

import java.util.Objects;

public class LicenseC extends Driver<Truck> {
    public LicenseC(String nameDriver, String licenseDriver, Double drivingExperience) {
        super(nameDriver, licenseDriver, drivingExperience);
    }

    @Override
    public void startMoving(Truck transport) {
        System.out.println("Водитель " + getNameDriver() + " участвует в заезде. Начал движение на грузовике "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void endMoving(Truck transport) {
        System.out.println("Водитель " + getNameDriver() + " приехал на грузовике " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }


    @Override
    public void refuel(Truck transport) {
        System.out.println("Водитель " + getNameDriver() + " заправил грузовик " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void checkLicense() {
        if (getLicenseDriver() == null || getLicenseDriver().isBlank() || !Objects.equals(getLicenseDriver(), "C")){
            throw new RuntimeException("Необходимо указать тип прав!");
        } else {
            System.out.println("Категория прав у водителя " + getNameDriver() + " соответствует.");
        }
    }
}