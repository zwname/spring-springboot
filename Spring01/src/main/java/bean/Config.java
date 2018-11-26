package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages= {"bean"})
public class Config {

	@Bean(value="haha")
	@Primary
	public Haha hh() {
		Haha hhh=new Haha();
		hhh.setPerson(pp());
		hhh.setCar(cc());
		//hhh.setCar(car);
		return hhh;
		
	}
	
	@Bean
	@Primary
	public Person pp() {
		Person ppp=new Person();
		ppp.setAge(23);
		ppp.setName("李四");
		System.err.println(ppp+"123");
		return ppp;
	}
	
	@Bean
	@Primary
	public Car cc() {
		Car car=new Car();
		car.setName("大众");
		System.err.println(car+"234");
		return car;
	}

}
