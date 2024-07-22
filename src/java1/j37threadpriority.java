package java1;

class priority extends Thread{
    priority(String name){
        super(name);
        int i = 0;
        while (i <20) {
            System.out.println(name);
            i++;
        }
    }
}
public class j37threadpriority {
    public static void main(String[] args) {
        priority t1 = new priority("t1");
        priority t2 = new priority("t2 - normal");
        priority t3 = new priority("t3");
        priority t4 = new priority("t4 - max");
        priority t5 = new priority("t5 - min ");
        t4.setPriority(Thread.MAX_PRIORITY); //10
        t5.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); //5
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
