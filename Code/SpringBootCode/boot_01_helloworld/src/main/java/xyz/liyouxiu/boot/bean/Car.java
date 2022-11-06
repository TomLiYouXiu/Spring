package xyz.liyouxiu.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author liyouxiu
 * @date 2022/11/3 15:03
 */

/**
 * 只有在容器中的组件，才会拥有springboot提供的强大功能
 */
//@Component
@ToString
@Data
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;

}
