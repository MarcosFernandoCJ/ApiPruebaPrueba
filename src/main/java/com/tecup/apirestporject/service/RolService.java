package com.tecup.apirestporject.service;

import com.tecup.apirestporject.model.Rol;
import com.tecup.apirestporject.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    //listar Roles
    public List<Rol> getRoles() {
        return rolRepository.findAll();
    }

    //Crear Roles
    public Rol createRol(Rol rol) {
        return rolRepository.save(rol);
    }

    //Actualizar Roles
    public Rol updateRol(Rol rol) {
        return rolRepository.save(rol);
    }

    //Borrar Roles
    public void deleteRol(Long id) {
        rolRepository.deleteById(id);
    }
}
