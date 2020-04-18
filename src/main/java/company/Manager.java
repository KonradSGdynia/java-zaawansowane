package company;

public class Manager extends Employee {
    private  int bonus;

    public Manager(String name, int salary) {
        super(name, salary);
        this.bonus = 0;
    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void makeSpeech(){
        System.out.println("Przemowa motywująca");
    }

    public void makeSpeech(String additionalMessage){
        this.makeSpeech();
        System.out.println(additionalMessage);
    }


    @Override
    public int getSalary() {
        return super.getSalary() + bonus;
    }
}
