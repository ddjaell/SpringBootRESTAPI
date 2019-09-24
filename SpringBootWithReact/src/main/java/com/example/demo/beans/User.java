package com.example.demo.beans;

public class User {

	private String admin_id, passwd, name, email, address, phone, hp, login_date, logout_date, reg_date,
	use_yn, Alarm_grade, admin_grade, device_gu1, damdang_buseo, damdang_gu;
	private int pass_count;
	
	public User() 
	{
		
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getLogin_date() {
		return login_date;
	}

	public void setLogin_date(String login_date) {
		this.login_date = login_date;
	}

	public String getLogout_date() {
		return logout_date;
	}

	public void setLogout_date(String logout_date) {
		this.logout_date = logout_date;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public String getUse_yn() {
		return use_yn;
	}

	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}

	public String getAlarm_grade() {
		return Alarm_grade;
	}

	public void setAlarm_grade(String alarm_grade) {
		Alarm_grade = alarm_grade;
	}

	public String getAdmin_grade() {
		return admin_grade;
	}

	public void setAdmin_grade(String admin_grade) {
		this.admin_grade = admin_grade;
	}

	public String getDevice_gu1() {
		return device_gu1;
	}

	public void setDevice_gu1(String device_gu1) {
		this.device_gu1 = device_gu1;
	}

	public String getDamdang_buseo() {
		return damdang_buseo;
	}

	public void setDamdang_buseo(String damdang_buseo) {
		this.damdang_buseo = damdang_buseo;
	}

	public String getDamdang_gu() {
		return damdang_gu;
	}

	public void setDamdang_gu(String damdang_gu) {
		this.damdang_gu = damdang_gu;
	}

	public int getPass_count() {
		return pass_count;
	}

	public void setPass_count(int pass_count) {
		this.pass_count = pass_count;
	}

	public User(String admin_id, String passwd, String name, String email, String address, String phone, String hp,
			String login_date, String logout_date, String reg_date, String use_yn, String alarm_grade,
			String admin_grade, String device_gu1, String damdang_buseo, String damdang_gu, int pass_count) {
		super();
		this.admin_id = admin_id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.hp = hp;
		this.login_date = login_date;
		this.logout_date = logout_date;
		this.reg_date = reg_date;
		this.use_yn = use_yn;
		Alarm_grade = alarm_grade;
		this.admin_grade = admin_grade;
		this.device_gu1 = device_gu1;
		this.damdang_buseo = damdang_buseo;
		this.damdang_gu = damdang_gu;
		this.pass_count = pass_count;
	}
	
	
}
