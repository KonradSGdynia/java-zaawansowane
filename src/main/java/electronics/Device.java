package electronics;

public abstract class Device {
    private String model;

    public Device(String model) {
        this.model = model;
    }

    public abstract void turnOn();
    public abstract void turnOff();

}
