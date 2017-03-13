 
package Punto1;


public class Bebidas {
    private String nombre;
    private String tamaño;
    private double precio;

    public Bebidas(String nombre, String tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double precioxtamaño(){
        switch (tamaño){
            case "pequeño":
                precio= 4000;
            
            case "grande":
                precio= 7000;
        }
        return precio;
    }
    
}
