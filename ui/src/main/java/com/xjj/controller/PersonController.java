package com.xjj.controller;

import com.xjj.domain.Person;
import com.xjj.service.PersonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * cloud-main-manager
 * Created by xian.juanjuan on 2017-6-26 16:54.
 */
@RestController
public class PersonController {

    @Autowired
    PersonHystrixService personHystrixService;

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public Person save(){
        return personHystrixService.save("xianjj");
    }
}
