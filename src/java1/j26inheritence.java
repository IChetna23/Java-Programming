package java1;

class parent{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class child extends parent{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class j26inheritence {
    public static void main(String[] args) {
        child ob = new child();
        ob.setX(9);
        System.out.println(ob.getX());
    }
}
