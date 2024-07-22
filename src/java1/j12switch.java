package java1;

public class j12switch {
    public static void main(String[] args) {
        String a = "Chetna";
        switch(a){
            case "Chetna":
                System.out.println("correct");
                break;
            case  "vanshika":
                System.out.println("wrong");
                break;
            default:
                System.out.println("switch ends with failure");
        }
        // enhanced switch
        switch (a) {
            case "Chetna" -> {
                System.out.println("correct");
                System.out.println("correct");
            }
            case "vanshika" -> System.out.println("wrong");
            default -> System.out.println("switch ends with failure");
        }

    }
}
