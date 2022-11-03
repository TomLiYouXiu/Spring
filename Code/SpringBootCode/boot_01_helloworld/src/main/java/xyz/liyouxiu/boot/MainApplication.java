package xyz.liyouxiu.boot;

import ch.qos.logback.core.db.DBHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import xyz.liyouxiu.boot.bean.Pet;
import xyz.liyouxiu.boot.bean.User;
import xyz.liyouxiu.boot.config.MyConfig;

/**
 * @author liyouxiu
 * @date 2022/11/3 9:12
 */

/**
 * 主程序类，所有程序启动的入口
 * 这是一个springboot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //1.返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2.查看容器里面的组件
//        String[] names=run.getBeanDefinitionNames();
//
//        for (String name : names) {
//            System.out.println(name);
//        }

        //3.从容器中获取组件
//        Pet tom01 = run.getBean("tom",Pet.class);
//
//        Pet tom02 = run.getBean("tom",Pet.class);
//
//        System.out.println("组件："+(tom01==tom02));
//
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//
//        //如果@Configuration(proxyBeanMethods=true)代理对象调用方法。Springboot总会检查这个组件是否存在
//        //保持组件单实例
//        User user01 = bean.user01();
//
//        User user02 = bean.user01();
//
//        System.out.println(user01==user02);
//
//
//        User user = run.getBean("user01", User.class);
//        Pet tom = run.getBean("tom", Pet.class);
//
//        System.out.println("用户的宠物："+(user.getPet() == tom));
//
//        //获取组件
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        System.out.println("=========================================================");
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
//        DBHelper bean1 = run.getBean(DBHelper.class);
//        System.out.println(bean1);
        System.out.println(run.containsBean("tom"));
        System.out.println(run.containsBean("user01"));
        System.out.println("haha:"+run.containsBean("haha"));
        System.out.println("haha:"+run.containsBean("hehe"));
    }
}
