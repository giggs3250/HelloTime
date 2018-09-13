package util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils {
	private static BasicDataSource datasource;
	private static InputStream ips;
	private static Properties prop;
	
	static {
		prop = new Properties();
		ips = DBUtils.class.getClassLoader().getResourceAsStream("config/jdbc.properties");
		try {
			prop.load(ips);
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");
			int minnum = Integer.parseInt(prop.getProperty("minnum"));
			int maxnum = Integer.parseInt(prop.getProperty("maxnum"));
			//设置数据里连接参数
			datasource = new BasicDataSource();
			datasource.setDriverClassName(driver);
			datasource.setUrl(url);
			datasource.setUsername(username);
			datasource.setPassword(password);
			//设置初始连接数量和最大连接数量
			datasource.setInitialSize(minnum);
			datasource.setMaxActive(maxnum);

		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	public static Connection getConn() throws SQLException {
		return datasource.getConnection();
	}
	
	public static void close(Connection conn,Statement stat,ResultSet rs) {
		try {
			if(rs!=null) {
				rs.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(stat!=null) {
				stat.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(conn!=null) {
				conn.setAutoCommit(true);
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
