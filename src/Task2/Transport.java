package Task2;

public abstract class Transport implements Сompeting{
    private final String brand;
    private final String model;
    private Double engineVolume;

    public Transport(String brand, String model, Double engineVolume) {

        if (isNullOfEmpty(brand)) {
            this.brand = "no information";
        } else {
            this.brand = brand;
        }

        if (isNullOfEmpty(model)) {
            this.model = "no information";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume == null || engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public abstract void startMoving();

    public abstract void endMoving();

    public boolean passDiagnostics() throws DiagnosticsException {
        return false;
    }



//    public Integer getProductionYear() {
//        return productionYear;
//    }
//
//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color == null || color.isBlank()) {
//            this.color = "белый";
//        } else {
//            this.color = color;
//        }
//    }
//
//    public Integer getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(Integer maxSpeed) {
//        if (maxSpeed == null || maxSpeed <= 0) {
//            this.maxSpeed = 180;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
//    }

//    public String getFuel() {
//        return fuel;
//    }


    //    public abstract void refill();
//
    public static boolean isNullOfEmpty(String value) {
        return value == null || value.isBlank();
    }

}
