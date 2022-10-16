package ru.banana._1_1_SpringBoot.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "\"user\"")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Поле Имя не может быть пустым")
    @Size(min = 2, max = 30, message = "Имя должно иметь от 2 до 30 символов")
    @Column(name = "name")
    private String name;

    @Min(value = 0, message = "Возраст должен быть больше чем 0")
    @Max(value = 150, message = "Нужен возраст человека, а не баобаба")
    @Column(name = "age")
    private int age;

    @Column(name = "email")
    @NotEmpty(message = "Поле email необходимо заполнить")
    @Email(message = "Введите действующий адрес")
    private String email;

    public User() {
    }

    public User(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
