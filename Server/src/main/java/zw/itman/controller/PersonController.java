package zw.itman.controller;

import zw.itman.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    Person pp;

    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public String person(){
        return pp.toString();
    }
}
