package xyz.liyouxiu.boot.boot_web_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liyouxiu
 * @date 2022/11/6 10:39
 */
@Controller
public class RequestController {

    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request){
        request.setAttribute("msg","成功");
        request.setAttribute("code",200);
        return "forward:/success"; //  转发到/success
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg") String msg,
                          @RequestAttribute("code") Integer code,
                          HttpServletRequest request){
        Map<String , Object> map = new HashMap<String,Object>();
        Object msg1 = request.getAttribute("msg");
        Object code1 = request.getAttribute("code");

        map.put("request_msg",msg1);
        map.put("request_code",code1);

        map.put("annotation_code",code);
        map.put("annotation_msg",msg);

        return map;
    }

//    <a href="/car/sell;low=34;brand=byd,audi,yd">@MatrixVariable</a>
    @ResponseBody
    @GetMapping("/car/{path}")
    public Map careSell(@MatrixVariable("low") Integer low,
                        @MatrixVariable("brand") List<String> brand,
                        @PathVariable("path") String path){

        Map<String , Object> map = new HashMap<String,Object>();
        map.put("low",low);
        map.put("brand",brand);
        map.put("path",path);
        return map;
    }

    // /boss/1;age=20/2;age=10
    @ResponseBody
    @GetMapping("/boss/{bossId}/{empId}")
    public Map boss(@MatrixVariable(value = "age",pathVar = "bossId") Integer bossAge,
                    @MatrixVariable(value = "age",pathVar = "empId") Integer empAge){
        Map<String,Object> map = new HashMap<>();

        map.put("bossAge",bossAge);
        map.put("empAge",empAge);
        return map;

    }
}
