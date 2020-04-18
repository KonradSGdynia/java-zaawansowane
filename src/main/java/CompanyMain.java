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

        employees[0] = new Employee("Jan", 200);
        employees[1] = new Employee("Ola", 250);
        employees[2] = new Employee("Ala", 220);

        for (Employee employee: employees) {
            employee.show();
        }


    }
}
