package xyz.liyouxiu.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.liyouxiu.mybatisplus.mapper.UserMapper;
import xyz.liyouxiu.mybatisplus.pojo.User;

import java.util.List;

/**
 * @author liyouxiu
 * @date 2022/11/14 15:14
 */
@SpringBootTest
public class MybatisPlusWrapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01(){
        //查询用户名包含a，年龄在20~30，邮件信息不为空
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","a").
                between("age",20,30).
                isNotNull("email");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);

    }

    @Test
    public void test02(){
        //查询用户信息，按照年龄的降序排序，若年龄相同，则按照id升序排序
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("age").
                orderByAsc("id");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);

    }

    @Test
    public void test03(){
        //删除邮箱地址为null的
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("email");
        int delete = userMapper.delete(queryWrapper);
        System.out.println(delete);

    }

    @Test
    public void test04(){
        //将年龄大于20(并且用户名含有a),，或者邮箱为null的用户进行修改
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("age",20).
                like("name","a").
                or().
                isNull("email");
        User user = new User();
        user.setName("小明");
        user.setEmail("5465456@qq.com");
        userMapper.update(user,queryWrapper);
    }

    @Test
    public void test05(){
        //将用户名中包含a并且（年龄大于20或邮箱为null）的用户信息修改
        //lambda表达式优先执行
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","a").
                and(i->i.gt("age",20).or().isNotNull("email"));
        User user = new User();
        user.setName("小yo");
        user.setEmail("5465456@qq.com");
        userMapper.update(user,queryWrapper);
    }

    @Test
    public void test06(){
        //查询用户名，年龄，邮箱信息
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("name","age","email");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }


}
