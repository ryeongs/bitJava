package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{
	
	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		zoo.tiger();
		//zoo.giraffe(); -error �ڽ�Ŭ�������� �θ�Ŭ������ ������ �Ұ� 
		//�θ�Ŭ������ �ڽ�Ŭ������ �ִ��� �� �׷��� �ڽ�Ŭ������ �����ؼ� �����ؾ��� 
		System.out.println("_--------------");
		Safari safari=new Safari();//�ڽ�Ŭ������ �����ϸ� �θ� ���� ����
		safari.tiger();
		safari.giraffe();
	}

}
