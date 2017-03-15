
package Punto1;
/** En esta clase se crearan los objetos de tipo Bebidas, Ingredientes, 
    * PizzaPrefabricada, PizzaLibre y Pedido
    * Ademas se correrá el programa*/

public class Main {
    
    
    public static void main(String[] args) throws InterruptedException {
        java.util.Scanner lectura= new java.util.Scanner(System.in); 
        int cantidad=0;
        int respuesta;
        System.out.println("Desea ordenar una pizza libre.......");
        System.out.println("1: Si / 0: No");
        respuesta= lectura.nextInt();
        if(respuesta==1){
        System.out.println("Cuantos ingredientes desea en su pizza libre: ");
        cantidad= lectura.nextInt();
        }
        //primero escoja los ingredientes y los coloca en las 
        //primeras n posiciones empezando desde el 0, luego cuando 
        //corra el programa determina el numero de ingredientes 
        //que escogio
        
        Ingredientes[] n1= new Ingredientes[20];
        n1[0]= new Ingredientes("maiz", 2500);
        n1[1]= new Ingredientes("carne", 4000);
        n1[2]= new Ingredientes("pollo", 3000);
        n1[3]= new Ingredientes("tocineta", 3500);
        n1[4]= new Ingredientes("queso mozzarella", 1800);
        n1[5]= new Ingredientes("guacamole", 2500);
        n1[6]= new Ingredientes("aji", 2800);
        n1[7]= new Ingredientes("piña", 2500);
        n1[8]= new Ingredientes("champiñones", 4500);
        n1[9]= new Ingredientes("salami", 3000);
        n1[10]= new Ingredientes("oregano", 1500);
        n1[11]= new Ingredientes("aceitunas", 2900);
        n1[12]= new Ingredientes("espinaca", 3000);
        n1[13]= new Ingredientes("lomo de cerdo", 4500);
        n1[14]= new Ingredientes("jamon", 2800);
        n1[15]= new Ingredientes("chorizo", 4500);
        n1[16]= new Ingredientes("tomate", 2500);
        n1[17]= new Ingredientes("base crujiente", 0);
        n1[18]= new Ingredientes("relleno de bocadillo", 0);
        n1[19]= new Ingredientes("relleno de queso", 0);
        
        Ingredientes[] española_ing= new Ingredientes[4];
        española_ing [0]= new Ingredientes("chorizo");
        española_ing [1]= new Ingredientes("queso mozzarella");
        española_ing [2]= new Ingredientes("salami");
        española_ing [3]= new Ingredientes("base crujiente");
        
        Ingredientes[] napolitana_ing= new Ingredientes[3];
        napolitana_ing [0]= new Ingredientes("tomate");
        napolitana_ing [1]= new Ingredientes("oregano");
        napolitana_ing [2]= new Ingredientes("queso mozzarella");
        
        Ingredientes[] hawaiana_ing= new Ingredientes[3];
        hawaiana_ing [0]= new Ingredientes("jamon");
        hawaiana_ing [1]= new Ingredientes("queso mozzarella");
        hawaiana_ing [2]= new Ingredientes("piña");
        
        Ingredientes[] polloychampi_ing= new Ingredientes[3];
        polloychampi_ing [0]= new Ingredientes("pollo");
        polloychampi_ing [1]= new Ingredientes("champiñones");
        polloychampi_ing [2]= new Ingredientes("queso mozzarella");
        
        Bebidas b1= new Bebidas("Coca cola", "grande");
        Bebidas b2= new Bebidas("Sprite", "pequeña");
        Bebidas b3= new Bebidas("Limonada", "grande");
        Bebidas b4= new Bebidas("Schweppes", "pequeña");
        Bebidas b5= new Bebidas("Kola Roman", "grande");
        
        PizzaPrefabricada p1= new PizzaPrefabricada("Española", 12, española_ing);
        PizzaPrefabricada p2= new PizzaPrefabricada("Napolitana", 9, napolitana_ing);
        PizzaPrefabricada p3= new PizzaPrefabricada("Hawaiana", 12, hawaiana_ing);
        PizzaPrefabricada p4= new PizzaPrefabricada("Pollo/champiñones", 6, polloychampi_ing);
        
        PizzaLibre PL= new PizzaLibre("A mi estilo", n1, 12);
      
        if(respuesta==1){
            Pedido pedido= new Pedido(b1,PL);
            pedido.preciofinal(cantidad);
            pedido.mostrarproceso();
        }else if(respuesta==0){
            Pedido pedido= new Pedido(b1,p1);
            pedido.preciofinal();
            pedido.mostrarproceso();
        }
          
    }
    
}
