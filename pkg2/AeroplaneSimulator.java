package pkg2;

public class AeroplaneSimulator implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Takeoff");

    }

    @Override
    public void down() {
        System.out.println("Land");

    }

    @Override
    public void left() {
        System.out.println("left");

    }

    @Override
    public void right() {
        System.out.println("right");

    }

    @Override
    public void space() {
        System.out.println("speed up");
    }
}
