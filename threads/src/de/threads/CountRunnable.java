package de.threads;

public class CountRunnable implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            String message = String.format(
                "Runnable Count: %d Thread-ID: %d",
                i,
                Thread.currentThread().getId()
            );
            System.out.println(message);
            try {
                int sleepCount = (int) (Math.random() * 1000 + 20);
                Thread.sleep(sleepCount);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
