package entity;

import java.sql.Date;

import util.DateUtils;

public class User {
	private String uid;
	private String uname;
	private String upwd;
	private String nickname;
	private String realname;
	private String headimage;
	private Date birthday;
	private String gender;
	private String location;
	private String email;
	private String phone;
	private Date regtime;
	private String kidney;
	private String user_status;
	private Date user_alter_time;
	
	
	
	
	public User(String uid, String uname, String upwd, String nickname, String realname, String headimage,
			Date birthday, String gender, String location, String email, String phone, Date regtime, String kidney,
			String user_status, Date user_alter_time) {
		
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.nickname = nickname;
		this.realname = realname;
		this.headimage = headimage;
		this.birthday = birthday;
		this.gender = gender;
		this.location = location;
		this.email = email;
		this.phone = phone;
		this.regtime = regtime;
		this.kidney = kidney;
		this.user_status = user_status;
		this.user_alter_time = user_alter_time;
	}
	
	public User() {
		
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getHeadimage() {
		return headimage;
	}
	public void setHeadimage(String headimage) {
		this.headimage = headimage;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getRegtime() {
		return regtime;
	}
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	public String getKidney() {
		return kidney;
	}
	public void setKidney(String kidney) {
		this.kidney = kidney;
	}
	public String getUser_status() {
		return user_status;
	}
	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}
	public Date getUser_alter_time() {
		return user_alter_time;
	}
	public void setUser_alter_time(Date user_alter_time) {
		this.user_alter_time = user_alter_time;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", nickname=" + nickname + ", realname="
				+ realname + ", headimage=" + headimage + ", birthday=" + DateUtils.getDate(birthday) + ", gender=" + gender
				+ ", location=" + location + ", email=" + email + ", phone=" + phone + ", regtime=" + DateUtils.getDatetime(regtime)
				+ ", kidney=" + kidney + ", user_status=" + user_status + ", user_alter_time=" + DateUtils.getDatetime(user_alter_time) + "]";
	}

	
	
}
