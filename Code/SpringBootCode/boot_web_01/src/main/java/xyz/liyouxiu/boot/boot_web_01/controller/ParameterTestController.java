package xyz.liyouxiu.boot.boot_web_01.controller;

import org.springframework.boot.web.server.Cookie;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liyouxiu
 * @date 2022/11/6 9:18
 */

/**
 * 测试基本注解
 */
@RestController
public class ParameterTestController {

    //car/1
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getcar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String username,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam("age") Integer age,
                                     @RequestParam("inters") List<String> inters,
                                     @RequestParam Map<String,String> params,
                                     @CookieValue("Idea-f5807ad") String Ideaf5807ad
//                                     @CookieValue("tenantId") Cookie cookie
                                     ) {
        Map<String , Object> map = new HashMap<String,Object>();
//        map.put("id",id);
//        map.put("username",username);
//        map.put("pv",pv);
//        map.put("userAgent",userAgent);
//        map.put("header",header);
//        map.put("age",age);
//        map.put("inters",inters);

        map.put("params",params);
        map.put("Idea-f5807ad",Ideaf5807ad);
//        System.out.println(cookie);
        return map;
    }

    @PostMapping("/save")
    public Map postMethod(@RequestBody String content){
        Map<String , Object> map = new HashMap<String,Object>();
        map.put("content",content);
        return map;
    }
}
