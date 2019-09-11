package cn.lnfvc.spring_test.web;


import cn.lnfvc.spring_test.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    PersonRepository personRepository;


    @RequestMapping(method = RequestMethod.GET,produces = )

}
