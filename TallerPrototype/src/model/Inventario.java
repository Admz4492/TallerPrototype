
package model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<String> objetos;

    public Inventario() {
        this.objetos = new ArrayList<>();
    }

    public void agregarObjeto(String objeto) {
        objetos.add(objeto);
    }

    public List<String> getObjetos() {
        return new ArrayList<>(objetos);
    }

    public Inventario copiar() {
        Inventario copia = new Inventario();
        copia.objetos.addAll(this.objetos);
        return copia;
    }

    @Override
    public String toString() {
        return objetos.toString();
    }
}