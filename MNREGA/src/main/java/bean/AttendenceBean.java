package bean;

public class AttendenceBean {
	private String Userid;
	private String date;
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public AttendenceBean(String userid, String date) {
		super();
		Userid = userid;
		this.date = date;
	}
	public AttendenceBean() {
		super();
	}

}
