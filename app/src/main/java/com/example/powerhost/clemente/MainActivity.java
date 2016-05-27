package com.example.powerhost.clemente;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final EditText editText_usuario = (EditText) findViewById(R.id.editText_usuarioRegistro);
        final EditText editText_clave = (EditText) findViewById(R.id.editText_claveRegistro);

        Button button_ingresar = (Button) findViewById(R.id.button_ingresar);
        Button button_registro = (Button) findViewById(R.id.button_registro);

        button_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario = editText_usuario.getText().toString();
                String clave = editText_clave.getText().toString();

                if (!usuario.isEmpty() && !clave.isEmpty()){

                    if (usuario.equals("adolfo") && clave.equals("123")){
                        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                        startActivity(intent);
                        /*Toast.makeText(MainActivity.this, "Felicidades has hecho login",
                                Toast.LENGTH_SHORT).show();*/
                    } else {
                        Toast.makeText(MainActivity.this, "Usuario y/o contraseña incorrectos",
                                Toast.LENGTH_SHORT).show();
                    }
                    /**/
                } else {
                    Toast.makeText(MainActivity.this, "Es necesario llenar todos los campos",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
