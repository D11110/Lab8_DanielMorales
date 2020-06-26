/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_danielmorales;

/**
 *
 * @author danie
 */
public class SerVivo {
    private String nombre;
    private int poder;
    private String años;
    private String planetaProcedencia;
    private String raza;

    public SerVivo() {
    }

    public SerVivo(String nombre, int poder, String años, String planetaProcedencia, String raza) {
        this.nombre = nombre;
        this.poder = poder;
        this.años = años;
        this.planetaProcedencia = planetaProcedencia;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    public String getPlanetaProcedencia() {
        return planetaProcedencia;
    }

    public void setPlanetaProcedencia(String planetaProcedencia) {
        this.planetaProcedencia = planetaProcedencia;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", poder=" + poder + ", a\u00f1os=" + años + ", planetaProcedencia=" + planetaProcedencia + ", raza=" + raza + '}';
    }
    
    
}
