package Task2;

import java.util.Objects;

public class LicenseD extends Driver<Bus>{
    public LicenseD(String nameDriver, String licenseDriver, Double drivingExperience) {
        super(nameDriver, licenseDriver, drivingExperience);
    }


    @Override
    public void startMoving(Bus transport) {
        System.out.println("Водитель " + getNameDriver() + " участвует в заезде. Начал движение на грузовике "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }


    @Override
    public void endMoving(Bus transport) {
        System.out.println("Водитель " + getNameDriver() + " приехал на грузовике " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }


    @Override
    public void refuel(Bus transport) {
        System.out.println("Водитель " + getNameDriver() + " заправил грузовик " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void checkLicense() {
            if (getLicenseDriver() == null || getLicenseDriver().isBlank() || !Objects.equals(getLicenseDriver(), "D")){
                throw new RuntimeException("Необходимо указать категорию водительского удостоверения!");
            } else {
                System.out.println("Водительское удостоверение " + getNameDriver() + " соответствует.");
            }
    }

}
