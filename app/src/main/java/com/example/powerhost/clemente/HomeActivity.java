package com.example.powerhost.clemente;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       // DataBaseManager manager= new DataBaseManager(this);
       // manager.insertar2(678,45,76,"rojo","amarillo","pinta",2);
        //manager.insertar2(656,47,89,"rojo","amarillo","pinta",2);
        //manager.insertar2(667,40,84,"rojo","amarillo","dalmata",1);
        //manager.insertar2(698,43,79,"rojo","amarillo","dalmata",1);
        //DataBaseManagerCorrales managerCorrales= new DataBaseManagerCorrales(this);
        //managerCorrales.insertar2("vacasLocas",250);


        Button RegistrarCria = (Button) findViewById(R.id.RegistrarCria);


        RegistrarCria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Usuario no registrado",
                //Toast.LENGTH_SHORT).show();
                Intent intentRegistrarCria = new Intent(HomeActivity.this, ProveedorActivity.class);
                startActivity(intentRegistrarCria);
            }
        });
    }
}
