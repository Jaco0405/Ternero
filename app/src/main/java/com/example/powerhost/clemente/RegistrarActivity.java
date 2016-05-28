package com.example.powerhost.clemente;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class RegistrarActivity extends AppCompatActivity implements View.OnClickListener{

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
    EditText edID,edEdad,edPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        edID=(EditText)findViewById(R.id.Text_id);
        edEdad=(EditText)findViewById(R.id.Text_edad);
        edPeso=(EditText)findViewById(R.id.Text_peso);
        cmbOpcionesRaza=(Spinner)findViewById(R.id.spinner_raza);
        cmbOpcionesMusculo=(Spinner)findViewById(R.id.spinner_musculo);
        cmbOpcionesGrasa=(Spinner)findViewById(R.id.spinner_grasa);


        ArrayAdapter<String> adaptadorRaza = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, raza);
        cmbOpcionesRaza = (Spinner)findViewById(R.id.spinner_raza);
        adaptadorRaza.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpcionesRaza.setAdapter(adaptadorRaza);

        ArrayAdapter<String> adaptadorMusculo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, musculo);
        cmbOpcionesMusculo = (Spinner)findViewById(R.id.spinner_musculo);
        adaptadorMusculo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpcionesMusculo.setAdapter(adaptadorMusculo);

        ArrayAdapter<String> adaptadorGrasa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, grasa);
        cmbOpcionesGrasa = (Spinner)findViewById(R.id.spinner_grasa);
        adaptadorGrasa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpcionesGrasa.setAdapter(adaptadorGrasa);


         Button RegistraCria = (Button) findViewById(R.id.RegistraCria);

        RegistraCria.setOnClickListener(this);

    }

    @Override
    public void onClick(View arg0) {
        switch (arg0.getId()){
            case R.id.RegistraCria:
                String Id=edID.getText().toString();
                String Edad=edEdad.getText().toString();
                String Peso=edPeso.getText().toString();
                try {
                    BdSQLiteHelper bda= new BdSQLiteHelper(this);
                    bda.abrir();
                    long result=bda.registrarCria(Id,Edad,Peso);
                    bda.cerrar();
                    if(result>0){
                        Toast t=Toast.makeText(this,"valor insertado", Toast.LENGTH_LONG);
                        t.show();
                    }
                } catch (Exception e) {
                    Toast t=Toast.makeText(this,e.toString(), Toast.LENGTH_LONG);
                    t.show();                }
                break;
        }
    }
}
