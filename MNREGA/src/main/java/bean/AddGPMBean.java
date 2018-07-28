package bean;

public class AddGPMBean {
	private String userid;
	private String password;
	private String name;
	private String gender;
	private String dob;
	private String address;
	private String mobileno;
	private String emailid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public AddGPMBean(String userid, String password, String name, String gender, String dob, String address,
			String mobileno, String emailid) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.mobileno = mobileno;
		this.emailid = emailid;
	}
	public AddGPMBean() {
		super();
	}
	
	

}