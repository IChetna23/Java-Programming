package java1;

class runnable1 implements Runnable{

    @Override
    public void run() {
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
        System.out.println("one");
    }
}
class runnable2 implements Runnable{

    @Override
    public void run() {
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
    }
}
public class j35runnableinterface {
    public static void main(String[] args) {
        runnable1 on = new runnable1();
        Thread t1 = new Thread(on); // use staert mathod by object of thread class
        runnable2 of = new runnable2();
        Thread t2 = new Thread(of);
        t1.start();
        t2.start();
    }
}
