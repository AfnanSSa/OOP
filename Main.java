import OOP.*;

public class Main {

    public static void main(String[] args) {
        //Person Class
        Person person = new Person(); //instance

        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(35);

        System.out.println("\n::Details::");
        System.out.println("Full Name: " + person.getFirstName() + " " + person.getLastName()
                + "\nAge: " + person.getAge());

        //Car Class
        Car car = new Car("Jeep", "Wrangler", 2023); //instance

        System.out.println("\n::Car Details::");
        System.out.println("Make: " + car.getMake() +
                "\nModel: " + car.getModel() +
                "\nYear: " + car.getYear());


        //Rectangle Class
        Rectangle rectangle = new Rectangle(); //instance

        System.out.println("\n::Rectangle::");
        System.out.println("Rectangle Area: " + rectangle.rectangleArea(5, 3));
        System.out.println("Rectangle Perimeter: " + rectangle.rectanglePerimeter(5, 3));


        //Student Class
        Student student = new Student(); //instance

        student.setName("Noura");
        student.setAge(18);
        student.setGrade(98.3);

        System.out.println("\n::Student Details::");
        System.out.println("Student Name: " + student.getName() +
                "\nAge: " + student.getAge() +
                "\nGrade: " + student.getGrade());


        //BankAccount Class
        BankAccount bankAccount = new BankAccount(); //instance

        bankAccount.setOwnerName("Alice Smith");
        bankAccount.setAccountNumber("412346909753639");
        bankAccount.setBalance(10000.87);

        System.out.println("\n::Bank Account Details::");
        System.out.println("Name: " + bankAccount.getOwnerName());
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Current Balance:" + bankAccount.getBalance());
        System.out.println("Current Balance After Depositing 300.0: " + bankAccount.deposit(300.0));
        System.out.println("Current Balance After Withdrawing 50.0: " + bankAccount.deposit(50.0));


        //Book Class
        Book book = new Book();

        book.setTitle("Shadow of the Wind");
        book.setAuthor("Carlos Ruiz Zafón");
        book.setPublicationYear(2001);

        System.out.println("\n::Book Details::");
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publication Year: " + book.getPublicationYear());


        //Circle Class
        Circle circle = new Circle();

        circle.setRadius(1.5);
        circle.setColor("Blue");

        System.out.println("\n::Circle Details::");
        System.out.println("Color of th Circle: " + circle.getColor());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area of Circle: " + circle.circleArea(circle.getRadius()));


        //Employee Class
        Employee employee = new Employee();

        employee.setEmployeeName("Robert Downey");
        employee.setPosition("CEO");
        employee.setSalary(50000);

        System.out.println("\n::Employee Details::");
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Salary: " + employee.getSalary());


        //PersonDetails Class
        PersonDetails personDetails = new PersonDetails();

        System.out.println("\n::Person Details::");
        System.out.println("Full Name: " + personDetails.fullName("Jennifer ", "Lawrence"));
    }
}