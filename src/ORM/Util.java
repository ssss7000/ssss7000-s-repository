package ORM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Util {  // 工具類別，固定會用到的資料
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "24708053";
	
	public static void closeResources(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		if (pstmt != null) {
			try {
				pstmt.close();
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
