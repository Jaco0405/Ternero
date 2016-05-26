/*package beardboy.net.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.powerhost.clemente.Models.User;
import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final EditText editText_usuario = (EditText) findViewById(R.id.editText_usuarioRegistro);
        final EditText editText_clave = (EditText) findViewById(R.id.editText_claveRegistro);

        Button buttonRegistro = (Button) findViewById(R.id.button_registrar);

        buttonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editText_usuario.getText().toString();
                String clave = editText_clave.getText().toString();

                Realm realm = Realm.getInstance(SignUpActivity.this);

                if (!usuario.isEmpty() && !clave.isEmpty()){

                    RealmResults<User> results = realm.where(User.class)
                            .equalTo("nombreUsuario", usuario).findAll();

                    //consulta que regresa un objeto tipo usuario
                    User user1 = realm.where(User.class).equalTo("NombreUsuerio", usuario).findFirst();

                    //si user es diferente de null significa que si hay un usuario con el nombreUsuario escrito
                    if (user1 != null){
                        //comparamos la clave que escribimos con la clave del objeto usuario que obtuvimos de la consulta
                        //si la clave es igual a la del objeto
                        if (user1.getClaveUsuario().equals(clave)){
                            //iniciamos sesion
                        } else {
                            //contraseña incorrecta
                        }
                    } else {
                        //EL usuario no existe
                    }

                    if (results.size()>0){
                        Toast.makeText(SignUpActivity.this, "El Nombre de usuario" +
                                "ya existe", Toast.LENGTH_SHORT).show();
                    } else {

                        realm.beginTransaction();
                        User user = realm.createObject(User.class);
                        user.setNombreUsuario(usuario);
                        user.setClaveUsuario(clave);
                        realm.commitTransaction();
                    }

                }
            }
        });


    }
}
*/