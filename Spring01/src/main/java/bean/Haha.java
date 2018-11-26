package bean;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Haha {
	
	@Autowired
	//@Inject
	private Person person;
	@Autowired
	//@Inject
	private Car car;
	
	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Haha [person=" + person + ", car=" + car + "]";
	}
	
	

}
