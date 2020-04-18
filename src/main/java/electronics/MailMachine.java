package electronics;

public class MailMachine implements EmailSender {
    @Override
    public void sendEmail(String message) {
        System.out.println("Wysłano wiadomośc"+ message);
    }
}
