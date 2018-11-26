package zw.itman.spring;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HahaTest {

	@Test
	public void HahaTest() {
		
	

		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext();
			con.scan("bean");
			con.refresh();
			con.registerShutdownHook();
			
			int i=con.getBeanDefinitionCount();
			System.err.println("============="+i);
			
			String[] names = con.getBeanDefinitionNames();
			for(String name:names) {
				System.err.println(name+"------");
				 
				 	Object bean = con.getBean(name);
				 	System.err.println(bean.toString());
		}
	}

}
