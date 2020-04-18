import company.Employee;
import company.Manager;
import company.Secretary;
import company.SuperSecretary;

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
        employees[1] = new Manager("Ola", 250);
        employees[2] = new Secretary("Ala", 220);

        for (Employee employee: employees) {
            employee.show();
        }

        System.out.println("--------------------");

        Secretary secretary = (Secretary) employees[2];
        SuperSecretary superSecretary = new SuperSecretary("Kamila", 200);


        kamil.setSecretary(new SuperSecretary("Kamila", 300));
        kamil.makeCall("888-444-556");

        kamil.setSecretary(secretary);
        kamil.makeCall("888-444-556");

        kamil.setSecretary(superSecretary);
        kamil.makeCall("888-777-999");
    }
}
