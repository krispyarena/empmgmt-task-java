
public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public void raiseSalary(double percentage){
        this.salary += salary * percentage;
    }
    public void displayEmployeeInfo(){
     System.out.println( "Name : " + this.name + "\nAge : " + this.age + "\nDepartment : " + this.department + "\nSalary : " + this.salary);
    }
    }