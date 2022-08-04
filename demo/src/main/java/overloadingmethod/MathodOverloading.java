package overloadingmethod;

public class MathodOverloading {
    public void myInfo(String name){
        System.out.println("my name is adnan rafique");
    }
    public void myInfo(int age){
        System.out.println("my age is //");
    }
    public void  myInfo(String name,int age){
        System.out.println(age+name);
    }

    public static void main(String[] args) {
        String name="adnan rafique";
        int age =30;
        MathodOverloading moverloading=new MathodOverloading();
        moverloading.myInfo("adnan");
        moverloading.myInfo(30);
        System.out.println(age+ " " + name);

}}

