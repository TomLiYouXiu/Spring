package xyz.liyouxiu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author liyouxiu
 * @date 2022/11/3 11:00
 */
//@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
    private String name;
    private int age;
    private Pet pet;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
