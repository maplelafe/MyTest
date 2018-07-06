package reflect;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Emp emp = new Emp();
		emp.setName("bob");
		emp.setPsw("1323");
		JSONObject jo = new JSONObject();
		System.out.println(jo.fromObject(emp));*/
		
	  String var="emp.name:bob|emp.psw:bobpsw";	
	  String var1 = "emp.dept.company.companyname:apple|emp.dept.deptname:developer";
	  EmpAction action = new EmpAction();
	  EmpMutiAction maction = new EmpMutiAction();
	  try {
		  action.setAction(var);
		  maction.setMutiAction(var1);
		System.out.println(action.getEmp());
		System.out.println(maction.getEmp());
	} catch (Exception e) {
		// TODO Auto-generated catch block
      	e.printStackTrace();
	}
	  
	  /**
	   * ∂‡º∂vo…Ë÷√
	   */

	  
		
	}

}
