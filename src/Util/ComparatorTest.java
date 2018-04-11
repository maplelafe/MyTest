package Util;

import java.util.Comparator;
//但是在设计类的时候，往往没有考虑到让比较类Student类实现Comparable接口，那么我们就需要用到另外的一个比较器接口Comparator
//Comparator体现了一种策略模式(strategy design pattern)，就是不改变对象自身，而用一个策略对象(strategy object)来改变它的行为。


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