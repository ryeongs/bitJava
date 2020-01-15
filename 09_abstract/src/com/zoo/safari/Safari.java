package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{
	
	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		zoo.tiger();
		//zoo.giraffe(); -error 자식클래스에서 부모클래스를 접근이 불가 
		//부모클래스는 자식클래스가 있는줄 모름 그러니 자식클래스를 생성해서 접근해야함 
		System.out.println("_--------------");
		Safari safari=new Safari();//자식클래스로 생성하면 부모에 접근 가능
		safari.tiger();
		safari.giraffe();
	}

}
