package org.wbm.eXchange;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wbminera1 on 18.01.2016.
 */
public class Pool {

    ExecutorService pool;

    public Pool() {
        pool = Executors.newFixedThreadPool(128);
    }

    public void Start(String exchange) {
        pool.submit(new Task(exchange));
    }

    void Stop() {
        pool.shutdown();
        try {
            pool.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
