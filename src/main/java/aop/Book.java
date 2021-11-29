package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("AAAA")
    private String name;

    @Value("ivan")
    private String author;

    @Value("1866")
    private int yearOfPublic;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublic() {
        return yearOfPublic;
    }

    public String getName() {
        return name;
    }
}
