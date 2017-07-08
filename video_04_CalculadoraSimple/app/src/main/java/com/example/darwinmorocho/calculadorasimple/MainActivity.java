package com.example.darwinmorocho.calculadorasimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText editTextN1, editTextN2, editTextEmail;

    private Button buttonSumar, buttonRestar, buttonEmail;

    private TextView textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //campos de texto
        editTextN1 = (EditText) findViewById(R.id.editTextNumero1);
        editTextN2 = (EditText) findViewById(R.id.editTextNumero2);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);


        //botones
        buttonSumar = (Button) findViewById(R.id.buttonMas);
        buttonRestar = (Button) findViewById(R.id.buttonMenos);
        buttonEmail = (Button) findViewById(R.id.buttonEmail);


        textViewEmail = (TextView) findViewById(R.id.textViewEmail);


        buttonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float suma = Float.parseFloat(editTextN1.getText().toString()) + Float.parseFloat(editTextN2.getText().toString());

                Toast.makeText(MainActivity.this, "la suma es " + suma, Toast.LENGTH_SHORT).show();
            }
        });


        buttonRestar.setOnClickListener(this);
        buttonEmail.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        int id = v.getId();

        switch (id) {
            case R.id.buttonMenos:
                float resta = Float.parseFloat(editTextN1.getText().toString()) - Float.parseFloat(editTextN2.getText().toString());
                Toast.makeText(MainActivity.this, "la restaes " + resta, Toast.LENGTH_SHORT).show();
                break;

            case R.id.buttonEmail:
                textViewEmail.setText(editTextEmail.getText());
                break;
        }


    }
}
