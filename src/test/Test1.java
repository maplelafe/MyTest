package test;

public class Test1 {
	public static void main(String[] args) throws Exception {
		  //����һ��unicode�ַ��������ַ����޹�
		  String str1 = "�û�";

		  System.out.println("unicode�ַ�����"+str1);

		  //��strתΪUTF-8�ֽ���
		  byte[] byteArray1=str1.getBytes("UTF-8");//����ܰ�ȫ��UTF-8����������ݶ�ʧ

		  System.out.println(byteArray1.length);//��ӡ6��ûë��

		  //���潻������һ���ˣ�����֪������UTF-8�ֽ��������������ISO-8859-1����

		  //��byteArray1����һ����ͨ���ֽ���������ISO-8859-1����Ϊһ��unicode�ַ���
		  String str2=new String(byteArray1,"ISO-8859-1");

		  System.out.println("ת��ISO-8859-1�����룺"+str2);

		  //��ISO-8859-1�����unicode�ַ���ת��Ϊbyte[]
		  byte[] byteArray2=str2.getBytes("ISO-8859-1");//���ᶪʧ����

		  //���ֽ������½��ظ��û�A

		  //������UTF-8����
		  String str3=new String(byteArray2,"UTF-8");

		  System.out.println("����û�ж�ʧ��"+str3);
		}
}
