package action;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;


public class CallTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		  try{
		   String endpoint = "http://localhost:8080/MyService/services/Hello";
		         Service service = new Service();
		         Call call  = (Call)service.createCall();
		         call.setTargetEndpointAddress(new java.net.URL(endpoint));
		         call.setOperationName("getHello");
		         String res = (String) call.invoke(new Object[]{});
		         System.out.println(res);
		  }
		  catch (Exception ex){
		   ex.printStackTrace();
		  }
		 }
}
