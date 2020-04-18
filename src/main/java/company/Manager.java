package company;

public class Manager extends Employee {
    private  int bonus;
    private  Secretary secretary;

    public Manager(String name, int salary) {
        super(name, salary);
        this.bonus = 0;
    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void makeSpeech(){
        System.out.println("Do pracy!");
    }

    public void makeSpeech(String additionalMessage){
        this.makeSpeech();
        System.out.println(additionalMessage);
    }


    @Override
    public int getSalary() {
       // return super.getSalary() + bonus;  gdy private
        return salary+bonus; // gdy protected
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public  void makeCall(String number){
        if(this.secretary==null){
            System.out.println("Nie umiem dzwonić!");
        }else{
            this.secretary.makeCall(number);
        }
    }
}
