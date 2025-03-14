package com.example.demo.users;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class Demouser {

    private Long id;
    private String name;
    private String email;
    private String password;

    public Demouser(Long id,
                    String name,
                    String email,
                    String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}





