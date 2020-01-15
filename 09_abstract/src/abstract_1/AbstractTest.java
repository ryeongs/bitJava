package abstract_1;

public abstract class AbstractTest {//POJO (Plain Old Java Object)
	//추상 메소드가 있는 경우 무조건 추상클래스 
	//추상 클래스인 경우 메소드가 추상메소드일 필요는 없다
	
	 String name;
	
	public abstract void setName(String name);  //추상메소드 언제 생길지 모름 
	
	public String getName() {
		return name;
	}
}
