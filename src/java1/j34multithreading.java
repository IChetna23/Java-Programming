package java1;

// concurrency - appear run together - multithreading - wait time use by other proccess
// parallelism - actually run together

class t1 extends Thread{
    int i =0;
    @Override
    public void run(){
        while (i <10000){
            System.out.println("thread 1 running");
            System.out.println("i am happy");
            i++;
        }
    }
}

class t2 extends Thread{
    int c =0;
    @Override
    public void run(){
        while (c <10000){
            System.out.println("end");
            System.out.println("i am sad");
            c++;
        }
    }
}
public class j34multithreading {
    public static void main(String[] args) {
        t1 thread1 = new t1();
        t2 thread2 = new t2();
        thread1.start();
        thread2.start();
    }
}
