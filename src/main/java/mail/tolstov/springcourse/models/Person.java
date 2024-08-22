package mail.tolstov.springcourse.models;


import javax.validation.constraints.*;

public class Person {
    private int id;
    @NotEmpty(message = "Поле ФИО не может быть пустым")
    @Size(min = 10, max = 50, message = "ФИО должно содержать от 10 до 50 символов")
    private String fullName;
    @Max(value = 3000)
    @Min(value = 1900)
    private int yearOfBirth;

    public Person() {
    }

    public Person(int id, String fullName, int yearOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Pattern(regexp = "\\s*[А-Я][а-я]+\\s[А-Я][а-я]+\\s*[А-Я]*[а-я]*\\s*", message = "Поле должно содержать Фамилию Имя и Отчество при его наличии, состоящих из кириллицы")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // @Pattern(regexp = "\\d{4}", message = "Год рождения должен состоять из четырех символов")
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
