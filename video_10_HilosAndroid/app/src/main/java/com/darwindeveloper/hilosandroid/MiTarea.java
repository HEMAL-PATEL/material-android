package com.darwindeveloper.hilosandroid;

import android.os.Handler;
import android.os.Message;

/**
 * Created by DARWIN MOROCHO on 30/7/2017.
 */

public class MiTarea extends Thread {

    Handler handler;

    int i = 0;


    public MiTarea(Handler handler) {
        this.handler = handler;
    }


    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 50000; i++) {

            if (i % 1000 == 0) {
                handler.obtainMessage(MainActivity.DIVISIBLE, i, -1).sendToTarget();
            }

        }

    }






}
