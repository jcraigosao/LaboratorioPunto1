
package Punto1;
/** En esta clase encontraremos la "plantilla" para la creacion de ingredientes */
public class Ingredientes {
    private String nombre;
    private double precio;
/** Este constructor es el que permite la creacion de 
     * objetos de tipo Ingredientes
     * @param nombre
     * Indica el nombre del ingrediente
     * @param precio 
     * Indica el precio del ingrediente
     */
    public Ingredientes(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
/** Este constructor permite otra forma para crear objetos 
     * de tipo Ingredientes con menor cantidad de parametros
     * @param nombre
     * Indica el nombre del ingrediente
     */
    public Ingredientes(String nombre) {
        this.nombre = nombre;
    }
    
/** Permite obtener el nombre del ingrediente
     * @return nombre*/   
    public String getNombre() {
        return nombre;
    }
/** Permite obtener el precio del ingrediente
     * @return precio*/   
    public double getPrecio() {
        return precio;
    }
/** Permite cambiar el nombre del ingrediente si es necesario
     * @param nombre
     * Indica el nuevo nombre que se le asignara al ingrediente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/** Permite cambiar el precio del ingrediente si es necesario
     * @param precio
     * Indica el nuevo precio que se le asignara al ingrediente
     */
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
