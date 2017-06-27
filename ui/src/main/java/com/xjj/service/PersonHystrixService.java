package com.xjj.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xjj.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * cloud-main-manager
 * Created by xian.juanjuan on 2017-6-26 14:57.
 */
@Service
public class PersonHystrixService {

    @Autowired
    PersonService personService;

    //使用HystrixCommand的fallbackMethod参数指定，当本方法调用失败时调用后路方法fallbackSave
    @HystrixCommand(fallbackMethod = "fallbackSave")
    public Person save(String name){
        return personService.save(name);
    }

    public Person fallbackSave(String name){
        Person person = new Person(name+"person service 异常");
        return person;
    }
}
