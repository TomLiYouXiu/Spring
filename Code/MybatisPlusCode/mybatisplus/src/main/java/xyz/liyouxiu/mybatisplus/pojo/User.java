package xyz.liyouxiu.mybatisplus.pojo;

import lombok.Data;

/**
 * @author liyouxiu
 * @date 2022/11/9 13:55
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
