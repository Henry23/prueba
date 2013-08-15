package javaapplication1;

public class Casa {
    String direccion;
    String color;
    
    public Casa() {
    }

    public Casa(String direccion, String color) {
        this.direccion = direccion;
        this.color = color;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
