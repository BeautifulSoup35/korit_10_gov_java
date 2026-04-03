package study.ch12.ex.ex1_5;

public class Ex04 {
    public static void main(String[] args) {
        Employee employee = new Employee("김사원", 300);
        Manager manager = new Manager("박부장", 500, 1000);
        System.out.println(employee.getAnnualSalary());
        System.out.println(manager.getAnnualSalary());

    }
}

class Employee{
    String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    int getAnnualSalary() {
        return salary * 12;
    }
}

class  Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    int getAnnualSalary(){
        int salary = super.getAnnualSalary();
        return salary + bonus;
    }
}
