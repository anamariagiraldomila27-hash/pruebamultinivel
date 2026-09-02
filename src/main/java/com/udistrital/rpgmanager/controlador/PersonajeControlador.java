/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.rpgmanager.controlador;

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
}