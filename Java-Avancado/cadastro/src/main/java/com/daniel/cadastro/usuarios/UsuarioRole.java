package com.daniel.cadastro.usuarios;

public enum UsuarioRole {

    ADMIN("admin"),
    USUARIO("usuario");

    private String role;

    //Construtor
    UsuarioRole(String role){
        this.role = role;
    }

    //Getter
    public String getRole() {
        return role;
    }
}
