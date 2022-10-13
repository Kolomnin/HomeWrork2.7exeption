package Task2;

public abstract class Driver<T extends Transport> {
    private final String nameDriver;
    private static String licenseDriver;
    private Double drivingExperience;

    protected Driver(String nameDriver, String licenseDriver, Double drivingExperience) {
        this.nameDriver = nameDriver;
        setLicenseDriver(licenseDriver);
        setDrivingExperience(drivingExperience);
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public String getLicenseDriver() {
        return licenseDriver;
    }

    public void setLicenseDriver(String licenseDriver) {
        if (licenseDriver == null || licenseDriver.isBlank()){
            this.licenseDriver = "У нет водительского удостоверения";
        } else {
            this.licenseDriver = licenseDriver;
        }
    }

    public Double getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(Double drivingExperience) {
        if (drivingExperience == null || drivingExperience < 0.0) {
            this.drivingExperience = 1.0;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }

    public abstract void startMoving(T transport);

    public abstract void endMoving(T transport);

    public abstract void refuel(T transport);

    public abstract void checkLicense();

    @Override
    public String toString() {
        return "Водитель " + nameDriver + ", категория прав: " + licenseDriver + ", стаж вождения: " + drivingExperience + " лет.";
    }
}