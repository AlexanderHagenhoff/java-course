package de.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    private ExecutorService executor = Executors.newCachedThreadPool();

    public static void main(String[] args) throws Exception
    {
        new Main();
    }

    public Main() throws Exception
    {
        for (int i = 0; i < 100; i++) {
            Thread countThread = new CountThread();
            countThread.start();
        }

        for (int i = 0; i < 100; i++) {
            Runnable runnable = new CountRunnable();
            Thread thread = new Thread(runnable);
            thread.start();
        }

        List<Callable<Object>> callable = new ArrayList<Callable<Object>>();
        for (int i = 0; i < 100; i++) {
            Callable countRunnable = new CountCallable();
            callable.add(countRunnable);
        }
        executor.invokeAll(callable);
    }
}
