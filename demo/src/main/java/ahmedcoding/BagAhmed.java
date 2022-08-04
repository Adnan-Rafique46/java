package ahmedcoding;

public class BagAhmed {
    private  int rollno;
    private String name;

    void MyFuction(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }

    public static void main(String[] args) {
        BagAhmed ba=new BagAhmed();
        ba.name="adnan";
        ba.rollno=115;
        System.out.println(ba);
    }




}