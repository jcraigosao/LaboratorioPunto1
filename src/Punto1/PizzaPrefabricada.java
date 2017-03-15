
package Punto1;
/** En esta clase encontraremos la "plantilla" para la creacion de pizzas
 * prefabricadas por la pizzeria
*/
public class PizzaPrefabricada {
    private String nombre;
    private int tamaño;
    private double precio;
    private Ingredientes[] ingredientes;
/** Este constructor es el que permite la creacion de 
     * objetos de tipo PizzaPrefabricada
     * @param nombre 
     * Indica el nombre de la pizza prefabricada
     * @param tamaño 
     * Indica el tamaño de la pizza prefabricada
     * @param ingredientes 
     * Indica los ingredientes de la pizza prefabricada
     */
    public PizzaPrefabricada(String nombre, int tamaño,Ingredientes[] ingredientes) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.ingredientes = ingredientes;
    }
/** Permite obtener el nombre de la pizza prefabricada
     * @return nombre*/   
    public String getNombre() {
        return nombre;
    }
/** Permite obtener el tamaño de la pizza prefabricada
     * @return tamaño*/   
    public int getTamaño() {
        return tamaño;
    }
/** Permite obtener los ingredientes de la pizza prefabricada
     * @return ingrediente*/   
    public Ingredientes[] getIngredientes() {
        return ingredientes;
    }
/** Permite cambiar el nombre de la pizza prefabricada 
 * si es necesario
     * @param nombre
     * Indica el nuevo nombre que se le asignara a la pizza prefabricada
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/** Permite cambiar el tamaño de la pizza prefabricada 
 * si es necesario
     * @param tamaño
     * Indica el nuevo tamaño que se le asignara a la pizza prefabricada
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
/** Permite cambiar los ingredientes de la pizza prefabricada 
 * si es necesario
     * @param ingredientes
     * Indica los nuevos ingredientes que se le asignaran a la pizza 
     * prefabricada
     */
    public void setIngredientes(Ingredientes[] ingredientes) {
        this.ingredientes = ingredientes;
    }
/** Se identifica el tamaño de la pizza prefabricada y el precio que llevara 
 * segun este
     * @return precio */
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
       
    
    

