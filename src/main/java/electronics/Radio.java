package electronics;

public class Radio extends Device {
    public Radio(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.println("Włączono");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłączono");
    }

    public void changeChannel(int channel){
        System.out.println("ZMieniono na kanał " + channel);
    }
}
