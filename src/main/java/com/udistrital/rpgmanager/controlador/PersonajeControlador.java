/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.rpgmanager.controlador;

import com.udistrital.rpgmanager.modelo.Personaje;
import com.udistrital.rpgmanager.repositorio.PersonajeRepositorio;
import io.javalin.http.Context;
/**
 *
 * @author AnaGiraldo
 */
public class PersonajeControlador {
  private PersonajeRepositorio repositorio = new PersonajeRepositorio();  
public void obtenerTodos(Context ctx) {
        
        ctx.json(repositorio.obtenerTodos());
}
// Ruta POST: Guardar un personaje nuevo que viene en el cuerpo (body) de la petición
    public void crear(Context ctx) {
        // ctx.bodyAsClass convierte el JSON que envía el usuario a un objeto Personaje de Java
        Personaje nuevoPersonaje = ctx.bodyAsClass(Personaje.class);
        repositorio.guardar(nuevoPersonaje);
        ctx.status(201).json(nuevoPersonaje);
    }
}