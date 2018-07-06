package reflect;

public class Dept {
	private String deptname;
	private String loc;
	private Company company;
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dept [deptname:"+deptname+",loc:"+loc+",company:"+company.toString()+"]";
	}
	
}
