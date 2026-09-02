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
        
        ctx.redirect("/index.html");
}
// Ruta POST: Guardar un personaje nuevo que viene en el cuerpo (body) de la petición
    public void crear(Context ctx) {
        
        String nombre = ctx.formParam("nombre");
        String clase = ctx.formParam("clase");
        int nivel = Integer.parseInt(ctx.formParam("nivel"));
        
        Personaje nuevoPersonaje = new Personaje(nombre, clase, nivel);
        repositorio.guardar(nuevoPersonaje);
        ctx.redirect("/index.html");
    }
}