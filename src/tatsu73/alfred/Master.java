package tatsu73.alfred;

import java.io.Serializable;

public class Master implements Serializable{
	private String nickName;
	private String s_nickName;
	private int birthData_y;
	private int birthData_m;
	private int birthDate_d;
	private String bloodtype;
	private int age;
	//êØç¿
	private String constellations;
	private String mode;//Shiritori!Foooo!!
	private int c_id;//20,30
	
	//getter
	public String getNickName() {
		return nickName;
	}
	public String getS_nickName() {
		return s_nickName;
	}
	public int getBirthData_y() {
		return birthData_y;
	}
	public int getBirthData_m() {
		return birthData_m;
	}
	public int getBirthDate_d() {
		return birthDate_d;
	}
	public String getBloodtype() {
		return bloodtype;
	}
	public int getAge() {
		return age;
	}
	public String getConstellations() {
		return constellations;
	}
	public String getMode() {
		return mode;
	}
	public int getC_id() {
		return c_id;
	}
	
	//setter
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setS_nickName(String s_nickName) {
		this.s_nickName = s_nickName;
	}
	public void setBirthData_y(int birthData_y) {
		this.birthData_y = birthData_y;
	}
	public void setBirthData_m(int birthData_m) {
		this.birthData_m = birthData_m;
	}
	public void setBirthDate_d(int birthDate_d) {
		this.birthDate_d = birthDate_d;
	}
	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setConstellations(String constellations) {
		this.constellations = constellations;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	
	
}
