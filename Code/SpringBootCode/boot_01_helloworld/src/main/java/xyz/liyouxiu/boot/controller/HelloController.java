package xyz.liyouxiu.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.liyouxiu.boot.bean.Car;

/**
 * @author liyouxiu
 * @date 2022/11/3 9:17
 */
//@ResponseBody
//@Controller
//在springboot里@RestController整合了@ResponseBody和@Controller

@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Spring Boot 2 !";
    }
}
