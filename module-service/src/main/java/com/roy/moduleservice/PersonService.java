package com.roy.moduleservice;

import com.roy.modulemodel.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public String sayHi(Person person){
        return person.getName()+"say hi";
    }
}
