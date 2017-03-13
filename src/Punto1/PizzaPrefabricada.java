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
public class PizzaPrefabricada {
    private String nombre;
    private int tamaño;
    private double precio;
    private Ingredientes[] ingredientes;

    public PizzaPrefabricada(String nombre, int tamaño,Ingredientes[] ingredientes) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.ingredientes = new Ingredientes[3];
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public Ingredientes[] getIngredientes() {
        return ingredientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setIngredientes(Ingredientes[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    public double precioxtamaño(){
        switch (tamaño) {
            case 6:
                precio= 12000;
                break;
            case 9:
                precio= 18000;
                break;
            case 12:
                precio= 23000;
                break;
            default:
                break;
        }
        return precio;
    }
}
       
    
    

