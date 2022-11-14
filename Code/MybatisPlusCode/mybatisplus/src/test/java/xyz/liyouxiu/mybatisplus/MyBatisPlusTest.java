package xyz.liyouxiu.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.liyouxiu.mybatisplus.mapper.UserMapper;
import xyz.liyouxiu.mybatisplus.pojo.User;
import xyz.liyouxiu.mybatisplus.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author liyouxiu
 * @date 2022/11/9 13:57
 */
@SpringBootTest
public class MyBatisPlusTest {
    @Resource
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    /**
     * 测试查询所有数据
     */
    @Test
    void testSelectList(){
        //通过条件构造器查询一个list集合，若没有条件，则可以设置null为参数
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    /**
     *
     */
    @Test
    public void testInsert(){
//        User user = new User();
//        user.setName("张三");
//        user.setAge(15);
//        user.setEmail("4654654@qq.com");
//        int insert = userMapper.insert(user);
//        System.out.println(insert);
        Map<String, Object> map = userMapper.selectMapById(1l);
        System.out.println(map);
    }

    @Test
    public void testService(){
//        long count = userService.count();
//        System.out.println(count);
        ArrayList<User> list = new ArrayList<>();
        for (int i = 0; i <=10 ; i++) {
            User user = new User();
            user.setName("lwl"+i);
            user.setAge(20+i);
            list.add(user);
        }
        boolean b = userService.saveBatch(list);
        System.out.println(b);
    }
}
