package java1;

import org.w3c.dom.ls.LSOutput;

interface camera{
    void takesnap();
    void record();
    default void record4k(){
        System.out.println("record in 4k");
    }
//    nott affect other classes
}
interface Wifi{
    String [] net= {"harry", "chetna", "hey"};
    void setnetwork();
    void connectToNetwork(String network);
}

class CellPhone{
    int phoneno;
    void call(int phoneno){
        this.phoneno = phoneno;
        System.out.println("calling..." + this.phoneno);
    }
    void pick(){
        System.out.println("on incoming call");
    }
}

class SmartPhone1 extends CellPhone implements camera, Wifi{
    public void record(){
        System.out.println("record");
    }

    @Override
    public void setnetwork() {
        for (String s : net) {
            System.out.println(s);
        }
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("connecting");
    }

    @Override
    public void takesnap() {
        System.out.println("capture");
    }
}
public class j32defaultmathod {
    public static void main(String[] args) {
        Wifi ob = new SmartPhone1();
//        ob.takesnap();
//        ob.connectToNetwork();  -error
        ob.setnetwork();
    }
}
