package mythread;

public class MyThread implements Runnable {

    public void run() {
        System.out.println("MyThread is running");

        // Display first 10 even numbers
        for(int i=2; i<=20; i+=2) {
            System.out.println(i);
            try {
                Thread.sleep(1500); // Sleep for 1.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("MyThread has finished running");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);

        thread.setName("myJavaThread");

        thread.start();
    }
}

