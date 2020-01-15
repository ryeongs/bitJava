package constructor;

public class MemberDTO {
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	private String name;
	private int age;
	private String address;
	private String phone;
	
	public MemberDTO(String name, int age, String address, String phone) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.phone=phone;
	}
}
