/**Develop a program that defines a class named Rectangle with private attributes for
 * length and width. Include methods to calculate the area and perimeter of the rectangle.*/

package OOP;

public class Rectangle {
    private Integer length;
    private Integer width;

    //constructor
    public Rectangle() {
    }


    //method to calculate area of rectangle
    public  Integer rectangleArea(Integer length, Integer width){
        return length * width;
    }

    //method to calculate perimeter of rectangle
    public  Integer rectanglePerimeter(Integer length, Integer width){
        return 2 * (length + width);
    }
}
