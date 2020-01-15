package nested;

public class AbstractMain {
	
	
	public static void main(String[] args) {
		AbstractTest at=new AbstractTest(){
			@Override
			public void setName(String name) {
				this.name=name;
			}
		};//{}를 사용해서 override를 할 슈 있다
		InterA aa =new InterA() { // InterA 뒤에 {}를 new한것
			public void aa() {} //절대 인터페이스 new한거 아님!!!!!
			public void bb() {}
		};
		AbstractExam ae=new AbstractExam() {}; 
		// 오버라이드 해도되고 안해도된다 - 선택적
	}

}
