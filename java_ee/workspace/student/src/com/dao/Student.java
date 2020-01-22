package com.dao;
import java.sql.*;
import java.util.Scanner;

public class Student {
	private int code ;
	Scanner scan = new Scanner(System.in);
	public Student() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//Ŭ����Ÿ������ ���ش�
			System.out.println("driver loading success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.56:1521:xe","c##java","bit");
			System.out.println("Connection success");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void menu() {
		int num = 0;
		while (true) {
		System.out.println("****************");
		System.out.println("����");
		System.out.println("****************");
		System.out.println("  1. �Է�");
		System.out.println("  2. �˻�");
		System.out.println("  3. ����");
		System.out.println("  4. ����");
		System.out.println("****************");
		System.out.println("��ȣ���� :");
		num = scan.nextInt();
		if (num ==4 ) {
			System.out.println("���α׷� �����մϴ�");
			break;
		}
		if (num == 1)
			this.insertArticle(); // �� Ŭ���� �ȿ� �մ� �Լ��� ���
		else if (num == 2)
			this.selectArticle();
		else if(num==3) 
			this.deleteArticle();
		}
	}
	
	public void insertArticle() {
		int inNum = 0;
		while (true) {
			System.out.println("****************");
			System.out.println("  1. �л�");
			System.out.println("  2. ����");
			System.out.println("  3. ������");
			System.out.println("  4. �����޴�");
			System.out.println("****************");
			System.out.print("��ȣ���� :");
			inNum = scan.nextInt();

			String name = null;
			String value = null;
			
			if (inNum == 4) {
				break;

			}
			if (inNum == 1) {
				System.out.print("�̸��Է� : ");
				name = scan.next();
				System.out.print("�й��Է� : ");
				value = scan.next();
				code = 1;
			} else if (inNum == 2) {
				System.out.print("�̸��Է� : ");
				name = scan.next();
				System.out.print("�����Է� : ");
				value = scan.next();
				code = 2;
			} else if (inNum == 3) {
				System.out.print("�̸��Է� : ");
				name = scan.next();
				System.out.print("�μ��Է� :");
				value = scan.next();
				code = 3;
			}
			System.out.println("---------------------------");

			// ====================================
			Connection conn = this.getConnection();
			PreparedStatement pstmt = null;
			String sql = "insert into student(name,value,code) values(?,?,?)";
			try {
				pstmt = conn.prepareStatement(sql); // ����
				pstmt.setString(1, name);
				pstmt.setString(2, value);
				pstmt.setInt(3, code);

				int su = pstmt.executeUpdate();// ���� - ������ ����
				System.out.println(su + "���� �������ϴ�");

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
	public void selectArticle() {
		int inNum = 0;
		while (true) {
			Connection conn = this.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			// ====================================
			System.out.println("****************");
			System.out.println("  1. �̸� �˻�");
			System.out.println("  2. ��ü �˻�");
			System.out.println("  3. �����޴�");
			System.out.println("****************");
			System.out.print("��ȣ���� :");
			 inNum = scan.nextInt();

			String name = null;
			String value = null;
			String job = null;
			if (inNum == 3) break;
		
			try {
				if (inNum == 1) {
					System.out.print("�˻��� �̸� �Է� : ");
					name = scan.next();
					
					String sql ="select name ,value from student where name like '%" + name+"%'";
					pstmt = conn.prepareStatement(sql); // ����
					rs = pstmt.executeQuery();// ����
					while (rs.next()) {// rs.next() - ���� ��ġ�� ���ڵ� ����(true / false) �������� �̵�
						System.out.println(rs.getString("name") + "\t" + rs.getString("value") + "\t");
					} // while
				}else if (inNum == 2) {
					System.out.print("�˻��� �̸� �Է� : ");
					name = scan.next();
					
					String sql ="select name ,value,code from student where name like '%" + name+"%'";
					pstmt = conn.prepareStatement(sql); // ����
					rs = pstmt.executeQuery();// ����
					
					if(code == 1) job="Student";
					else if(code == 2) job = "Professor";
					else if(code == 3) job = "Administrator";
				
					while (rs.next()) {// rs.next() - ���� ��ġ�� ���ڵ� ����(true / false) �������� �̵�
						System.out.println("�̸� = "+rs.getString("name") + "\n" 
								+job+ rs.getString("value") + "\n"
								+job+"="+ rs.getInt("code"));
					
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
	}

	public void deleteArticle() {
		int inNum = 0;
		while (true) {
			System.out.println();
			Scanner scan = new Scanner(System.in);
			System.out.print("������ �̸� �Է�:");
			String name = scan.next();

			// ====================================
			Connection conn = this.getConnection();
			PreparedStatement pstmt = null;
			String sql = "delete student where name like '" + name + "'";
			// String sql = "update dbtest set age =age+1 where name like ?"
			try {
				pstmt = conn.prepareStatement(sql); // ����
				// pstmt.setString(1, "%"+name+"%");

				int su = pstmt.executeUpdate();// ���� - ����Ȯ�� &����
				System.out.println(su + "���� �����Ǿ����ϴ�");

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
	public static void main(String[] args) {
		new Student().menu();
		
	}

}
