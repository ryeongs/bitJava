package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class InsertTest {
	public InsertTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//클래스타입으로 해준다
			System.out.println("driver loading success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
	public Connection getConnection() {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##java","bit");
			System.out.println("Connection success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void insertArticle() {
		Scanner scan =new Scanner(System.in);
		System.out.print("이름 입력:");
		String name = scan.next();
		System.out.print("age 입력:");
		int age = scan.nextInt();
		System.out.print("height 입력:");
		double height = scan.nextDouble();
		
		//====================================
		Connection conn = this.getConnection();
		 PreparedStatement pstmt = null;
		String sql = "insert into dbtest(name,age,height,logtime) values(?,?,?,sysdate)";
		try {
			 pstmt = conn.prepareStatement(sql); //생성
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3,height);
			
			int su = pstmt.executeUpdate();//실행 - 개수가 리턴
			System.out.println(su +"개가 만들어졋습니다");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		InsertTest it = new InsertTest();
		it.insertArticle();
	}
}
