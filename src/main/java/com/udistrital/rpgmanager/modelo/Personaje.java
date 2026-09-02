/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.rpgmanager.modelo;

/**
 *
 * @author AnaGiraldo
 */
public class Personaje {
    //atributos
private int id;
private String nombre;
private String clase;
private int nivel;
private int vida;
//constructores
public Personaje(String nombre,int id, int nivel,int vida,String clase) {
        this.nombre = nombre;
        this.id =id;
        this.nivel=nivel;
        this.vida=vida;
        this.clase=clase;
}

    public Personaje(String nombre, String clase, int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//getters y setters
public String getNombre() {
        return nombre;
}
public int getId() {
        return id;
    }
public int getnivel(){
        return nivel;
    }
public int getvida(){
        return vida;
    }
public String getclase(){
return clase;
}
public void setNombre(String nombre) {
        this.nombre = nombre;
}
public void setId(int id){
        this.id = id;
}
public void  setnivel(int nivel){
        this.nivel = nivel;
}
public void setvida(int vida){
        this.vida=vida;
}
public void setclase(String clase){
this.clase=clase;
}
}

