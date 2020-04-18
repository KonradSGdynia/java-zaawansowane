package electronics;

public class Phone extends Device implements EmailSender{
    private String number;

    public Phone(String model) {
        super(model);
    }

    public Phone(String model, String number) {
        super(model);
        this.number = number;
    }

    @Override
    public void turnOn() {
        System.out.println("Włączono");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłączono");
    }

    public void makeCall(String number){
        System.out.println("Zadzwoniono na numer"+ number);
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Phone - wiadomosc"+message);
    }
}
