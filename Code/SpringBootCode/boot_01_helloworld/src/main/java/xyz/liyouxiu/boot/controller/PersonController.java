package xyz.liyouxiu.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.liyouxiu.boot.bean.Person;

/**
 * @author liyouxiu
 * @date 2022/11/4 14:51
 */
@RestController
public class PersonController {

    @Autowired
    Person person;

    @RequestMapping("/per")
    public Person person() {
        return person;
    }
}
