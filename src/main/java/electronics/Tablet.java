package electronics;

public class Tablet extends Device implements EmailSender {
    private String message;

    public Tablet(String model) {
        super(model);
    }

    public Tablet(String model, String message) {
        super(model);
        this.message = message;
    }

    @Override
    public void turnOn() {
        System.out.println("On");
    }

    @Override
    public void turnOff() {
        System.out.println("Off");
    }

    public void sendMessage(String message){
        System.out.println("Wiadomosc: "+message);
    }

    @Override
    public void sendEmail(String message) {
        sendMessage(message);
    }
}
