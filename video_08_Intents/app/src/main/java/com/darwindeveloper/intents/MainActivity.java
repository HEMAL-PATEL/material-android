package com.darwindeveloper.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    //intents explicitas
    public void lanzarActividad2(View v){
        Intent intent=new Intent(MainActivity.this,Activity2.class);
        startActivity(intent);
    }


   /*
    public void descargarArchivo(View v){
        String url_archvo="https://www.w3schools.com/html/mov_bbb.mp4";
        Intent intent=new Intent(MainActivity.this,DownloadService.class);
        startActivity(intent);
    }
    */




   public void abrirMaps(View v){
       Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
       Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
       mapIntent.setPackage("com.google.android.apps.maps");
       startActivity(mapIntent);
   }



   //intents implicitas
    public  void  paginaWeb(View v){
        Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse("https://google.com"));
        startActivity(intent);
    }

    public  void  enviarEmail(View v){
        String msg="este es un mensaje desde una intent implicita";
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,msg);
        intent.setType("text/plain");

        startActivity(intent);


    }



}
