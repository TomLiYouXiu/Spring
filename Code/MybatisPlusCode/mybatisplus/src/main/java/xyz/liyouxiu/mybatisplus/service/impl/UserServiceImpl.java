package xyz.liyouxiu.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.liyouxiu.mybatisplus.mapper.UserMapper;
import xyz.liyouxiu.mybatisplus.pojo.User;
import xyz.liyouxiu.mybatisplus.service.UserService;

/**
 * @author liyouxiu
 * @date 2022/11/14 9:41
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
