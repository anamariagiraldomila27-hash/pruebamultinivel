/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.udistrital.rpgmanager;

import com.udistrital.rpgmanager.controlador.PersonajeControlador;
import io.javalin.Javalin;

/**
 *
 * @author AnaGiraldo
 */
public class Mavenproject2 {

    public static void main(String[] args) {

        // Instanciamos el controlador
        PersonajeControlador controlador = new PersonajeControlador();

        // Iniciamos el servidor en el puerto 7070
        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public");
        }).start (7071);

        // Definimos las rutas web mapeadas a los métodos del controlador
        app.get("/personajes", controlador::obtenerTodos);
        app.post("/personajes", controlador::crear);
    }
}
