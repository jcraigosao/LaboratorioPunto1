 
package Punto1;

/** En esta clase encontraremos la "plantilla" para la creacion de bebidas */
public class Bebidas {
    private String nombre;
    private String tamaño;
    private double precio;

/** Este constructor es el que permite la creacion de 
     * objetos de tipo Bebidas
     * @param nombre
     * Indica el nombre de la bebida
     * @param tamaño 
     * Indica el tamaño de la bebida
     */
    public Bebidas(String nombre, String tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }
/** Permite obtener el nombre de la bebida
     * @return nombre*/
    public String getNombre() {
        return nombre;
    }
/** Permite obtener el tamaño de la bebida
     * @return tamaño*/
    public String getTamaño() {
        return tamaño;
    }
/** Permite cambiar el nombre de la bebida si es necesario
     * @param nombre
     * Indica el nuevo nombre que se le asignara a la bebida
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/** Permite cambiar el tamaño de la bebida si es necesario
     * @param tamaño
     * Indica el nuevo tamaño que se le asignara a la bebida
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
/** Se identifica el tamaño de la bebida y el precio que llevara 
 * segun este
     * @return precio */
    public double precioxtamaño(){
        switch (tamaño){
            case "pequeña":
                precio= 4000;
            
            case "grande":
                precio= 7000;
        }
        return precio;
    }
    
}
