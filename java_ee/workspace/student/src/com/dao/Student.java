package com.dao;
import java.sql.*;
import java.util.Scanner;

public class Student {
	private int code ;
	Scanner scan = new Scanner(System.in);
	public Student() {
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
		System.out.println("관리");
		System.out.println("****************");
		System.out.println("  1. 입력");
		System.out.println("  2. 검색");
		System.out.println("  3. 삭제");
		System.out.println("  4. 종료");
		System.out.println("****************");
		System.out.println("번호선택 :");
		num = scan.nextInt();
		if (num ==4 ) {
			System.out.println("프로그램 종료합니다");
			break;
		}
		if (num == 1)
			this.insertArticle(); // 내 클래스 안에 잇는 함수를 사용
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
			System.out.println("  1. 학생");
			System.out.println("  2. 교수");
			System.out.println("  3. 관리자");
			System.out.println("  4. 이전메뉴");
			System.out.println("****************");
			System.out.print("번호선택 :");
			inNum = scan.nextInt();

			String name = null;
			String value = null;
			
			if (inNum == 4) {
				break;

			}
			if (inNum == 1) {
				System.out.print("이름입력 : ");
				name = scan.next();
				System.out.print("학번입력 : ");
				value = scan.next();
				code = 1;
			} else if (inNum == 2) {
				System.out.print("이름입력 : ");
				name = scan.next();
				System.out.print("과목입력 : ");
				value = scan.next();
				code = 2;
			} else if (inNum == 3) {
				System.out.print("이름입력 : ");
				name = scan.next();
				System.out.print("부서입력 :");
				value = scan.next();
				code = 3;
			}
			System.out.println("---------------------------");

			// ====================================
			Connection conn = this.getConnection();
			PreparedStatement pstmt = null;
			String sql = "insert into student(name,value,code) values(?,?,?)";
			try {
				pstmt = conn.prepareStatement(sql); // 생성
				pstmt.setString(1, name);
				pstmt.setString(2, value);
				pstmt.setInt(3, code);

				int su = pstmt.executeUpdate();// 실행 - 개수가 리턴
				System.out.println(su + "개가 만들어졋습니다");

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
			System.out.println("  1. 이름 검색");
			System.out.println("  2. 전체 검색");
			System.out.println("  3. 이전메뉴");
			System.out.println("****************");
			System.out.print("번호선택 :");
			 inNum = scan.nextInt();

			String name = null;
			String value = null;
			String job = null;
			if (inNum == 3) break;
		
			try {
				if (inNum == 1) {
					System.out.print("검색할 이름 입력 : ");
					name = scan.next();
					
					String sql ="select name ,value from student where name like '%" + name+"%'";
					pstmt = conn.prepareStatement(sql); // 생성
					rs = pstmt.executeQuery();// 실행
					while (rs.next()) {// rs.next() - 현재 위치에 레코드 유무(true / false) 다음으로 이동
						System.out.println(rs.getString("name") + "\t" + rs.getString("value") + "\t");
					} // while
				}else if (inNum == 2) {
					System.out.print("검색할 이름 입력 : ");
					name = scan.next();
					
					String sql ="select name ,value,code from student where name like '%" + name+"%'";
					pstmt = conn.prepareStatement(sql); // 생성
					rs = pstmt.executeQuery();// 실행
					
					if(code == 1) job="Student";
					else if(code == 2) job = "Professor";
					else if(code == 3) job = "Administrator";
				
					while (rs.next()) {// rs.next() - 현재 위치에 레코드 유무(true / false) 다음으로 이동
						System.out.println("이름 = "+rs.getString("name") + "\n" 
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
			System.out.print("삭제할 이름 입력:");
			String name = scan.next();

			// ====================================
			Connection conn = this.getConnection();
			PreparedStatement pstmt = null;
			String sql = "delete student where name like '" + name + "'";
			// String sql = "update dbtest set age =age+1 where name like ?"
			try {
				pstmt = conn.prepareStatement(sql); // 생성
				// pstmt.setString(1, "%"+name+"%");

				int su = pstmt.executeUpdate();// 실행 - 개수확인 &실행
				System.out.println(su + "개가 삭제되었습니다");

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
