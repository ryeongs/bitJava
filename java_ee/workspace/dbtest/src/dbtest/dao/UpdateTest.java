package dbtest.dao;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {
	//수정할 이름 입력 :
	//홍이 들어간 이름의 나이를 1살 증가
	public UpdateTest() {
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
	public void updateArticle() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 이름 입력:");
		String name = scan.next();

		//====================================
		Connection conn = this.getConnection();
		PreparedStatement pstmt = null;
		String sql = "update dbtest set age =age+1 where name like '%"+name+ "%'";
		//String sql = "update dbtest set age =age+1 where name like ?" 
		try {
			 pstmt = conn.prepareStatement(sql); //생성
			//pstmt.setString(1, "%"+name+"%");
	
			 int su = pstmt.executeUpdate();//실행 - 개수확인 &실행
			System.out.println(su +"개가 수정되었습니다");
			
			
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
		UpdateTest ut=new UpdateTest();
		ut.updateArticle();
		//new UpdateTest().updateAriticle();
	}
}
