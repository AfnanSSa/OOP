/**Write a Java class called Student with private attributes for name, age, and grade.
 * Include a method to display the student's information.*/
package OOP;

public class Student {
    private String name;
    private Integer age;
    private  Double grade;

    //Setters & Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
