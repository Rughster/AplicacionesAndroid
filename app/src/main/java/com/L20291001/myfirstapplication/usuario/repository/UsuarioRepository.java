package com.L20291001.myfirstapplication.usuario.repository;

import com.L20291001.myfirstapplication.usuario.model.Usuario;

import java.util.HashMap;

public class UsuarioRepository {
    private static UsuarioRepository repository = null;

    private HashMap<String, HashMap<String, Usuario>> registeredUsers;

    private UsuarioRepository(){
        Usuario u1 = new Usuario("Epico", "Epiquisimo", "Epico345435", 22, "Epico@gmail");
        Usuario u2 = new Usuario("Epico2", "Epiquisimo2", "Epico2", 20, "Epico4@gmail");
        Usuario u3 = new Usuario("Epico3", "Epiquisimo3", "Epico3", 18, "Epico3@gmail");

        this.registeredUsers = new HashMap<String, HashMap<String, Usuario>>();

        registeredUsers.put(u1.getUsuario(), new HashMap<String, Usuario>());
        registeredUsers.get(u1.getUsuario()).put(u1.getPass(), u1);

        registeredUsers.put(u2.getUsuario(), new HashMap<String, Usuario>());
        registeredUsers.get(u2.getUsuario()).put(u2.getPass(), u2);

        registeredUsers.put(u3.getUsuario(), new HashMap<String, Usuario>());
        registeredUsers.get(u3.getUsuario()).put(u3.getPass(), u3);
    }

    public static UsuarioRepository getInstance(){
        if(repository == null)
            repository = new UsuarioRepository();

        return repository;
    }

    public HashMap<String, HashMap<String, Usuario>> getRegisteredUsers() {
        return registeredUsers;
    }
}
