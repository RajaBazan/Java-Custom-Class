package hello.com;
class Employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("my name is :" + name);
        System.out.println("my id is :" + id);
        System.out.println("Sallary is " + salary);
    }
    public int getSalary(){
        return salary;
    }
}
public class Lec_38_Custom_class {
    public static void main(String[] args) {
        Employee name = new Employee(); // Instatiating a new employee Object
        // Setting attributes:
        name.id = 1;
        name.salary = 34000;
        name.name = "Raja Bazan";
        Employee Jibran = new Employee();
        Jibran.name = "Raja Jibran";
        Jibran.salary = 32000;
        Jibran.id = 2;
        // Printing the attributes
        name.printdetails();
        Jibran.printdetails();

//        int salary = name.salary;
//        int salary1 = Jibran.salary;
//        System.out.println(salary);
//        System.out.println(salary1);
//        System.out.println(name.name);
//        System.out.println("The id of Bazan is:" +  name.id   +  name.name);
//        System.out.println(Jibran.name);
//        System.out.println(Jibran.id);
    }
}