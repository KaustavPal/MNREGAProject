package bean;

public class C_ProjectBean {
	private String pid;
	private String pname;
	private String plocation;
	private String pduration;
	private String phead;
	private String pgpm;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPlocation() {
		return plocation;
	}
	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	public String getPduration() {
		return pduration;
	}
	public void setPduration(String pduration) {
		this.pduration = pduration;
	}
	public String getPhead() {
		return phead;
	}
	public void setPhead(String phead) {
		this.phead = phead;
	}
	public String getPgpm() {
		return pgpm;
	}
	public void setPgpm(String pgpm) {
		this.pgpm = pgpm;
	}
	public C_ProjectBean(String pid, String pname, String plocation, String pduration, String phead, String pgpm) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
		this.pduration = pduration;
		this.phead = phead;
		this.pgpm = pgpm;
	}
	
	public C_ProjectBean(String pname) {
		super();
		this.pname = pname;
	}
	public C_ProjectBean() {
		super();
	}
	
	
	
}