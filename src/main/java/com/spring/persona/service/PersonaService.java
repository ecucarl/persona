package com.spring.persona.service;

import com.spring.persona.entities.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> obtenerTodas();
    Persona obtenerPorId(Long id);
    Persona crearPersona(Persona persona);
    Persona actualizarPersona(Long id, Persona persona);
    void eliminarPersona(Long id);
    long contarPersonas();
}
