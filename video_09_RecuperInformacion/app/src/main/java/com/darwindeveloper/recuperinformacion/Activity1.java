package com.darwindeveloper.recuperinformacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {


    private  final  int REQUEST_ACTIVIDAD2=100;


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        textView=(TextView) findViewById(R.id.texto_recuperado);
    }


    public  void lanzarActividad2(View v){
        Intent intent=new Intent(this,Activity2.class);
        startActivityForResult(intent,REQUEST_ACTIVIDAD2);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==REQUEST_ACTIVIDAD2){
            if(resultCode== RESULT_OK){
                textView.setText(data.getStringExtra("DATO"));
            }
        }

    }
}
