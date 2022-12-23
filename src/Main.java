public class Main {
    public static void main(String[] args) {
        int employeeID = 1;
        Person person1 = new Person("Иван", "Иванов");
        Person person2 = new Person("Дмитрий", "Сидоров");
        Person person3 = new Person("Станислав", "Петров");
        Person person4 = new Person("Андрей", "Николов");
        Person person5 = new Person("Василий", "Битов");
        Employee work1 = new Employee(person1, employeeID,10_000, 1);
        Employee work2 = new Employee(person2, employeeID, 20_000, 2);
        Employee work3 = new Employee(person3, employeeID, 30_000, 3);
        Employee work4 = new Employee(person4, employeeID, 40_000, 4);
        Employee work5 = new Employee(person5, employeeID, 50_000, 5);
        System.out.println(work1);
        System.out.println(work2);
        System.out.println(work3);
        System.out.println(work4);
        System.out.println(work5);

    }
}