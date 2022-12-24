public class Employee {
    public String fIO;
    private int employeeID;
    static int counter = 1;
    double salary;
    int department;
    public int getEmployeeID() {
        return employeeID;
    }
    public static int getCounter() {
        return counter;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public Employee(String fIO, int employeeID, double salary, int department) {
        this.fIO = fIO;
        this.employeeID = counter++;
        this.salary = salary;
        this.department = department;
    }
    public String toString() {
        return "сотрудник: " + fIO + " ID: " + employeeID + " Зароботная плата: " + salary + " номер отдела: " + department;
    }
    Employee work1 = new Employee(fIO, Employee.getCounter(), 10_000, 1);
    Employee work2 = new Employee(fIO, Employee.getCounter(), 20_000, 2);
    Employee work3 = new Employee(fIO, Employee.getCounter(), 30_000, 3);
    Employee work4 = new Employee(fIO, Employee.getCounter(), 40_000, 4);
    Employee work5 = new Employee(fIO, Employee.getCounter(), 50_000, 5);
}
