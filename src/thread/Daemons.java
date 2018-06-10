package thread;

import java.util.concurrent.TimeUnit;

/**

 *  �ػ��߳�

 */

public class Daemons {
    /**

     * @param args

     * @throws InterruptedException

     */
    public static void main(String[] args) throws InterruptedException {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true); //�����������߳�ǰ����
        d.start();
        System.out.println("d.isDaemon() = " + d.isDaemon() + ".");
        TimeUnit.SECONDS.sleep(1);
    }
}

class DaemonSpawn implements Runnable {

    public void run() {

        while (true) {
            Thread.yield();//��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������߳�
        }

    }
}

 
class Daemon implements Runnable {

    private Thread[] t = new Thread[10];

 

    public void run() {

        for (int i=0; i<t.length; i++) {

            t[i] = new Thread(new DaemonSpawn());

            t[i].start();//�ػ��߳��в��������߳�Ҳ���ػ��߳�

            System.out.println("DaemonSpawn " + i + " started.");

        }

        for (int i=0; i<t.length; i++) {

            System.out.println("t[" + i + "].isDaemon() = " +t[i].isDaemon() + ".");
        }
        while (true) {
        	Thread.yield();

        }

    }

   

}