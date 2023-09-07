package ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOImpl implements DeptDAO { 		// 類別名稱後面有Impl，表示是DAO的實作介面
	
//	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
//	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
//	public static final String USER = "root";
//	public static final String PASSWORD = "24708053";
//	上面4行可放到Util.java作為常用資料
	public static final String INSERT_STMT = "insert into department values (?, ?, ?)";
	public static final String FIND_BY_DEPTNO = "select * from department where deptno = ?";
	public static final String GET_ALL = "select * from department order by deptno";
	
	// 當此類別被JVM載入時，驅動也就跟著一起載入到執行環境裡(一次性)
	static {
		try {
			Class.forName(Util.DRIVER);
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}

	@Override
	public void save(Dept dept) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, null);
		}
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer deptno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Dept findByDeptno(Integer deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept dept = null;
		
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_DEPTNO);
			
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				// 用Dept Bean包裝查詢出來的部門資料做回傳
				dept = new Dept();
				dept.setDeptno(deptno);
//				String dname = rs.getString("dname"); 
//				String loc = rs.getString("loc");
//				dept.setDname("dname");
//				dept.setLoc("loc");  //可精簡為下面二行
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, rs);
		}
		return dept;
	}

	@Override
	public List<Dept> getAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> deptList = new ArrayList<>();
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				// 用Dept Bean包裝查詢出來的部門資料做回傳
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				// 用集合收集著包裝好的查詢結果(部門物件)
				deptList.add(dept);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, rs);
		}
		return deptList;
		
	} 

}
