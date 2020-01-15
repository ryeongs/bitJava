package Pro_ConstAssign;

public class MemberDTO {
	private String name;
	private int age;
	private String phone;
	private String address;
	

	public MemberDTO(String name2, int age2, String address2, String phone2) {
		this.name=name2;
		this.age=age2;
		this.address=address2;
		this.phone=phone2;	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}



}
