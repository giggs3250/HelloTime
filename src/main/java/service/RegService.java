package service;

import java.sql.Date;

import dao.UserDao;
import entity.User;
import util.DateUtils;
import util.UUIDUtils;

public class RegService {
	
	UserDao dao = new UserDao();
	
	public void saveUser(String uname,String upwd,String nickname,String realname,
			Date birthday,String gender,String location,String email,String phone) throws Exception {
		String uuid = UUIDUtils.getUUID();
		
		User user = new User();
		user.setUid(uuid);
		user.setUname(uname);
		user.setUpwd(upwd);
		user.setNickname(nickname);
		user.setRealname(realname);
		user.setHeadimage(null);
		user.setBirthday(birthday);
		user.setGender(gender);
		user.setLocation(location);
		user.setEmail(email);
		user.setPhone(phone);
		Date regtime = new Date(System.currentTimeMillis());
		user.setRegtime(regtime);
		user.setKidney(null);
		user.setUser_status("正常");
		user.setUser_alter_time(null);
		
		dao.saveUser(user);
	}
	
	
}
