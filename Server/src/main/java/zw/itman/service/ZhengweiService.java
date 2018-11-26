package zw.itman.service;

import zw.itman.Interface.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @Author: zhengwei  613295775@qq.com
 * @Date 2018/11/23 9:53
 */
@Component
@Profile({"defualt","wangwang"})
public class ZhengweiService implements Config {

    @Value("${name:zhengwei}")
    private String name;
    @Value("${hello:hello}")
    private String hello;

    @Override
    public String say() {
        return this.hello+",大家好，我是："+this.name;
    }
}
