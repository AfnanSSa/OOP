/**Create a Java class named Car with attributes like make, model, and year.
 * Instantiate an object of this class and set values using a constructor.*/
package OOP;

public class Car {
    private String make;
    private String model;
    private Integer year;

    public Car(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
