package reflect;

public class EmpAction {
	private Emp emp =new Emp();
	
	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public void setAction(String msg) throws Exception {
		BeanOperation.setBeanValue(this,msg);
	}
}
