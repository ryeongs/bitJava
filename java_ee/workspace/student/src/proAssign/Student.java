package proAssign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String  url = "jdbc:oracle:thin:@192.168.0.56:1521:xe";
	private String username = "c##java";
	private String password = "bit";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	Scanner scan = new Scanner(System.in);
	
	public Student() {
		try {
			Class.forName(driver);//Ŭ����Ÿ������ ���ش�
			System.out.println("driver loading success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url, username,password);
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
		System.out.print("��ȣ���� :");
		num = scan.nextInt();
		if (num ==4 ) {
			System.out.println("���α׷� �����մϴ�");
			break;
		}
		if (num == 1) this.insertArticle(); // �� Ŭ���� �ȿ� �մ� �Լ��� ���
		else if (num == 2) this.selectArticle();
		else if(num==3) this.deleteArticle();
		}
	}
	
	public void insertArticle() {
		int inNum = 0;
		String name = null;
		String value = null;
		int code =0;
		
		while (true) {
			System.out.println("****************");
			System.out.println("  1. �л�");
			System.out.println("  2. ����");
			System.out.println("  3. ������");
			System.out.println("  4. �����޴�");
			System.out.println("****************");
			System.out.print("��ȣ���� :");
			inNum = scan.nextInt();

			
			if (inNum == 4) break;

			System.out.print("�̸��Է� : ");
			name = scan.next();
			code = inNum; //���� code �Ƚᵵ�� inNum �����

			if (inNum == 1) {
				System.out.print("�й��Է� : ");
				value = scan.next();
			} else if (inNum == 2) {
				name = scan.next();
				System.out.print("�����Է� : ");
				value = scan.next();
			} else if (inNum == 3) {
				name = scan.next();
				System.out.print("�μ��Է� :");
				value = scan.next();
			}
			System.out.println("---------------------------");

			// ====================================
			String sql = "insert into student(name,value,code) values(?,?,?)";
			Connection conn = this.getConnection();

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
					if (pstmt != null) pstmt.close();
					if (conn != null) conn.close();
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
			if (inNum == 3) break;
		
			System.out.print("�˻��� �̸� �Է� : ");
			name = scan.next();
			try {
				if (inNum == 1) {
					
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
				
					while (rs.next()) {// rs.next() - ���� ��ġ�� ���ڵ� ����(true / false) �������� �̵�
						System.out.println("�̸� = "+rs.getString("name") + "\n" 
								+ rs.getString("value") + "\n"
								+"="+ rs.getInt("code"));
					
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
		
	}
	public static void main(String[] args) {
		new Student().menu();
		
	}
}
