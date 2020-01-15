package DataStream;

import java.io.Serializable;

public class PersonDTO implements Serializable{ //직렬화 -byte단위로 쪼개도록 도와주는것,추상메소드가 없다(no override)
	private String name;
	private int age;
	private double height;
	
	public PersonDTO(String name, int age, double height) {
		super();
		this.name=name;
		this.age=age;
		this.height=height;
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	
}
