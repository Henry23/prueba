/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Henry
 */
public class Persona_Juridica {
    private String rtm;
    private String nombre;

    public Persona_Juridica() {
    }

    public Persona_Juridica(String rtm, String nombre) {
        this.rtm = rtm;
        this.nombre = nombre;
    }

    public String getRtm() {
        return rtm;
    }

    public void setRtm(String rtm) {
        this.rtm = rtm;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona_Juridica{" + "rtm=" + rtm + ", nombre=" + nombre + '}';
    }
    
}
