package xyz.liyouxiu.boot_web_admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import xyz.liyouxiu.boot_web_admin.interceptor.LoginInterceptor;

/**
 * @author liyouxiu
 * @date 2022/11/7 15:05
 */

/**
 * 1.编写一个拦截器实现HandlerInterceptor接口
 * 2.拦截注册到容器中（实现WebMvcConfigurer的addInterceptors）
 * 3.指定拦截规则（如果拦截所有静态资源也会被拦截）
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")  //所有请求都会被拦截，包括静态资源
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");
    }
}
