/** Implement a class called Circle with private attributes for radius and color.
 * Include a method to calculate the area of the circle.*/

package OOP;

public class Circle {
    private Double radius;
    private String color;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //method to calculate circle area
    public Double circleArea(Double radius){
        return Math.PI * radius * radius;
    }
}
