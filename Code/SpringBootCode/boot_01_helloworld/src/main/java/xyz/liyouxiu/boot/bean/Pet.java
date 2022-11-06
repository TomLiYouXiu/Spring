package xyz.liyouxiu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author liyouxiu
 * @date 2022/11/3 11:02
 */
@AllArgsConstructor //无参构造器
@NoArgsConstructor  //全参构造器
@Data
@ToString
public class Pet {
    private String name;
    private Double weight;
}
