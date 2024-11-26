package com.tecup.apirestporject.controller;

import com.tecup.apirestporject.model.Rol;
import com.tecup.apirestporject.model.Usuario;
import com.tecup.apirestporject.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/roles")
public class RolController {

    @Autowired
    private RolService rolService;


    @GetMapping("/listar")
    public List<Rol> ListarRoles() {
        return rolService.getRoles();
    }

    //POST
    @PostMapping("/crear")
    public Rol CrearRol(@RequestBody Rol rol) {
        return rolService.createRol(rol);
    }

    //PUT

    @PutMapping("/edit/{id}/")
    public Rol EditarRol(@PathVariable Long id, @RequestBody Rol rol) {
        rol.setId(id);
        return rolService.updateRol(rol);
    }
    //DELETE
    @DeleteMapping("/delete/{id}")
    public void BorrarRol(@PathVariable Long id) {
        rolService.deleteRol(id);
    }
}
