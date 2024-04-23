package lesson38;

public class RunnableClass implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread" + Thread.currentThread().getName() + " : " + i);
        }
    }
}
