package zw.itman;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import zw.itman.Interface.Config;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	  @Autowired
	    private Config config;
	    @Test
	    public void contextLoads() {
	        System.err.println(config.say());

	    }
}
