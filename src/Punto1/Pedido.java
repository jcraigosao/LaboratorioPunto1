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
public class Pedido {
    private Bebidas bebida;
    private PizzaPrefabricada pizzapref;
    private PizzaLibre pizzalib;
   

    public Pedido(Bebidas bebida, PizzaPrefabricada pizzapref, PizzaLibre pizzalib) {
        this.bebida = bebida;
        this.pizzapref = pizzapref;
        this.pizzalib = pizzalib;
    }

    public Pedido(Bebidas bebida, PizzaPrefabricada pizzapref) {
        this.bebida = bebida;
        this.pizzapref = pizzapref;
    }

    public Pedido(Bebidas bebida, PizzaLibre pizzalib) {
        this.bebida = bebida;
        this.pizzalib = pizzalib;
    }
    
    
    public double preciofinal(){
        double preciototal;
        
        double a = bebida.precioxtamaño();
        double b = pizzapref.precioxtamaño();
        double c = pizzalib.precioxtamaño();
        if (a!=0 && b!=0 && c!=0){
        preciototal= a+ b+ c;
        System.out.println("Valor total a pagar: "+preciototal);
         return preciototal;
       }else if(a!=0 && b!=0){
        preciototal= a+b;
        System.out.println("Valor total a pagar: "+preciototal);
        return preciototal;
       }else if(b!=0 && c!=0){
           preciototal= b+c;
           System.out.println("Valor total a pagar: "+preciototal);
            return preciototal;
       }
        return 0;
    }
    public String mostrarproceso(){
        String a= "Realizando pedido";
        String b= "Elaborando la pizza";
        String c= "Horneando la pizza";
        String d= "Sirviendo la pizza";
        String e= "¡¡Su pizza esta lista!!";
        for(int i= 0; i<5; i++){
            System.out.print(i+1+".)  ");
            switch (i){
                case 0:
                    System.out.println(a);
                break;
                case 1:
                    System.out.println(b);
                    break;
                case 2:
                    System.out.println(c);
                    break;
                case 3:
                    System.out.println(d);
                    break;
                case 4:
                    System.out.println(e);
                    break;
                default:
                    break;
            }
            
        }
        return null;
    }
}
