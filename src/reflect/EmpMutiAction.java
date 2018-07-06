package reflect;

public class EmpMutiAction {
	private Emp emp =new Emp();
	
	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public void setMutiAction(String msg) throws Exception {
		BeanOperation.setMutiBeanValue(this,msg);
	}
}
