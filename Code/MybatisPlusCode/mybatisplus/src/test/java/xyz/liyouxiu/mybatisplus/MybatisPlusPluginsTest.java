package xyz.liyouxiu.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.liyouxiu.mybatisplus.mapper.UserMapper;
import xyz.liyouxiu.mybatisplus.pojo.User;

/**
 * @author liyouxiu
 * @date 2022/11/14 17:07
 */
@SpringBootTest
public class MybatisPlusPluginsTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testPage(){
        Page<User> page = new Page<>(1,3);
        userMapper.selectPage(page,null);
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());

    }
}
