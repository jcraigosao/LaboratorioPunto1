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
public class Main {
    public static void main(String[] args) {
        
        Ingredientes[] n1= new Ingredientes[5];
        n1[0]= new Ingredientes("maiz", 2500);
        n1[1]= new Ingredientes("carne", 4000);
        n1[2]= new Ingredientes("pollo", 3000);
        n1[3]= new Ingredientes("tocineta", 4000);
        n1[4]= new Ingredientes("queso", 1500);
        
        
        Ingredientes[] n2= new Ingredientes[3];
        n2 [0]= new Ingredientes("chorizo");
        n2 [1]= new Ingredientes("queso");
        n2 [2]= new Ingredientes("salami");
        
        
        Bebidas bebida= new Bebidas("Coca cola", "grande");
        
        PizzaPrefabricada x= new PizzaPrefabricada("Española", 6, n2);
        PizzaLibre y= new PizzaLibre("A mi estilo", n1, 9);
        y.setIngrediente(n1);
        Pedido pedido= new Pedido(bebida,x, y);
        
        pedido.preciofinal();
        pedido.mostrarproceso();
        
    }
    
}
