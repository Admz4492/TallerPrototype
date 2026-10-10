
package main;

import model.Inventario;
import prototype.Personaje;
import registry.RegistroPrototipos;

public class Main {

    public static void main(String[] args) {

        // Crear los inventarios iniciales
        Inventario inventarioGuerrero = new Inventario();
        inventarioGuerrero.agregarObjeto("Poción de vida");

        Inventario inventarioMago = new Inventario();
        inventarioMago.agregarObjeto("Báculo mágico");
        inventarioMago.agregarObjeto("Poción de maná");

        // Crear los prototipos base
        Personaje guerrero = new Personaje(
            "Guerrero",
            "Guerrero",
            inventarioGuerrero
        );

        Personaje mago = new Personaje(
            "Mago",
            "Mago",
            inventarioMago
        );

        // Registrar los prototipos
        RegistroPrototipos registro = new RegistroPrototipos();
        registro.registrarPrototipo("guerrero", guerrero);
        registro.registrarPrototipo("mago", mago);

        // Obtener copias desde el registro
        Personaje guerreroCopia =
                registro.obtenerCopia("guerrero");

        Personaje magoCopia =
                registro.obtenerCopia("mago");

        // Personalizar las copias
        guerreroCopia.setNombre("Guerrero-Copia");
        guerreroCopia.getInventario().agregarObjeto("Escudo");

        magoCopia.setNombre("Mago-Copia");
        magoCopia.getInventario().agregarObjeto("Libro de hechizos");

        // Mostrar resultados
        System.out.println("=== PROTOTIPOS ORIGINALES ===");
        System.out.println(guerrero);
        System.out.println(mago);

        System.out.println("\n=== PERSONAJES CLONADOS ===");
        System.out.println(guerreroCopia);
        System.out.println(magoCopia);

        // Comprobar el comportamiento ante una clave inexistente
        Personaje inexistente = registro.obtenerCopia("arquero");

        System.out.println("\n=== PRUEBA DE PROTOTIPO INEXISTENTE ===");

        if (inexistente == null) {
            System.out.println("No existe el prototipo solicitado.");
        }
    }
}