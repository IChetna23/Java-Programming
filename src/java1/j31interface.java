package java1;

interface bicycle{
    void speedup();
    void name();
}
class bi implements bicycle {

    @Override
    public void speedup() {
        System.out.println("speed up");
    }

    @Override
    public void name() {
        System.out.println("avon");
    }
}
// multiple implementation allowed
// multiple inheritence - not allowed

public class j31interface {

    public static void main(String[] args) {
        bi b1 = new bi();
        b1.name();
        b1.name();
    }
}