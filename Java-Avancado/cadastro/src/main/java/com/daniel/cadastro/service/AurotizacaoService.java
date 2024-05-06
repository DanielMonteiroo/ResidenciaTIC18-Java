package com.daniel.cadastro.service;

import com.daniel.cadastro.repositorio.UsuariosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AurotizacaoService implements UserDetailsService {

    @Autowired
    UsuariosRepositorio usuariosRepositorio;

    //Metodo do Spring Secutity de consulta aos usuarios
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuariosRepositorio.findByLogin(username);
    }
}
