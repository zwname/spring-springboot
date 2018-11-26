package zw.itman.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Car {
	@Value("轿车")
	private String type;
	@Value("奔驰")
	private String name;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car() {
	}

	public Car(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "[类型是：" + type + ",车名是：" + name + "]";
	}

	public void say() {
		System.err.println("类型是："+type+",品牌是："+name);
	}

	public void init() {
		System.err.println("init car");
	}
	
	public void destry() {
		System.err.println("init car");
	}
}
