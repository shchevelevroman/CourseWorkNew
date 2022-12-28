import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
public class Main {

    public static Employee[] employees = new Employee[10];

    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }

    public static double getAllSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static int getMaxSalary(Employee[] employees) {
        double max = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                count = i;
            }
        }
        return count;
    }
    public static int getMinSalary (Employee[] employees){
        double min = employees[0].getSalary();
        int count = 0;
        for (int i =0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                count = i;
            }
        }
        return count;
    }
    public static  void printMiddleSalary (Employee [] employees){
        double middleSalary = 0;
        middleSalary = getAllSalary(employees) / employees.length;
        System.out.println(middleSalary);
    }
    public static void printFIOEmployees (Employee[] employees){
        for (Employee employee : employees) {
            System.out.println(employee.getfIO());
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];{
            employees[0] = new Employee("Иван Иванов Иванович", 20_000, 1);
            employees[1] = new Employee("Петр Петров Петрович", 80_000, 2);
            employees[2] = new Employee("Сидр Сидоров Сидорович", 70_000, 3);
            employees[3] = new Employee("Дмитрий Дмитриев Дмитриевич", 10_000, 4);
            employees[4] = new Employee("Василий Василенко Васильевич", 60_000, 5);
            employees[5] = new Employee("Роман Романов Романович", 50_000, 5);
            employees[6] = new Employee("Леонид Даниленко Леонидович", 30_000, 4);
            employees[7] = new Employee("Иван Грудов Иванович", 100_000, 3);
            employees[8] = new Employee("Виктор Орлов Викторович", 110_000, 2);
            employees[9] = new Employee("Вячеслав Рудаков Вячеславович", 125_000, 1);
        }
        //Вывод на печать всех сотрудников
        System.out.println("Вывод на печать всех сотрудников:");
        System.out.println("");
        printAllEmployees(employees);
        //Вывод на печать общей суммы зароботной платы
        System.out.print("Вывод на печать общей суммы зароботной платы: ");
        double allSalary = getAllSalary(employees);
        System.out.println(allSalary);
        // Вывод на печать сотрудника с максимальной заработной платой
        System.out.print("Вывод на печать сотрудника с максимальной заработной платой: ");
        int max = getMaxSalary(employees);
        System.out.println(employees[max]);
        // Вывод на печать сотрудника с минимальной заработной платой
        System.out.print("Вывод на печать сотрудника с минимальной заработной платой: ");
        int min = getMinSalary(employees);
        System.out.println(employees[min]);
        //Вывод на печать общей суммы зароботной платы
        System.out.print("Вывод на печать средней заработной платы: ");
        printMiddleSalary(employees);
        //Вывод ФИО всех сотрудников
        System.out.println("Вывод ФИО всех сотрудников:");
        printFIOEmployees(employees);
        //Индексация зарплат сотрудников
        System.out.println("Индексация зарплат сотрудников");
    }
}
