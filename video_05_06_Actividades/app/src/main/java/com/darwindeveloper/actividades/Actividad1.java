package com.darwindeveloper.actividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

/**
 * Created by DARWIN MOROCHO on 8/7/2017.
 */

public class Actividad1 extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contenido_actividad1);

    }


    public  void  lanzarActividad2(View v){
        Intent intentActividad2 =new Intent(this,Actividad2.class);

        EditText editTextNombre=(EditText) findViewById(R.id.editTextNombre);
        EditText editTextN1=(EditText) findViewById(R.id.editTextN1);
        EditText editTextN2=(EditText) findViewById(R.id.editTextN2);

        intentActividad2.putExtra(Actividad2.NOMBRE,editTextNombre.getText().toString());
        intentActividad2.putExtra(Actividad2.N1, Float.parseFloat(editTextN1.getText().toString()));
        intentActividad2.putExtra(Actividad2.N2, Float.parseFloat(editTextN2.getText().toString()));





        startActivity(intentActividad2);
    }

}
