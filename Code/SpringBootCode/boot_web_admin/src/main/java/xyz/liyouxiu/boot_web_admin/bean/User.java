package xyz.liyouxiu.boot_web_admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liyouxiu
 * @date 2022/11/7 9:44
 */
@Data
@AllArgsConstructor
public class User {
    private String userName;
    private String password;
}

