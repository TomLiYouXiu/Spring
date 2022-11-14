package xyz.liyouxiu.boot_web_admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.liyouxiu.boot_web_admin.bean.User;

import java.util.Arrays;
import java.util.List;

/**
 * @author liyouxiu
 * @date 2022/11/7 10:34
 */
@Controller
public class TableController {
    @GetMapping("/basic_table")
    public String basic_table() {
        return "table/basic_table";
    }

    //    dynamic_table.html
    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model) {
        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
                new User("lisi", "123444"),
                new User("haha", "aaaaa"),
                new User("hehe ", "aaddd"));
        model.addAttribute("users",users);
        return "table/dynamic_table";
    }

    //    responsive_table.html
    @GetMapping("/responsive_table")
    public String responsive_table() {
        return "table/responsive_table";
    }

    //    editable_table
    @GetMapping("/editable_table")
    public String editable_table() {
        return "table/editable_table";
    }
}
