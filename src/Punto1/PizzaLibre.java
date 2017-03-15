
package Punto1;
/** En esta clase encontraremos la "plantilla" para la creacion de pizzas
 * (libres) creadas por el cliente 
*/
public class PizzaLibre {
    private String nombre;
    private Ingredientes[] ingrediente;    
    private int tamaño;

/** Este constructor es el que permite la creacion de 
     * objetos de tipo PizzaLibre
     * @param nombre 
     * Indica el nombre de la pizza libre
     * @param ingrediente 
     * Indica los ingredientes de la pizza libre
     * @param tamaño 
     * Indica el tamaño de la pizza libre
     */
    public PizzaLibre(String nombre, Ingredientes[] ingrediente, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.ingrediente= ingrediente;
    }
/** Permite obtener el nombre de la pizza libre
     * @return nombre*/   
    public String getNombre() {
        return nombre;
    }
/** Permite obtener el tamaño de la pizza libre
     * @return tamaño*/   
    public int getTamaño() {
        return tamaño;
    }
/** Permite cambiar el nombre de la pizza libre si es necesario
     * @param nombre
     * Indica el nuevo nombre que se le asignara a la pizza libre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/** Permite cambiar el tamaño de la pizza libre si es necesario
     * @param tamaño
     * Indica el nuevo tamaño que se le asignara a la pizza libre
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
/** Permite cambiar los ingredientes de la pizza libre si es necesario
     * @param ingrediente
     * Indica los nuevos ingredientes que se le asignaran a la pizza libre
     */
    public void setIngrediente(Ingredientes[] ingrediente) {
        this.ingrediente = ingrediente;
    }
/** Permite obtener los ingredientes de la pizza libre
     * @return ingrediente*/   
    public Ingredientes[] getIngrediente() {
        return ingrediente;
    }
/** Se identifica el tamaño de la pizza libre y el precio que llevara 
 * segun este
     * @param cantidad_ing
     * con este parametro se determina la cantidad de ingredientes que se 
     * agregaran a la pizza y asi establecer su precio
     * @return precioxtam */
    public double precioxtamaño(int cantidad_ing){
        double precio=0;
        double precioxtam=0;

        for (int i=0; i<cantidad_ing; i++){
            precio+=ingrediente[i].getPrecio();
        }
        
        switch (tamaño) {
            case 6:
                precioxtam= precio;
                break;
            case 9:
                precioxtam= 1.5*precio;
                break;
            case 12:
                precioxtam= 2*precio;
                break;
            default:
                break;
        
        }
        
       
    
    return precioxtam;
}
}
