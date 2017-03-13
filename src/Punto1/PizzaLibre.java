/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

/**
 *
 * @author i7hpinñi
 */
public class PizzaLibre {
    private String nombre;
    private Ingredientes[] ingrediente;    
    private int tamaño;
    private double precio;


    public PizzaLibre(String nombre, Ingredientes[] ingrediente, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.ingrediente= new Ingredientes[5];
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setIngrediente(Ingredientes[] ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Ingredientes[] getIngrediente() {
        return ingrediente;
    }

    public double precioxtamaño(){
        double w= ingrediente[0].getPrecio();
        double l= ingrediente[1].getPrecio();
        double m= ingrediente[2].getPrecio();
        double n= ingrediente[3].getPrecio();
        double o= ingrediente[4].getPrecio();
        double k= w+l+m+n+o;
        switch (tamaño) {
            case 6:
                precio= k;
              
            case 9:
                precio= (1.5)*k;
               
            case 12:
                precio= 2*k;
              
            default:
                break;
        }
        return precio;
    }
    
}
