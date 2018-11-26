package zw.itman.controller;

import zw.itman.Interface.Config;
import zw.itman.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
  private User user;

    @Autowired
    private Config con;

    @RequestMapping("/hhh")
    public String Say(){
        return "姓名："+user.getName()+"，年纪："+user.getAge()+",性别："+user.getSex()+",电话："+user.getPhone();
    }

    @RequestMapping("/say")
    public String Say2(){
        return con.say();
    }
    @RequestMapping("/11")
    public String Sayq(){
        return con.say();
    }
}
