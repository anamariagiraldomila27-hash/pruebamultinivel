/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.rpgmanager.repositorio;

import com.udistrital.rpgmanager.modelo.Personaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AnaGiraldo
 */
public class PersonajeRepositorio {
// Paso 2: Declarar la lista estática en memoria
    private static List<Personaje> personajes = new ArrayList<>();

    // Paso 3a: Método para obtener todos los personajes
    public List<Personaje> obtenerTodos() {
        // ¿Qué debes retornar aquí?
        return personajes;
        // ¿Qué debes retornar aquí?
    }

    //  Método para guardar un personaje
    public void guardar(Personaje personaje) {
        personajes.add(personaje);
    }
}
