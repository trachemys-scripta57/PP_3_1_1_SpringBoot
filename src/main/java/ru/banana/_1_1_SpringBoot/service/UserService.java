package ru.banana._1_1_SpringBoot.service;



import ru.banana._1_1_SpringBoot.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(int id, User user);
    void delete(int id);
}
