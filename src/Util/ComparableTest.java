package Util;

//����Ҫ��������Ķ���ʵ��Comparable�ӿڣ���д���е�compareTo(T o)�����������ж������������ô�Ϳ���ֱ�ӵ���java.util.Arrays.sort()�������������s
public class ComparableTest {
	  public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Student stu[]={new Student("zhangsan",20,90.0f),
	                new Student("lisi",22,90.0f),
	                new Student("wangwu",20,99.0f),
	                new Student("sunliu",22,100.0f)};
	        java.util.Arrays.sort(stu);
	        for(Student s:stu)
	        {
	            System.out.println(s);
	        }
	    }
}
class Student implements Comparable<Student>{
    private String name;
    private int age;
    private float score;
    
    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    
    public String toString()
    {
        return name+"\t\t"+age+"\t\t"+score;
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        if(this.score>o.score)//score��private�ģ�Ϊʲô�ܹ�ֱ�ӵ���,������Ϊ��Student���ڲ�
            return -1;//�ɸߵ�������
        else if(this.score<o.score)
            return 1;
        else{
            if(this.age>o.age)
                return 1;//�ɵ׵�������
            else if(this.age<o.age)
                return -1;
            else
                return 0;
        }
    }
}


