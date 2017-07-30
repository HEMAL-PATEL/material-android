package com.darwindeveloper.hilosandroid;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;


    public static final int DIVISIBLE = 100;


    Handler miHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {
                case DIVISIBLE:
                    textView.setText("i=" + msg.arg1);
                    break;
            }


        }
    };

    MiTarea miTarea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);


        miTarea = new MiTarea(miHandler);
        miTarea.start();

    }


    public void bloquearhilo(View v) {
        for (int i = 0; i < 10; i++) {
            textView.setText(i + "");
            SystemClock.sleep(2000);
        }
    }

    public void stoptarea(View v) {
        miTarea.stop();
        miTarea = null;
    }


}
