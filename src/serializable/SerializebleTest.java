package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerializebleTest {
	static  File f = new File("D:"+File.separator+"person.ser");

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		//ser(new Person("alice","1"));
		dser();
		};
	/**
	 * ���л�����	
	 * @param obj
	 * @throws IOException
	 * @throws IOException
	 */
	public static void ser(Object obj) throws IOException, IOException{
		//�ھ�̬�����У�����ֱ�ӷ��ʷǾ�̬��Ա(���������ͱ���)
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(obj);
		oos.close();
	}
	/**
	 * 
	 */
	public static void dser(){
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream(f));
			System.out.println(((Person)ois.readObject()).getName());
			ois.close();
		} catch (IOException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
class Person implements Serializable{
	String name;
	String id;
	
	public Person(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
