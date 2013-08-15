/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author eduardoirias
 */
public class Vehiculo {
    private String placa;
    private String color;
    
    public Vehiculo (String placa, String color)  {
        this.placa = placa;
        this.color = color;
    }
    
    public String getPlaca () {
        return placa;
    }
    
    public String getColor () {
        return color;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
