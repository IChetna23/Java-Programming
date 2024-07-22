package pkg2;

public class CarSimulator implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Accelerate");

    }

    @Override
    public void down() {
        System.out.println("Break");

    }

    @Override
    public void left() {
        System.out.println("steer left");

    }

    @Override
    public void right() {
        System.out.println("Steer right");


    }

    @Override
    public void space() {
        System.out.println("boost");
    }
}
