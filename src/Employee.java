public class Employee{
        Person person;
        private int employeeID;
        static int counter = 1;
        double salary;
        int department;

        public Employee(Person person, int employeeID,double salary,int department){
            this.person = person;
            this.employeeID = counter ++;
            this.salary = salary;
            this.department = department;

        }
        public String toString(){
            return "сотрудник: " + person + " ID: " + employeeID + " Зароботная плата: " + salary + " номер отдела: " + department;
        }

    }
