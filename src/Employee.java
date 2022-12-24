import java.util.Objects;

public class Employee {
    private String fIO;
    private final long employeeID = counter;
    private static long counter = 1l;
    private double salary;
    private int department;

    public Employee(String fIO, double salary, int department) {
        this.fIO = fIO;
        this.salary = salary;
        if (isDepartment(department)) {
            this.department = department;
        }else{
            System.out.println("Данного отдела не существует");
        }
        counter++;
    }
    private boolean isDepartment (int department){
        if( department == 1 || department == 2 || department == 3 || department == 4 || department == 5 ){
            return true;
        }
        return false;
    }
    public String getfIO() {
        return fIO;
    }
    public void setfIO(String fIO) {
        this.fIO = fIO;
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
    @Override
    public String toString() {
        return "Сотрудник: " + fIO + '\'' + ", Табельный номер: " + employeeID + ", Заработная плата: " + String.format("%.2f",salary) + ", номер отдела: " + department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }
}