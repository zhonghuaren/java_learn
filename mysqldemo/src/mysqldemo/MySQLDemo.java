package mysqldemo;
import java.sql.*;

public class MySQLDemo {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";
	
	static final String USER = "root";
	static final String PASS = "827775459";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(JDBC_DRIVER);
			
			System.out.println("连接数据库...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("实例化staement对象...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, name, url FROM websites";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String url = rs.getString("url");
				
				System.out.println("ID: " + id);
				System.out.println("站点名称: " + name);
				System.out.println("站点URL: " + url);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException se2) {
			}
			try {
				if (conn != null) {
					conn.close();
				} 
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("GOODBYE~");
	}
}
