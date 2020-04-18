package company;

public class SuperSecretary extends  Secretary {

    public SuperSecretary(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void makeCall(String number) {
        System.out.println(" Super sekretarka Dzwonie do" + number);
        System.out.println("I robię kawę!");
    }
}
