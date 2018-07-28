package bean;

public class ERegBean {
	private String userid;
	private String name;
	private String gender;
	private String dob;
	private String address;
	private String mobileno;
	private String pid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public ERegBean(String userid, String name, String gender, String dob, String address, String mobileno,
			String pid) {
		super();
		this.userid = userid;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.mobileno = mobileno;
		this.pid = pid;
	}
	public ERegBean() {
		super();
	}
	
	
}