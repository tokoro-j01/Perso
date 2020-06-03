package com.personel.second.dto;

import java.io.Serializable;
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String departID;
	private String name;
	private String furigana;
	private String sex;
	private String birthday;
	private String adress;
	private String homePhone;
	private String sumahoPhone;
	private String email;
	private String positionID;
	private String joinDate;
	private char status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getFurigana() {
		return furigana;
	}
	public void setFurigana(String furigana) {
		this.furigana = furigana;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setAdress(String adress1,String adress2) {
		this.adress=adress1+adress2;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getSumahoPhone() {
		return sumahoPhone;
	}
	public void setSumahoPhone(String sumahoPhone) {
		this.sumahoPhone = sumahoPhone;
	}
	public String getDepartID() {
		return departID;
	}
	public void setDepartID(String departID) {
		this.departID = departID;
	}
	public String getPositionID() {
		return positionID;
	}
	public void setPositionID(String positionID) {
		this.positionID = positionID;
	}

	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", furigana=" + furigana + ", email=" + email + ", sex=" + sex
				+ ", birthday=" + birthday + ", adress=" + adress + ", homePhone=" + homePhone + ", sumahoPhone="
				+ sumahoPhone + ", departID=" + departID + ", positionID=" + positionID + ", status=" + status + "]";
	}

}


