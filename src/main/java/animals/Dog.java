package animals;

public class Dog extends Animal implements Runner {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println("HOW HOW");

    }

    @Override
    public void run() {
        System.out.println("HOPS HOPS");
    }



}
