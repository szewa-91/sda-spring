package pl.marcinszewczyk.carmanager.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.marcinszewczyk.carmanager.users.CarManagerUser;
import pl.marcinszewczyk.carmanager.users.UserService;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody CarManagerUser user) {
        userService.addUser(user);
    }
}
