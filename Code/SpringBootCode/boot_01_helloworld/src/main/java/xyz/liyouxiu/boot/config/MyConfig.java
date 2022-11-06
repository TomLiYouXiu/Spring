package xyz.liyouxiu.boot.config;

import ch.qos.logback.core.db.DBHelper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import xyz.liyouxiu.boot.bean.Car;
import xyz.liyouxiu.boot.bean.Pet;
import xyz.liyouxiu.boot.bean.User;

/**
 * @author liyouxiu
 * @date 2022/11/3 11:03
 */

/**
 * 1.配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods : 代理bean的方法
 *          FULL(proxyBeanMethods=true),
 *          Lite(proxyBeanMethods=false)
 *          组件依赖
 * 4.@Import({User.class, DBHelper.class})
 *          给容器中自动创建出这两个类型的组件,默认组件的名字就是全类名
 * 5.@ImportResource("classpath:beans.xml") 导入spring的配置文件
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods=true)  //这是一个配置类 == 配置文件
@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties(Car.class)
//1.开启car的配置绑定功能
//2.把这个car自动注册到容器中
public class MyConfig {
    /**
     * 外部无论对配置类中的这个组件注册方法中调用多少次获取的都是之前注册容器中的单实例对象
     * @return
     */
    @ConditionalOnBean(name="tom")
    @Bean  //给容器中添加组件。以方法名作为组件的id，返回类型就是组件的类型，返回的值就是组件在容器中的实例
    public User user01(){
        User zhangsan = new User("zhangsan", 18);
        //user组件依赖了pet组件
//        zhangsan.setPet(tomcat());
        return zhangsan;
    }

//    @Bean("tom")
//    public Pet tomcat(){
//        return new Pet("tomcat");
//    }


}
