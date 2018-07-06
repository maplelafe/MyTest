package reflect;

public class Emp {
	private String name;
	private String psw;
	private Dept dept = new Dept();
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emp [name:"+name+",psw:"+psw+","+dept.toString()+"]";
	}
	
}
