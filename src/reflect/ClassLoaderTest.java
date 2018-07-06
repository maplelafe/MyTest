package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, RuntimeException, Exception {
		// TODO Auto-generated method stub
		Member member = new Member();
		Class<?> m =  Class.forName("reflect.Member");
		System.out.println(m.getClassLoader());
		System.out.println(m.getClassLoader().getParent());
		System.out.println(Class.forName("reflect.Member").getClassLoader().loadClass("reflect.Member").newInstance());
		System.out.println(member.getClass().newInstance());
		
		
		 //自定义类加载器的加载路径
        MyClassLoader myClassLoader=new MyClassLoader();
        //包名+类名
        Class c=myClassLoader.loadData("com.ffb.vo.Member");       
        if(c!=null){
            Object obj=c.newInstance();
            Method method=c.getMethod("tostring", null);
            method.invoke(obj, null);
            System.out.println(c.getClassLoader().toString());
            System.out.println(c.getClassLoader().getParent().toString());
        }
	}

}
class Member{}
