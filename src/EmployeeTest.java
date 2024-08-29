public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("David", 26, "AI", 200000);
        employee.displayEmployeeInfo();

        Manager manager = new Manager("John", 25, "Finance",300000,50000);
        manager.displayEmployeeInfo();

        employee.raiseSalary(0.1);
        manager.raiseSalary(0.1);

        employee.displayEmployeeInfo();
        manager.displayEmployeeInfo();
    }


}