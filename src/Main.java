import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        {
            employees[0] = new Employee("Иван Иванов Иванович", 10_000, 1);
            employees[1] = new Employee("Петр Петров Петрович", 10_000, 2);
            employees[2] = new Employee("Сидр Сидоров Сидорович", 10_000, 3);
            employees[3] = new Employee("Дмитрий Дмитриев Дмитриевич", 10_000, 4);
            employees[4] = new Employee("Василий Василенко Васильевич", 10_000, 5);
            employees[5] = new Employee("Роман Романов Романович", 10_000, 5);
            employees[6] = new Employee("Леонид Даниленко Леонидович", 10_000, 4);
            employees[7] = new Employee("Иван Грудов Иванович", 10_000, 3);
            employees[8] = new Employee("Виктор Орлов Викторович", 10_000, 2);
            employees[9] = new Employee("Вячеслав Рудаков Вячеславович", 10_000, 1);
            // Вывод на печать всех сотрудников
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
            //Вывод на печать всех сотрудников
            double sum = 0;
            for (int i = 0; i < employees.length; i++) {
                sum += employees[i].getSalary();
            }
            System.out.println(sum);
        }
        // Вывод на печать сотрудника с минимальной заработной платой
        double min = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                {
                    System.out.println(min);
                }
            }
            // Вывод на печать сотрудника с максимальной заработной платой
            double max = min;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                {
                    System.out.println(max);
                }
            }
        }
    }
}