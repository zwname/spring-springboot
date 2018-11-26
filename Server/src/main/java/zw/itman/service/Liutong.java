package zw.itman.service;

import zw.itman.Interface.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @Author: zhengwei  613295775@qq.com
 * @Date 2018/11/23 10:03
 */
@Component

@Profile({"liutong","zhengwei"})
public class Liutong implements Config {

    @Value("${name:name}")
    private String name;
    @Value("${hello:hello}")
    private String hello;
    @Override
    public String say() {
        return this.hello +" ----"+this.name;
    }
}
