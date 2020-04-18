import animals.Bird;
import animals.Cat;
import animals.Dog;
import animals.Runner;

public class AnimalsMain {
    public static void main(String[] args) {

        Dog dog = new Dog("Ares");
        Cat cat = new Cat("Kotek");

        Runner runner = dog;

        dog.saySomething();
        runner.count();

        Runner runner1 = new Runner() {
            @Override
            public void run() {
                System.out.println("biegnie!");
            }
        };

        runner1.run();


    }
}
