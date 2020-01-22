package friend.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import friend.action.FriendManager;
import friend.bean.FriendDTO;

public class FriendDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String  url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "bit";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	Scanner scan = new Scanner(System.in);
	
	private static FriendDAO instance;
	
	public static FriendDAO getInstance() {
		if(instance ==null) {
			synchronized(FriendDAO.class) { //반드시 이 클래스만 통과 시켜라
				instance = new FriendDAO();
			}
		}
		return instance;
	}
	
	public FriendDAO() {
		try {
			Class.forName(driver);//클래스타입으로 해준다
			System.out.println("driver loading success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, username,password);
			System.out.println("Connection success");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int getSeq() {
		int seq=0;
		getConnection();
		String sql="select seq_friend.nextval as seq from dual";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			
			rs.next();
			seq = rs.getInt(1);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return seq;
	}

	public void insertArticle(FriendDTO fdto) {
		getConnection();
		String sql = "insert into friend values(?,?,?,?,?,?,?,?,?,?,?)";
		System.out.println("insert");
		try {
			pstmt = conn.prepareStatement(sql); // 생성
			pstmt.setInt(1, fdto.getSeq());
			pstmt.setString(2, fdto.getName());
			pstmt.setString(3, fdto.getTel1());
			pstmt.setString(4, fdto.getTel2());
			pstmt.setString(5, fdto.getTel3());
			pstmt.setInt(6, fdto.getGender());
			pstmt.setInt(7, fdto.getRead());
			pstmt.setInt(8, fdto.getMovie());
			pstmt.setInt(9, fdto.getMusic());
			pstmt.setInt(10, fdto.getGame());
			pstmt.setInt(11,fdto.getShopping());

			pstmt.executeUpdate();// 실행 - 개수가 리턴

		} catch (SQLException e) {
			e.printStackTrace();
		} finally  {
			try {
				if(rs!=null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<FriendDTO> getFriendList() {
		List<FriendDTO>list2 = new ArrayList<FriendDTO>();
		getConnection();
		String sql = "select *from friend";
	
		try {
			pstmt =conn.prepareStatement(sql);
			rs =pstmt.executeQuery();
			
			while(rs.next()) {
				FriendDTO dto =new FriendDTO();
				dto.setSeq(rs.getInt("seq"));
				dto.setName(rs.getString("name"));
				dto.setTel1(rs.getString("tel1"));
				dto.setTel2(rs.getString("tel2"));
				dto.setTel3(rs.getString("tel3"));
				dto.setGender(rs.getInt("gender"));
				dto.setRead(rs.getInt("read"));
				dto.setMovie(rs.getInt("movie"));
				dto.setMusic(rs.getInt("music"));
				dto.setGame(rs.getInt("game"));
				dto.setShopping(rs.getInt("shopping"));
				
				list2.add(dto);
				
			}//while
		} catch (SQLException e) {
			e.printStackTrace();
		}finally  {
			try {
				if(rs!=null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				list2 =null;
			}
		}
		
		return list2;
	}
}
