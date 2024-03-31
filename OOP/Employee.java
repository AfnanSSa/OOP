/** Create a Java class named Employee with private attributes for name,
 * position, and salary. Write a method to display the employee's details.*/

package OOP;

public class Employee {
    private String employeeName;
    private String position;
    private Integer salary;

    //Setters and Getters

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
