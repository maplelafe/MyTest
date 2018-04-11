package Util;

//让需要进行排序的对象实现Comparable接口，重写其中的compareTo(T o)方法，在其中定义排序规则，那么就可以直接调用java.util.Arrays.sort()来排序对象数组s
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
        if(this.score>o.score)//score是private的，为什么能够直接调用,这是因为在Student类内部
            return -1;//由高到底排序
        else if(this.score<o.score)
            return 1;
        else{
            if(this.age>o.age)
                return 1;//由底到高排序
            else if(this.age<o.age)
                return -1;
            else
                return 0;
        }
    }
}


