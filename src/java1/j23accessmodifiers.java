package java1;

class Employee{
    private String name;
    private int id;
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String myname){
        name = myname;
    }
    public void setId(int myid){
        id = myid;
    }

}
public class j23accessmodifiers {

    public static void main(String[] args) {
        Employee harry = new Employee();
//        harry.name = "harry"; - show error
        String s = harry.getName();
        System.out.println(s);
        harry.setName("Harry");
        harry.setId(001);
    }
}
