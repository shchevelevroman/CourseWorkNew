public class test {
    public static int amountSalaryOfAllEmployee(Employee[] employees) {
        int sum = 0;
        for (Employee w : employees) {
            if (w != null) {
                sum += w.getSalary();
            }
        }
        return sum;
        System.out.println(employees[w]);
    }
}
