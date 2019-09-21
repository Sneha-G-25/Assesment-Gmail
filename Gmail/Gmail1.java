package Gmail;

public class Gmail1 {
	
	private int empid;
	private String empName;
	private String empType;
	private String email;
	private int    password;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	@Override
	public String toString() {
		return "Gmail1 [empid=" + empid + ", empName=" + empName + ", empType=" + empType + ", email=" + email
				+ ", password=" + password + ", message=" + message + "]";
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int e) {
		this.password = e;
	}

}
