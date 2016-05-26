package com.example.powerhost.clemente;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProveedorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proveedor);

        Button SelecProv = (Button) findViewById(R.id.button_proveedor);


        SelecProv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Usuario no registrado",
                //Toast.LENGTH_SHORT).show();
                Intent intentSelecProv = new Intent(ProveedorActivity.this, RegistrarActivity.class);
                startActivity(intentSelecProv);
            }
        });
    }
}
