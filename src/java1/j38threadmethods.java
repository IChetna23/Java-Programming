package java1;
class th1 extends Thread{
    int i =0;
    @Override
    public void run(){
        while (i <10){
            System.out.println("thread 1 running");
            System.out.println("i am happy");
            try {
                t1.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } // interrupt t1 for 400ms
            i++;
        }
    }
}

class th2 extends Thread{
    int c =0;
    @Override
    public void run(){
        while (c <10){
            System.out.println("end");
            System.out.println("i am sad");
            c++;
        }
    }
}
public class j38threadmethods {
    public static void main(String[] args) {
        th1 t1 = new th1();
        th2 t2 = new th2();
        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } // ccomplete t1 then t2 run
        t2.start();
    }
}
