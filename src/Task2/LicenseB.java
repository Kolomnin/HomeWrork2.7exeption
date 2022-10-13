package Task2;

import java.util.Objects;

public class LicenseB extends Driver<Car> {

    public LicenseB(String nameDriver, String licenseDriver, Double drivingExperience) {
        super(nameDriver, licenseDriver, drivingExperience);
    }

    @Override
    public void startMoving(Car transport) {
        System.out.println("Водитель " + getNameDriver() + " участвует в заезде. Начал движение на легковом автомобиле "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void endMoving(Car transport) {
        System.out.println("Водитель " + getNameDriver() + " приехал на легковом автомобиле " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refuel(Car transport) {
        System.out.println("Водитель " + getNameDriver() + " заправил легковой автомобиль " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void checkLicense() {
        if (getLicenseDriver() == null || getLicenseDriver().isBlank() || !Objects.equals(getLicenseDriver(), "B")){
            throw new RuntimeException("Необходимо указать тип прав!");
        } else {
            System.out.println("Категория прав у водителя " + getNameDriver() + " соответствует.");
        }

    }

}
