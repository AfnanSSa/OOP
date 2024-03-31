/** Develop a program that demonstrates the use of constructors in a class named Book,
 * initializing attributes like title, author, and publicationYear.*/

package OOP;

public class Book {
    private String title;
    private String author;
    private Integer publicationYear;

    //Constructor
    public Book() {
    }

    //Setters and Gitter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }
}
