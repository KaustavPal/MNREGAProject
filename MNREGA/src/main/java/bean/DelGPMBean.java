package bean;

public class DelGPMBean {
	private String userid;
	private String name;
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
	public DelGPMBean(String userid, String name) {
		super();
		this.userid = userid;
		this.name = name;
	}
	public DelGPMBean() {
		super();
	}

	
}
