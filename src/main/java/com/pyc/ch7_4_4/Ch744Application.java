package com.pyc.ch7_4_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch744Application {
    @RequestMapping(value = "/search", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person search(String personName){
        return new Person(personName,32,"guangdong");
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch744Application.class, args);
    }

}
