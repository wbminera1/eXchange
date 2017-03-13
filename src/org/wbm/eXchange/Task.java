package org.wbm.eXchange;

/**
 * Created by wbminera1 on 18.01.2016.
 */
public class Task implements Runnable  {

    final DataCollector dataCollector;

    Task(String exchangeName) {
        dataCollector = new DataCollector(exchangeName) {
            @Override
            public void Initialize() {
                super.Initialize();
            }
            @Override
            public void Update() {
                super.Update();
            }
        };

    }

    @Override
    public void run() {
        dataCollector.Initialize();
        while (true) {
            dataCollector.Update();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
