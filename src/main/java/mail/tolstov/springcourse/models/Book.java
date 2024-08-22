package mail.tolstov.springcourse.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message = "Поле Название книги не может быть пустым")
    @Size(min = 1, max = 255, message = "Название книги должно содержать от 1 до 255 символов")
    private String name;

    @NotEmpty(message = "Поле Автор не может быть пустым")
    @Size(min = 1, max = 255, message = "Поле Автор должно содержать от 1 до 255 символов")
    private String author;


    @Min(value = 0)
    @Max(value = 3000)
    private int year;

    public Book() {
    }

    public Book(int id, String name, String author, int year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
