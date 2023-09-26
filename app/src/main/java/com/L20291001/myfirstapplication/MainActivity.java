package com.L20291001.myfirstapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.L20291001.myfirstapplication.usuario.DashboardUsuario;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private HashMap<String, String> registeredUsers = new HashMap<String, String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registeredUsers.put("Epico", "Epiquisimo");
        registeredUsers.put("12345", "67890");
        registeredUsers.put("hola", "adios");
    }

    private AlertDialog createAlertDialog(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(message);
                /*Los mutables son aquellos que cuando accedemos podemos modificar sus valores, y los inmutables
                //es cuando no se modifican, en este caso puede ser String por que su metodo toUpperCase no modifica la String en si
                //Si no que devuelve un valor, la unica forma en que la podemos modificar es modificar o crear nuevas
                */
        return builder.create();
    }

    public void onBtnIngresarTab(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        AlertDialog dialog = builder.create();

        EditText etUsuario = findViewById(R.id.etUsuario);
        EditText etPass = findViewById(R.id.etPass);

        String user, pass;
        user = etUsuario.getText().toString();
        pass = etPass.getText().toString();

        if (!registeredUsers.containsKey(user)) {
            //dialog.setTitle("Atencion");
            //dialog.setMessage(String.format("Usuario no registrado"));
            //dialog.show();
            this.createAlertDialog("Atencion", "Usuario no registrado").show();
            return;
        }

        if (!registeredUsers.get(user).equals(pass)) {
            //dialog.setTitle("Atencion");
            //dialog.setMessage(String.format("La contraseña no coincide"));
            //dialog.show();
            this.createAlertDialog("Atencion", "Contraseña no Coincide").show();
            return;
        }

        //dialog.setTitle("Felicidades has iniciado sesion");
        //dialog.setMessage(String.format("Datos ingrsados\nUsuario: %s\nPassword %s", user, pass));
        //dialog.show();

        String message = "Felicidades, ha iniciado sesion con exito";
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        Intent i = new Intent(this, DashboardUsuario.class);//packageContext, quien lo va a lanzar, el siguiente es quien

        i.putExtra("usuario", user);
        i.putExtra("pass", pass);

        startActivity(i);
    }
}