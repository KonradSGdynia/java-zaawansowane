import company.Employee;
import company.Manager;

public class CompanyMain {

    public static void main(String[] args) {
        Employee jan = new Employee("Jan", 200);
        Manager kamil = new Manager("Kamil", 250, 30);

        System.out.println("Jan zarabia "+jan.getSalary());
        System.out.println("Kamil zarabia "+kamil.getSalary());

        kamil.makeSpeech();
        System.out.println("---");

        Employee[] employees = new Employee[3];
    }
}
