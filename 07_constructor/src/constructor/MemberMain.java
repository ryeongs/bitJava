package constructor;

import java.util.Scanner;

public class MemberMain {
	//�� 5�� �迭
	MemberDTO ar[]=new MemberDTO[5];
	
	String name;
	String address;
	int age;
	String phone;
	int cnt;
	//MemberDTO m=new MemberDTO(name,age,phone,address);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberMain mm=new MemberMain();
		
		boolean isExit=false;
		
		while (true) {
			mm.menu();
			int num=sc.nextInt();
            if(num==1) {mm.insert();}
            else if(num==2) {mm.list();}
            else if(num==3) {mm.update();}
            else if(num==4) {mm.delete();} 
            else if(num==5)	{break;}
            	
		}//while
		System.out.println("���α׷��� �����մϴ�.");
	
	}
	
	public void menu() {
		System.out.println("*************");
		 System.out.println("  1. ����");
		 System.out.println("  2. ���");
		 System.out.println("  3. ����");
		 System.out.println("  4. Ż��");
		 System.out.println("  5. ������");
		System.out.println("*************");
		
		System.out.print("  ��ȣ : ");
		
	}
	public void insert() {
		MemberMain mm= new MemberMain();
		Scanner sc = new Scanner(System.in);

			System.out.println("----------------------");
			 System.out.print("�̸� �Է� : ");
			 name=sc.nextLine();
			 System.out.print("���� �Է� : ");
			 age=sc.nextInt();
			 System.out.print("�ڵ��� �Է� : ");
			 phone=sc.next();
//			 if(!phone.matches("(01[016789])-(\\d{3,4})-(\\d{4})")) {
//				 System.out.println("ex)010-1234-5678");
//			 }
			 System.out.print("�ּ� �Է� : ");
			 address=sc.next();
			
			ar[cnt]=new MemberDTO(name,age,phone,address);
			cnt++;
			System.out.println(cnt+" row(s) created");
			System.out.println(ar.length-cnt +" �ڸ� ���ҽ��ϴ�");
			if(cnt>=5)
				System.out.println("5���� ������ �� á���ϴ�...");
			
	}
	
	public void list() {
		MemberMain mm= new MemberMain();
		
		System.out.println("name\tAge\tPhone\tAddress");
		for(int i=0; i<cnt;i++) {
			System.out.println(
					ar[i].getName()
					+"\t"+ar[i].getAge()
					+"\t"+ar[i].getPhone()
					+"\t"+ar[i].getAddress());
			
		}
	}
	public void update() {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		str=sc.next();
		
		for(int i=0; i<ar.length;i++) {
			if(ar[i].getPhone().equals(str) && ar[i]!=null) {
				//c=i;
				 System.out.println(
							ar[i].getName()
							+"\t"+ar[i].getAge()
							+"\t"+ar[i].getPhone()
							+"\t"+ar[i].getAddress());
				 
				//ar[i]=new MemberDTO(name,age,phone,address);
				System.out.print("���� �� �̸� �Է� : ");
				name=sc.next();
				ar[i].setName(name);
				 
				 System.out.print("���� �� �ڵ��� �Է� : ");
				 phone=sc.next();
				 ar[i].setPhone(phone);
				 
				 System.out.print("���� �� �ּ� �Է� : ");
				 address=sc.next();
				 ar[i].setAddress(address);
				 
				 System.out.println(
							ar[i].getName()
							+"\t"+ar[i].getAge()
							+"\t"+ar[i].getPhone()
							+"\t"+ar[i].getAddress());
				 System.out.println(i+" row(s) updated");

			}else if(ar[i].getPhone()==null)
				System.out.println("ã�� ȸ���� �����ϴ�");
		}
	}
	
	public void delete() {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("�ڵ��� ��ȣ �Է� : ");
		str=sc.next();
		
		for(int i=0; i<=cnt;i++) {
			if(ar[i].getPhone().equals(str) && ar[i].getPhone()!=null) {
				int c = i;
				System.out.println(
							ar[i].getName()
							+"\t"+ar[i].getAge()
							+"\t"+ar[i].getPhone()
							+"\t"+ar[i].getAddress());
				ar[c]=new MemberDTO(null,0,null,null);
				System.out.println(i+"row(s) deleted");
				//i--;
			}else if(ar[i].getPhone()==null)
				System.out.println("ã�� ȸ���� �����ϴ�");
			
		}
		cnt--;

	}
}
