public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int age, String department, double salary, double bonus) {
        super(name, age, department, salary);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculateTotalSalary() {
        return getSalary() + bonus;
    }

    @Override
    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Bonus: " + getBonus());
        System.out.println("Salary: " + calculateTotalSalary());

    }
}