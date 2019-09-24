package com.example.demo.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.beans.Device;

@Mapper
public interface DeviceRepository {
	
	@Select("select * from t_device")
	public List <Device> findAll();
	
	@Select("select * from t_device where device_id = #{device_id}")
	public Device findById(String device_id);
	
	@Delete("delete from t_device where device_id = #{device_id}")
	public int deleteById(String device_id);
	
	@Update("update t_device set device_type = #{device_type}, device_ip = #{device_ip}, device_port = #{device_port}, device_desc = #{device_desc}, admin_id = #{admin_id}, read_community = #{read_community}, write_community = #{write_community}, snmp_version = #{snmp_version}, snmp_yn = #{snmp_yn}, use_yn = #{use_yn}, device_ip2 = #{device_ip2}, device_ip3 = #{device_ip3}, device_gu1 = #{device_gu1}, device_gu2 = #{device_gu2}, device_local = #{device_local}, os_gu = #{os_gu}, disp_yn = #{disp_yn}, disp_seq = #{disp_seq}, ping_yn = #{ping_yn}, disp_yn_2 = #{disp_yn_2} , alarm_yn = #{alarm_yn}, upd_date = now()")
	public int updateById(Device device);
	
	@Insert("insert into t_device(device_id, device_type, device_ip, device_port, device_desc, admin_id, read_community, write_community, snmp_version, snmp_yn, use_yn, device_ip2, device_ip3, device_gu1, device_gu2, device_local, os_gu, disp_yn, disp_seq, ping_yn, disp_yn_2, alarm_yn, reg_date)" +
	"values(#{device_id}, #{device_type}, #{device_ip}, #{device_port}, #{device_desc}, #{admin_id}, #{read_community}, #{write_community}, #{snmp_version}, #{snmp_yn}, #{use_yn}, #{device_ip2}, #{device_ip3}, #{device_gu1}, #{device_gu2}, #{device_local}, #{os_gu}, #{disp_yn}, #{disp_seq}, #{ping_yn}, #{disp_yn_2}, #{alarm_yn}, now())")
	public int insert(Device device);
}
