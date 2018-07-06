package reflect;

public class Company {
	private String companyname;

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Company[companyname:"+companyname+"]";
	}
	
}
