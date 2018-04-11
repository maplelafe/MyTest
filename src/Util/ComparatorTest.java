package Util;

import java.util.Comparator;
//������������ʱ������û�п��ǵ��ñȽ���Student��ʵ��Comparable�ӿڣ���ô���Ǿ���Ҫ�õ������һ���Ƚ����ӿ�Comparator
//Comparator������һ�ֲ���ģʽ(strategy design pattern)�����ǲ��ı������������һ�����Զ���(strategy object)���ı�������Ϊ��


class Student1 {
    private String name;
    private int age;
    private float score;
    
    public Student1(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }

    public String toString()
    {
        return name+"\t\t"+age+"\t\t"+score;
    }

}

class StudentComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        // TODO Auto-generated method stub
        if(o1.getScore()>o2.getScore())
            return -1;
        else if(o1.getScore()<o2.getScore())
            return 1;
        else{
            if(o1.getAge()>o2.getAge())
                return 1;
            else if(o1.getAge()<o2.getAge())
                return -1;
            else 
                return 0;
        }
    }
    
}


public class ComparatorTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Student1 stu[]={new Student1("zhangsan",20,90.0f),
                new Student1("lisi",22,90.0f),
                new Student1("wangwu",20,99.0f),
                new Student1("sunliu",22,100.0f)};
        java.util.Arrays.sort(stu,new StudentComparator());
        for(Student1 s:stu)
        {
            System.out.println(s);
        }
    }

}