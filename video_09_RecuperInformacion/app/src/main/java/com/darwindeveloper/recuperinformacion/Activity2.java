package com.darwindeveloper.recuperinformacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }


    public void volver(View v) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String dato = editText.getText().toString();

        Intent intent = new Intent();

        intent.putExtra("DATO", dato);

        setResult(RESULT_OK, intent);
        finish();


    }
}
