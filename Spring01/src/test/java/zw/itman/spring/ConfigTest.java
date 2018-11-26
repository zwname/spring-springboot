package zw.itman.spring;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bean.Config;
import bean.Haha;

public class ConfigTest {
	
	
	
	
	@Test
	public void configTest() {
		
	

		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Config.class);

			int i=con.getBeanDefinitionCount();
			System.err.println("============="+i);
			
			String[] names = con.getBeanDefinitionNames();
			for(String name:names) {
				System.err.println(name+"------");
				 
				 	Object bean = con.getBean(name);
				 	System.err.println(bean.getClass());
		}
			;
			System.err.println(con.getBean("haha",Haha.class).toString()+"111");
			
	}

}
