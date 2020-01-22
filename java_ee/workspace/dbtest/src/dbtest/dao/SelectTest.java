package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
	public SelectTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.print("driver loading success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##java","bit");
			System.out.println("Connection success");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void selectArticle() {
		Connection conn = this.getConnection();
		String sql ="select name ,age,height, to_char(logtime,'YYYY.MM.DD') as logtime from dbtest";
		PreparedStatement pstmt = null;
		 ResultSet rs = null;
		 
		try {
			 pstmt = conn.prepareStatement(sql); //생성
			 rs = pstmt.executeQuery();//실행
			 while(rs.next()) {//rs.next()  - 현재 위치에 레코드 유무(true / false) 다음으로 이동
				 System.out.println( rs.getString("name")+ "\t"
						 			+rs.getInt("age")+"\t"
						 			+rs.getDouble("height")+"\t"
						 			+rs.getString("logtime"));
				 //rs.getString(1);
				 //rs.getInt(2);
				 //rs.getDouble(3);
				 //rs.getString(4);
			 }//while
			
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
	public static void main(String[] args) {
		new SelectTest().selectArticle(); 
	}
}
