package com.radouanex.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(
                new User(1, "Radouane-x", LocalDate.now().minusYears(20))
        );
        users.add(
                new User(2, "Radouane-y", LocalDate.now().minusYears(24))
        );
        users.add(
                new User(3, "Radouane-z", LocalDate.now().minusYears(30))
        );
    }

    public List<User> findAll() {
        return users;
    }

    public User findUserById(int id) {
        return users.stream().filter(
                user -> user.getId() == id
        ).findFirst().orElse(null);
    }

    public User save(User user) {
        user.setId(users.size() + 1);
        users.add(user);
        return user;
    }

    public void deleteUserById(int id) {
        users.removeIf(
                user -> user.getId().equals(id)
        );
    }
}
