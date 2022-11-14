package xyz.liyouxiu.boot.boot_web_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liyouxiu
 * @date 2022/11/6 16:21
 */
@Controller
public class ViewTestController {

    @GetMapping("/liyouxiu")
    public String liyouxiu(Model model) {
        //model中的数据会自动放入请求域中 request.setAttribute("xxx",xxx);
        model.addAttribute("msg","你好  优秀");
        model.addAttribute("link","https://www.bilibili.com/video/BV19K4y1L7MT?p=43&vd_source=22b7dd3c404bbcce751f278c956b0e5f");
        return "success";
    }

}
