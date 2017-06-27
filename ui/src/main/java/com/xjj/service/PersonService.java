package com.xjj.service;

import com.xjj.domain.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * cloud-main-manager
 * Created by xian.juanjuan on 2017-6-26 14:48.
 */
@FeignClient("person") //使用person调用person server，person为服务名
public interface PersonService {
    @RequestMapping(method = RequestMethod.POST, value = "/save",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Person save(@RequestBody String name);
}
