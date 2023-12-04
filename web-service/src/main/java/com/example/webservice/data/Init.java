package com.example.webservice.data;

import com.example.webservice.model.MyUser;
import com.example.webservice.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Init {

    private final UserService userService;

    public Init(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void initialize(){
        this.userService.create(new MyUser("John", "Doe", 25, 42000.0));
        userService.create(new MyUser("Alice", "Johnson", 28, 35000.0));
        userService.create(new MyUser("David", "Williams", 35, 50000.0));
        userService.create(new MyUser("Emily", "Brown", 22, 30000.0));
        userService.create(new MyUser("Michael", "Miller", 40, 60000.0));
        userService.create(new MyUser("Olivia", "Jones", 32, 45000.0));
        userService.create(new MyUser("Daniel", "Davis", 27, 38000.0));
        userService.create(new MyUser("Sophia", "Moore", 31, 48000.0));
        userService.create(new MyUser("Matthew", "Martin", 29, 42000.0));
        userService.create(new MyUser("Ava", "Anderson", 26, 36000.0));
        userService.create(new MyUser("William", "White", 33, 55000.0));
        userService.create(new MyUser("Emma", "Wilson", 24, 32000.0));
        userService.create(new MyUser("James", "Taylor", 37, 52000.0));
        userService.create(new MyUser("Grace", "Thomas", 23, 34000.0));
        userService.create(new MyUser("Benjamin", "Walker", 38, 58000.0));
        userService.create(new MyUser("Lily", "Clark", 28, 37000.0));
        userService.create(new MyUser("Christopher", "Harris", 34, 49000.0));
        userService.create(new MyUser("Mia", "Lewis", 30, 40000.0));
        userService.create(new MyUser("Andrew", "Anderson", 31, 47000.0));
        userService.create(new MyUser("Ella", "Wright", 25, 33000.0));
        userService.create(new MyUser("Nicholas", "Young", 39, 60000.0));
        userService.create(new MyUser("Avery", "King", 27, 39000.0));
        userService.create(new MyUser("Joseph", "Ward", 36, 54000.0));
        userService.create(new MyUser("Madison", "Evans", 29, 43000.0));
        userService.create(new MyUser("Logan", "Baker", 26, 36000.0));
        userService.create(new MyUser("Chloe", "Hill", 32, 48000.0));
        userService.create(new MyUser("Ryan", "Cooper", 30, 41000.0));
        userService.create(new MyUser("Isabella", "Russell", 33, 51000.0));

    }
}
