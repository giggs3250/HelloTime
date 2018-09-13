package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Date;

import entity.User;
import util.DBUtils;

public class UserDao {
	//用户
	public void saveUser(User user) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		String uid = user.getUid();
		String uname = user.getUname();
		String upwd = user.getUpwd();
		String nickname = user.getNickname();
		String realname = user.getRealname();
		String headimage = user.getHeadimage();
		Date birthday = user.getBirthday();
		String gender = user.getGender();
		String location = user.getLocation();
		String email = user.getEmail();
		String phone = user.getPhone();
		Date regtime = user.getRegtime();
		Timestamp t_reg_time = new Timestamp(regtime.getTime());
		String kidney = user.getKidney();
		String user_status = user.getUser_status();
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,null)";
		conn = DBUtils.getConn();
		ps = conn.prepareStatement(sql);
		ps.setString(1, uid);
		ps.setString(2, uname);
		ps.setString(3, upwd);
		ps.setString(4, nickname);
		ps.setString(5, realname);
		ps.setString(6, headimage);
		ps.setDate(7, birthday);
		ps.setString(8, gender);
		ps.setString(9, location);
		ps.setString(10, email);
		ps.setString(11, phone);
		ps.setTimestamp(12, t_reg_time);
		ps.setString(13, kidney);
		ps.setString(14, user_status);
		ps.executeUpdate();

		DBUtils.close(conn, ps, null);

	}
}
