package zw.itman.controller;

import zw.itman.pojo.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhengwei  613295775@qq.com
 * @Date 2018/11/23 9:24
 */
@RestController
public class AnimalController {

    @Autowired
    private Animal an;

    @RequestMapping("/animal")
    public String animal(){
        return an.toString();
    }

}
