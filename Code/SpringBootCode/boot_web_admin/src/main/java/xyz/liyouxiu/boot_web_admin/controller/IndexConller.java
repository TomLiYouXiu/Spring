package xyz.liyouxiu.boot_web_admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import xyz.liyouxiu.boot_web_admin.bean.User;

import javax.servlet.http.HttpSession;

/**
 * @author liyouxiu
 * @date 2022/11/6 16:52
 */
@Slf4j
@Controller
public class IndexConller {

    /**
     * index
     * @return
     */
    @GetMapping(value = {"/","login","/login"})
    public String loginPage(){
        return "login";
    }

    /**
     * 登录成功跳转到首页
     *
     */
    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())){
            //把登陆成功的用户保存起来
            session.setAttribute("loginUser",user);
            //登录成功重定向到main.html;  重定向防止表单重复提交
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误");
            //回到登录页面
            return "login";
        }
    }

    /**
     * 去main页面
     * @return
     */
    @GetMapping("/main.html")
    public String main(HttpSession session,Model model){
        log.info("当前方法是:{}，main");
        //是否登录，拦截器，过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser!=null){
//            return "main";
//        }else{
//            model.addAttribute("msg","请重新登录");
            return "main";

    }
}
