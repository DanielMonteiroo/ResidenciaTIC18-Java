package com.daniel.cadastro.infra.security;

import com.daniel.cadastro.repositorio.UsuariosRepositorio;
import com.daniel.cadastro.usuarios.Usuarios;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class FiltroSecurity extends OncePerRequestFilter {

    @Autowired
    TokenService tokenService;

    @Autowired
    UsuariosRepositorio usuariosRepositorio;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        var token = recoverToken(request);
        if(token != null){
            var login = tokenService.validaToken(token);
            UserDetails usuario = usuariosRepositorio.findByLogin(login);
            var autenticacao = new UsernamePasswordAuthenticationToken(usuario,null,usuario.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(autenticacao);
        }
        filterChain.doFilter(request,response);

    }

    private String recoverToken(HttpServletRequest request)
    {
        var authHeader = request.getHeader("Authorization");
        if(authHeader == null) return null;
        else return authHeader.replace("Bearer","");
    }
}
