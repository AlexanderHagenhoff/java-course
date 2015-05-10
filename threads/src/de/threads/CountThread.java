package de.threads;

public class CountThread extends Thread
{
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            String message = String.format("Thread Count: %d Thread-ID: %d", i, this.getId());
            System.out.println(message);
            try {
                int sleepCount = (int) (Math.random() * 1000 + 20);
                this.sleep(sleepCount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
