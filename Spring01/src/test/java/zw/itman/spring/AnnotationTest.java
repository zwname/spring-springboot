package zw.itman.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import zw.itman.spring.pojo.Car;

public class AnnotationTest {

	private AnnotationConfigApplicationContext con;
	
	@Before
	public void initContext() {
		con=new AnnotationConfigApplicationContext();
		con.scan("zw.itman.spring.pojo");
		con.refresh();
		con.registerShutdownHook();
		
		int i=con.getBeanDefinitionCount();
		System.err.println(i);
		
		String[] names = con.getBeanDefinitionNames();
		for(String name:names) {
			System.err.println(name+"------");
			 
			 	Object bean = con.getBean(name);
			 	System.err.println(bean.toString());
	}
	}
		
		
		
	
	@Test
	public void ts() {
		
		
		
		
}
}
