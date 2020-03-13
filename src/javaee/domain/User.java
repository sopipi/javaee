package javaee.domain;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
	private String userName;
	private String studentId;
	private String sex;
	private String college;
	private String major;
	private List hobbies;
	private String introduce;
	
	public User() {
		super();
	}


	public User(String userName, String studentId, String sex, String college, String major, List hobbies,
			String introduce) {
		super();
		this.userName = userName;
		this.studentId = studentId;
		this.sex = sex;
		this.college = college;
		this.major = major;
		this.hobbies = hobbies;
		this.introduce = introduce;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getIntroduce() {
		return introduce;
	}


	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public List getHobbies() {
		return hobbies;
	}

	public void setHobbies(List hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", studentId=" + studentId + ", sex=" + sex + ", college=" + college
				+ ", major=" + major + ", hobbies=" + hobbies + ", introduce=" + introduce + "]";
	}
	
	
	
	
}
