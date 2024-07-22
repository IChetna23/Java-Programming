package java1;

class run extends Thread{
    run(String name){
        super(name);
    }
    void fun(){
        System.out.println("hi");
    }
}

public class j36threadconstructor {
    public static void main(String[] args) {
        run t1 = new run("my");
        run t2 = new run("thread");
        t1.start();
        t2.start();
        System.out.println("id of t1 is - " + t1.getId());
        System.out.println("name of t1 is - " + t1.getName());
        System.out.println("id of t2 is - " + t2.getId());
        System.out.println("name of t2 is - " + t2.getName());
    }
}
