package java1;

class emp{
    private String name;
    private int id;


    emp(int myid, String empname){
        id = myid;
        name = empname;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
}
public class j25constructors {
    public static void main(String[] args) {
        emp emp1 = new emp(001, "harry");
        System.out.println(emp1.getname());
        System.out.println(emp1.getid());
    }
}
