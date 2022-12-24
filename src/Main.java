import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван Иванов Иванович", Employee.getCounter(), 10_000, 1);
        employees[1] = new Employee("Петр Петров Петрович", Employee.getCounter(), 10_000, 2);
        employees[2] = new Employee("Сидр Сидоров Сидорович", Employee.getCounter(), 10_000, 3);
        employees[3] = new Employee("Дмитрий Дмитриев Дмитриевич", Employee.getCounter(), 10_000, 4);
        employees[4] = new Employee("Василий Василенко Васильевич", Employee.getCounter(), 10_000, 5);
        employees[5] = new Employee("Роман Романов Романович", Employee.getCounter(), 10_000, 5);
        employees[6] = new Employee("Леонид Даниленко Леонидович", Employee.getCounter(), 10_000, 4);
        employees[7] = new Employee("Иван Грудов Иванович", Employee.getCounter(), 10_000, 3);
        employees[8] = new Employee("Виктор Орлов Викторович", Employee.getCounter(), 10_000, 2);
        employees[9] = new Employee("Вячеслав Рудаков Вячеславович", Employee.getCounter(), 10_000, 1);
    }
        public Employee printAllUsers(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
