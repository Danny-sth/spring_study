package AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Преступление и наказание")
    private String name;

    @Value("Ф.М.Достоевский")
    private String author;

    public String getAuthor() {
        return author;
    }

    @Value("1866")
    private int yearOfPublication;

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getName() {
        return name;
    }
}
