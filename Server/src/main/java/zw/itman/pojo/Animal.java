package zw.itman.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: zhengwei  613295775@qq.com
 * @Date 2018/11/23 9:19
 */

@Configuration
@Data
@ConfigurationProperties(prefix = "animal")
@PropertySource(value= "classpath:animal.properties")
public class Animal {
    private int id;
    private String name;
    private String type;

}
