package java1;

public class j22oops {
    public static class employee{
        static int id;
        static String name;
        static void printdetails(){
            System.out.println("my id is " + id);
            System.out.println("my name is " + name);
        }
        static int salary;
        static int getsalary(){
            return employee.salary;
        }
    }
    public static void main(String[] args) {
        employee harry = new employee();
        harry.id = 001;
        harry.name = "Harry";
        harry.salary = 6000;
        harry.printdetails();
        int salary = harry.getsalary();
        System.out.println(salary);
    }
}
