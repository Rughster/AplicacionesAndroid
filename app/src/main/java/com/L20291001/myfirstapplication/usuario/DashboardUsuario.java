package com.L20291001.myfirstapplication.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.L20291001.myfirstapplication.R;
import com.L20291001.myfirstapplication.usuario.model.Usuario;
import com.L20291001.myfirstapplication.usuario.repository.UsuarioRepository;

public class DashboardUsuario extends AppCompatActivity {
    private UsuarioRepository ur;
    private Usuario userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_usuario);
        ur = UsuarioRepository.getInstance();

        String usuario = getIntent().getStringExtra("usuario");
        String pass = getIntent().getStringExtra("pass");

        userInfo = ur.getRegisteredUsers().get(usuario).get(pass);
        userInfo.getNombre();

        EditText etUsuario2 = findViewById(R.id.etUsuario2);
        etUsuario2.setText(userInfo.getUsuario());

        EditText etContraseña = findViewById(R.id.etContraseña);
        etContraseña.setText(userInfo.getPass());

        EditText etNombre = findViewById(R.id.etNombre);
        etNombre.setText(userInfo.getNombre());

        EditText etEdad = findViewById(R.id.etEdad);
        etEdad.setText(userInfo.getEdad().toString());

        EditText etEmail = findViewById(R.id.etEmail);
        etEmail.setText(userInfo.getEmail());

        //getResources().getString(R.string.tvNom) = userInfo.getNombre();
    }
}