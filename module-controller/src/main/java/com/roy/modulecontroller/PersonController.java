package com.roy.modulecontroller;

import com.roy.modulemodel.Person;
import com.roy.moduleservice.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/person",produces = "text/html;charset=utf-8")
public class PersonController {
    @Autowired
    private PersonService personService;



    @RequestMapping("/hi")
    public String sayHi(){
    Person person =new Person();
    person.setName("隔壁老王");
    return personService.sayHi(person);
    }
}
