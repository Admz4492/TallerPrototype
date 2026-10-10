
package prototype;

import model.Inventario;

public class Personaje {

    private String nombre;
    private String clase;
    private Inventario inventario;

    public Personaje(String nombre, String clase, Inventario inventario) {
        this.nombre = nombre;
        this.clase = clase;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public Personaje clonar() {
        return new Personaje(
            this.nombre,
            this.clase,
            this.inventario.copiar()
        );
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + ", Clase: " + clase
                + ", Inventario: " + inventario;
    }
}