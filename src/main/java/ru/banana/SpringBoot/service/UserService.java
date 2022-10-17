package ru.banana.SpringBoot.service;



import ru.banana.SpringBoot.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(int id, User user);
    void delete(int id);
}
