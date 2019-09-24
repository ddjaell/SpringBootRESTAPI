package com.example.demo.beans;

public class Device {

	private long  disp_seq, device_port;
	private String device_id, device_type, device_ip, 
	device_desc, admin_id, read_community, write_community, snmp_version,
	snmp_yn, use_yn, device_ip2, device_ip3, device_gu1, device_gu2, device_local, os_gu,
	disp_yn, disp_yn_2, alarm_yn, ping_last_dated, reg_date, upd_date, ping_yn;
	
	public Device()
	{
		
	}
	public Device(String device_id, long disp_seq, long device_port, String device_type, String device_ip, String device_desc,
			String admin_id, String read_community, String write_community, String snmp_version, String snmp_yn,
			String use_yn, String device_ip2, String device_ip3, String device_gu1, String device_gu2,
			String device_local, String os_gu, String disp_yn, String disp_yn_2, String alarm_yn, String ping_yn
			) {
		this.device_id = device_id;
		this.disp_seq = disp_seq;
		this.device_port = device_port;
		this.device_type = device_type;
		this.device_ip = device_ip;
		this.device_desc = device_desc;
		this.admin_id = admin_id;
		this.read_community = read_community;
		this.write_community = write_community;
		this.snmp_version = snmp_version;
		this.snmp_yn = snmp_yn;
		this.use_yn = use_yn;
		this.device_ip2 = device_ip2;
		this.device_ip3 = device_ip3;
		this.device_gu1 = device_gu1;
		this.device_gu2 = device_gu2;
		this.device_local = device_local;
		this.os_gu = os_gu;
		this.disp_yn = disp_yn;
		this.disp_yn_2 = disp_yn_2;
		this.alarm_yn = alarm_yn;
		this.ping_yn = ping_yn;
	}
	public String getPing_yn() {
		return ping_yn;
	}
	public void setPing_yn(String ping_yn) {
		this.ping_yn = ping_yn;
	}
	public String getId() {
		return device_id;
	}
	public void setId(String device_id) {
		this.device_id = device_id;
	}
	public long getDisp_seq() {
		return disp_seq;
	}
	public void setDisp_seq(long disp_seq) {
		this.disp_seq = disp_seq;
	}
	public long getDevice_port() {
		return device_port;
	}
	public void setDevice_port(long device_port) {
		this.device_port = device_port;
	}
	public String getDevice_type() {
		return device_type;
	}
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}
	public String getDevice_ip() {
		return device_ip;
	}
	public void setDevice_ip(String device_ip) {
		this.device_ip = device_ip;
	}
	public String getDevice_desc() {
		return device_desc;
	}
	public void setDevice_desc(String device_desc) {
		this.device_desc = device_desc;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getRead_community() {
		return read_community;
	}
	public void setRead_community(String read_community) {
		this.read_community = read_community;
	}
	public String getWrite_community() {
		return write_community;
	}
	public void setWrite_community(String write_community) {
		this.write_community = write_community;
	}
	public String getSnmp_version() {
		return snmp_version;
	}
	public void setSnmp_version(String snmp_version) {
		this.snmp_version = snmp_version;
	}
	public String getSnmp_yn() {
		return snmp_yn;
	}
	public void setSnmp_yn(String snmp_yn) {
		this.snmp_yn = snmp_yn;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	public String getDevice_ip2() {
		return device_ip2;
	}
	public void setDevice_ip2(String device_ip2) {
		this.device_ip2 = device_ip2;
	}
	public String getDevice_ip3() {
		return device_ip3;
	}
	public void setDevice_ip3(String device_ip3) {
		this.device_ip3 = device_ip3;
	}
	public String getDevice_gu1() {
		return device_gu1;
	}
	public void setDevice_gu1(String device_gu1) {
		this.device_gu1 = device_gu1;
	}
	public String getDevice_gu2() {
		return device_gu2;
	}
	public void setDevice_gu2(String device_gu2) {
		this.device_gu2 = device_gu2;
	}
	public String getDevice_local() {
		return device_local;
	}
	public void setDevice_local(String device_local) {
		this.device_local = device_local;
	}
	public String getOs_gu() {
		return os_gu;
	}
	public void setOs_gu(String os_gu) {
		this.os_gu = os_gu;
	}
	public String getDisp_yn() {
		return disp_yn;
	}
	public void setDisp_yn(String disp_yn) {
		this.disp_yn = disp_yn;
	}
	public String getDisp_yn_2() {
		return disp_yn_2;
	}
	public void setDisp_yn_2(String disp_yn_2) {
		this.disp_yn_2 = disp_yn_2;
	}
	public String getAlarm_yn() {
		return alarm_yn;
	}
	public void setAlarm_yn(String alarm_yn) {
		this.alarm_yn = alarm_yn;
	}
	public String getPing_last_dated() {
		return ping_last_dated;
	}
	public void setPing_last_dated(String ping_last_dated) {
		this.ping_last_dated = ping_last_dated;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getUpd_date() {
		return upd_date;
	}
	public void setUpd_date(String upd_date) {
		this.upd_date = upd_date;
	}
	
	
	
}
