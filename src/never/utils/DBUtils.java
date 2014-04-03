/**  
 * @Title: DBUtils.java
 * @Package never.utils
 * @author "Never" xzllc2010#gmail.com  
 * @date Apr 3, 2014 8:33:01 PM
 * @Description: TODO
 */
package never.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {

	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/db_wf?useUnicode=true&characterEncoding=utf8";
	private static final String user = "root";
	private static final String password = "LXZcyh%8";

	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	public DBUtils() {
		getConn();
	}

	private void getConn() {

		try {
			Class.forName(driver);
			this.conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException classnotfoundexception) {
			classnotfoundexception.printStackTrace();
		} catch (SQLException sqlexception) {
			sqlexception.printStackTrace();
		}
	}

	public int doInsert(String sql) throws SQLException {
		int i = 0;
		stmt = conn.createStatement();
		i = stmt.executeUpdate(sql);
		return i;
	}

	public int doDelete(String sql) throws SQLException {
		stmt = conn.createStatement();
		return stmt.executeUpdate(sql);
	}

	public int doUpdate(String sql) throws SQLException {
		stmt = conn.createStatement();
		return stmt.executeUpdate(sql);
	}

	public ResultSet doSelect(String sql) throws SQLException {
		stmt = conn.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_READ_ONLY);
		rs = stmt.executeQuery(sql);
		return rs;
	}

	public void close() throws SQLException, Exception {
		if (stmt != null) {
			stmt.close();
			stmt = null;
		}
		if (conn != null) {
			conn.close();
			conn = null;
		}
		if (rs != null) {
			rs.close();
			rs = null;
		}
	}
}
