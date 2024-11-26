package com.tecup.apirestporject.controller;

import com.tecup.apirestporject.model.Usuario;
import com.tecup.apirestporject.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    //GET
    @GetMapping("/listar")
    public List<Usuario> ListarUsuarios() {
        return usuarioService.getUsuarios();
    }

    //POST
    @PostMapping("/crear")
    public Usuario CrearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.createUsuario(usuario);
    }

    //PUT

    @PutMapping("/edit/{id}/")
    public Usuario EditarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return usuarioService.updateUsuario(usuario);
    }
    //DELETE
    @DeleteMapping("/delete/{id}")
    public void BorrarUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuarioById(id);
    }
}
