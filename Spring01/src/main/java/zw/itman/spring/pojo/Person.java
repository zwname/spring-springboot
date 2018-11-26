package zw.itman.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


public class Person {
	
	private String name;
	
	private Car car;
	
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [姓名：" + name + ",小车：" + car + ", 年龄：" + age + "]";
	}

	public Person(String name, Car car, Integer age) {
		super();
		this.name = name;
		this.car = car;
		this.age = age;
	}

	public Person() {
		super();
	}
	
	public void say() {
		System.err.println("大家好，我叫："+this.name+"，今年："+this.age+"岁，这是我的车："+car);
	}
	
	public void init() {
		System.err.println("init person");
	}
	
	public void destroy() {
		System.err.println("destroy person");
	}

}