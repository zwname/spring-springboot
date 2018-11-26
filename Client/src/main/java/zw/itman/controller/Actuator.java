package zw.itman.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhengwei  613295775@qq.com
 * @Date 2018/11/23 14:31
 */
@RestController
public class Actuator {
    private static final Logger logger= LoggerFactory.getLogger(Actuator.class);

    @RequestMapping("/admin")
    public String get(){
        logger.trace("你是狗狗");
        logger.error("你是猪猪");
        logger.debug("你是羊羊");
        logger.info("你是喵喵");
        logger.warn("你是傻逼");
        return "admin";
    }


}
