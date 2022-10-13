package Task2;


public class Bus extends Transport implements Сompeting {
    public Bus(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void pitStop() {
        System.out.println("Я на Пит-Стопе 20 сек");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга 3 мин. 30 сек.");
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость 100 км/ч");
    }

    @Override
    public String toString() {
        return "Автобус: " +
                "\nмарка " + getBrand() +
                ",\nмодель " + getModel() +
                ",\nобъем двигателя " + getEngineVolume();
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус отправился от остановки");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус прибыл на конечную остановку");
    }

    @Override
    public boolean passDiagnostics() throws DiagnosticsException {
        throw new DiagnosticsException("Buses do not pass diagnostics");

    }
}
