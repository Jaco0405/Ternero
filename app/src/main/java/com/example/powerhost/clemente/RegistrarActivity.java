package com.example.powerhost.clemente;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class RegistrarActivity extends AppCompatActivity {

    private String[] raza = {" ... ","Aberdeen Angus","Beefmaster","Belga Azul",
            "Bradford","Brahaman","Brangus","Charolais","Droughtmaster",
            "Gyr","Guzerat","Hereford","Holstein Friesian","Indobrasil",
            "Jersey","Limousin","Marchigiana","Nellore","Pardo Suizo",
            "Piamontesa","Romagnola","Salers","Santa Getrudis","Simental",
            "Tuli","Tropicarne"};
    private String[]musculo={" ... ","Rojo cerezo","Rojo cerezo a intenso","Rojo intenso","Rojo oscuro"};
    private String[]grasa={" ... ","Blanca","Hasta cremosa","Hasta un poco amarilla","Amarilla"};


    private Spinner cmbOpcionesRaza;
    private Spinner cmbOpcionesMusculo;
    private Spinner cmbOpcionesGrasa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        ArrayAdapter<String> adaptadorRaza = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, raza);
        cmbOpcionesRaza = (Spinner)findViewById(R.id.spinner_raza);
        adaptadorRaza.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpcionesRaza.setAdapter(adaptadorRaza);

        ArrayAdapter<String> adaptadorMusculo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, musculo);
        cmbOpcionesRaza = (Spinner)findViewById(R.id.spinner_musculo);
        adaptadorMusculo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpcionesRaza.setAdapter(adaptadorMusculo);

        ArrayAdapter<String> adaptadorGrasa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, grasa);
        cmbOpcionesRaza = (Spinner)findViewById(R.id.spinner_grasa);
        adaptadorGrasa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpcionesRaza.setAdapter(adaptadorGrasa);


         Button RegistraCria = (Button) findViewById(R.id.RegistraCria);


        RegistraCria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistrarActivity.this, "Funciona",
                Toast.LENGTH_SHORT).show();
               // Intent intentRegistrarCria = new Intent(RegistrarActivity.this, activity_home.class);
                //startActivity(intentRegistrarCria);
            }
        });
    }
}
