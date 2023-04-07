package exam2;

class Demo {

    public static void main(String[] args) {
        Thread firstThread = new mthreads("First");
        Thread secondThread = new mthreads("Second");
        Thread thirdThread = new mthreads("Third");

        System.out.println("new thread: " + firstThread);
        System.out.println("new thread: " + secondThread);
        System.out.println("new thread: " + thirdThread);

        firstThread.start();
        secondThread.start();
        thirdThread.start();

        try {
            firstThread.join();
            secondThread.join();
            thirdThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting");
    }
}

class mthreads extends Thread {
    private String threadName;

    public mthreads(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + ": 5");

        for (int i=4; i>=1; i--) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(threadName + " exiting");
    }
}

