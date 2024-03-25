public class Tricky {
    public static void main(String[] args) {
//        System.out.println("employee: mailId: Role:");
    }
}
class Employee{
    int noOfPages= 0;
    private Employee(){}
    public Employee(String name, String mail, String role, String description, int noOfPages){

        System.out.println("Employee Name: "+ name +"\nMailId: "+mail+"\nRole: "+role+"\nJob Description: "+description+"\nNo of pages printed: "+ noOfPages +"\n\n");
    }

    public static void main(String[] args) {
        int noOfPages = 0;
        Employee e1 = new Employee("james", "james@gmail.com", "boss", "being the boss",++noOfPages);
        Employee e2 = new Employee("akshay", "akshay@gmail.com", "assistant", "being the assistant",++noOfPages);
        Employee e3 = new Employee("siddharth", "sd@gmail.com", "developer", "being the developer",++noOfPages);
        Employee e4 = new Employee("keerthana", "keerthana@gmail.com", "tester", "being the tester",++noOfPages);
    }
}