package com.example.demo.models;

import com.example.demo.users.Demouser;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class user1 {

    @GetMapping("/helloWorld")
    public List<Demouser> helloWorld(){
        List.of(
                new Demouser[
                        id;:2,
                        name;:"asda",

                        ],
        );

    }

}
