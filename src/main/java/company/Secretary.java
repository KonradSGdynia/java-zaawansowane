package company;

import company.Employee;

public final class Secretary extends Employee {

    public Secretary(String name, int salary) {
        super(name, salary);
    }

    public void makeCall(String number){
        System.out.println("Dzwonie do " + number);
    }
}
