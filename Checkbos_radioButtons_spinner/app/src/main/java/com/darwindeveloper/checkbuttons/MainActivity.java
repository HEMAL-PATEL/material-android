package com.darwindeveloper.checkbuttons;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    private String opcionesSpinner[] = {"lunes", "martes", "miercoles"};

    private int opcionSpinner = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);

        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Button button = (Button) findViewById(R.id.button);


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });


        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton1:
                        Toast.makeText(MainActivity.this, "Mayor de edad", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radioButton2:
                        Toast.makeText(MainActivity.this, "Menor de edad", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radioButton3:
                        Toast.makeText(MainActivity.this, "Tercera edad de edad", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, opcionesSpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                opcionSpinner = position;

                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "lunes", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "martes", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(MainActivity.this, "miercoles", Toast.LENGTH_SHORT).show();
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean statusCheckBox = checkBox.isChecked();
                boolean statusToggleButton = toggleButton.isChecked();


                int checkedId = radioGroup.getCheckedRadioButtonId();

                switch (checkedId) {
                    case R.id.radioButton1:
                        Toast.makeText(MainActivity.this, "Mayor de edad", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radioButton2:
                        Toast.makeText(MainActivity.this, "Menor de edad", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radioButton3:
                        Toast.makeText(MainActivity.this, "Tercera edad de edad", Toast.LENGTH_SHORT).show();
                        break;
                }


                Toast.makeText(MainActivity.this, "dia " + opcionSpinner, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
