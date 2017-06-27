package com.xjj.controller;

import com.xjj.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * cloud-main-manager
 * Created by xian.juanjuan on 2017-6-26 14:16.
 */
@RestController
public class PersonController {

    @Value("${my.message}")
    private String message;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Person savePerson(@RequestBody String name){
        Person person = new Person(name);
        System.out.println(message);
        return person;
    }
}
