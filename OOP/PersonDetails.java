/** Write a Java class named PersonDetails with private attributes for firstName
 * and lastName. Include a method to concatenate and return the full name.*/
package OOP;

public class PersonDetails {
    private String firstName;
    private String lastName;


    //Setters and Getters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //method to concatenate first name and last name and return full name
    public String fullName(String fName, String lName){
        return fName + " " + lName;
    }
}
