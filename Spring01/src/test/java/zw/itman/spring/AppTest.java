package zw.itman.spring;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import zw.itman.spring.pojo.Car;
import zw.itman.spring.pojo.Person;

public class AppTest {

	private AbstractApplicationContext con;
	
	//基于配置文件的测试
@Test
public void Ptest() {
	con=new FileSystemXmlApplicationContext("classpath:person.xml");
	int i = con.getBeanDefinitionCount();
	System.err.println("bean的个数是："+i);
	con.getBean("person",Person.class).say();
	con.getBean("car",Car.class).say();
	con.registerShutdownHook();
	}
	
	
//基于注解配置的测试
@Test
public void Ctest() {
	con=new FileSystemXmlApplicationContext("classpath:car.xml");
	int i = con.getBeanDefinitionCount();
	System.err.println("bean的个数是："+i);
	//con.getBean("person",Person.class).say();
	con.getBean("car",Car.class).say();
	con.registerShutdownHook();
	}
	
}


