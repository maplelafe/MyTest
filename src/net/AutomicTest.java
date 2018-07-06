package net;

//vlatile���ܱ�֤ԭ���ԣ�volatile��֤�˿ɼ��ԣ�����Դ��������������ԭ���Բ�����lOCK�� Sychronized��AtomicInteger ���Ա�֤ԭ����
public class AutomicTest {
    public volatile int inc = 0;//
     
    public  synchronized void  increase() {
        inc++;
    }
     
    public static void main(String[] args) {
        final AutomicTest test = new AutomicTest();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        } 
        System.out.println(Thread.activeCount());
        while(Thread.activeCount()>1)  //��֤ǰ����̶߳�ִ���� , ���ص�ǰ�̵߳��߳����л�̵߳���Ŀ
            Thread.yield();//��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������߳�
        System.out.println(test.inc);
    }
}