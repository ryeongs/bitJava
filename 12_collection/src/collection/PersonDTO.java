package collection;
//���� Ŭ���� �ֵ鳢�� �� �ϱ⶧���� implements Comparable<PersonDTO>
public class PersonDTO implements Comparable<PersonDTO>{

	private int age;
	private String name;

	public PersonDTO(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return"�̸�:"+name+" ����: "+age;
	}
	@Override
	public int compareTo(PersonDTO dto) {
		if(age < dto.age) return -1;
		else if(age==dto.age) return 0;
		else return 1;
	}
	
	
}
