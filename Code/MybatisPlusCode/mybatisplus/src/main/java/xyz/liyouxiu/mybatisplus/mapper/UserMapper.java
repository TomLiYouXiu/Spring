package xyz.liyouxiu.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import xyz.liyouxiu.mybatisplus.pojo.User;

import java.util.Map;

/**
 * @author liyouxiu
 * @date 2022/11/9 13:56
 */
//标识为持久化组件
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据ID查询用户信息为map集合
     * @param id
     * @return
     */
    Map<String,Object> selectMapById(Long id);
}
