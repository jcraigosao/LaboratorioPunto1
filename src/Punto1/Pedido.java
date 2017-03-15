
package Punto1;
/** En esta clase es donde se asocian las clases Bebidas, 
 * PizzaLibre y PizzaPrefabricada.
 * Ademas es la "plantilla" para la creacion de pedidos*/  

public class Pedido {
    private Bebidas bebida;
    private PizzaPrefabricada pizzapref;
    private PizzaLibre pizzalib;
/** Este constructor es el que permite la creacion de 
     * objetos de tipo Pedido
     * @param bebida
     * Indica la bebida que se escogera en el pedido
     * @param pizzapref
     * Indica la pizza prefabricada que se escogera en el pedido
     * @param pizzalib
     * Indica la pizza libre que se escogera en el pedido
     */    
    public Pedido(Bebidas bebida, PizzaPrefabricada pizzapref, PizzaLibre pizzalib) {
        this.bebida = bebida;
        this.pizzapref = pizzapref;
        this.pizzalib = pizzalib;
    }
/** Este constructor es otro que permite crear objetos  
     * de tipo Pedido con menor cantidad u otros parametros
     * @param bebida
     * Indica la bebida que se escogera en el pedido
     * @param pizzapref 
     * Indica la pizza prefabricada que se escogera en el pedido
     */
    public Pedido(Bebidas bebida, PizzaPrefabricada pizzapref) {
        this.bebida = bebida;
        this.pizzapref = pizzapref;
    }
/** Este constructor es otro que permite crear objetos  
     * de tipo Pedido con menor cantidad u otros parametros
     * @param bebida
     * Indica la bebida que se escogera en el pedido
     * @param pizzalib
     * Indica la pizza libre que se escogera en el pedido
     */
    public Pedido(Bebidas bebida, PizzaLibre pizzalib) {
        this.bebida = bebida;
        this.pizzalib = pizzalib;
    }
/** Se determina el precio final a pagar cuando se ordeno 
    * una bebida y una pizza prefabricada
    * @return preciototal
    */
    public double preciofinal(){
        double a = bebida.precioxtamaño();
        double b = pizzapref.precioxtamaño();
        double preciototal;
        preciototal= a+b;
        System.out.println("Valor total a pagar: "+preciototal);
        return preciototal;
    }
/** Se determina el precio final a pagar cuando se ordeno 
    * una bebida y una pizza libre
        * @param cantidad
        * Este parametro permite asignar la cantidad de ingredientes
        * que tendra la pizza libre
    * @return preciototal
    */    
    public double preciofinal(int cantidad){
        double a = bebida.precioxtamaño();
        double c = pizzalib.precioxtamaño(cantidad);
        double preciototal;
        preciototal= a+c;
        System.out.println("Valor total a pagar: "+preciototal);
        
        return preciototal;
    }
/** Permite mostrar el proceso de elaboracion de la pizza desde 
 * que se pide hasta que se entrega    
     * @return  null    
     * @throws java.lang.InterruptedException
     * Permite detener por unos segundos el programa mientas se pasa de
     * un paso a otro en la elaboracion de la pizza
     */    
    public String mostrarproceso() throws InterruptedException{
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
                    Thread.sleep(5000);
                    System.out.println(b);
                    break;
                case 2:
                    Thread.sleep(9000);
                    System.out.println(c);
                    break;
                case 3:
                    Thread.sleep(9000);
                    System.out.println(d);
                    break;
                case 4:
                    Thread.sleep(5000);
                    System.out.println(e);
                    break;
                default:
                    break;
            }
            
        }
        return null;
    }
}
