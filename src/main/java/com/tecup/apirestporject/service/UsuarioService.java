package com.tecup.apirestporject.service;

import com.tecup.apirestporject.model.Usuario;
import com.tecup.apirestporject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //Listar usuarios
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    //Crear usuarios
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    //Actualizar usuarios
    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    //Borrar usuarios
    public void deleteUsuarioById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
