package multithreading.com;

public class Test {
    private static class MyThred implements Runnable{

        @Override
        public void run() {
            System.out.println("My Thread is starting");
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("My Thread is ending");
        }

        public static void main(String[] args) {

            Thread th=new Thread(new MyThred() );
            th.start();
            th.setName("My Thread");
        }
    }
}