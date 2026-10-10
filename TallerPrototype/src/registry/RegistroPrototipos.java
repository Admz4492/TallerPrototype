
package registry;

import java.util.HashMap;
import java.util.Map;
import prototype.Personaje;

public class RegistroPrototipos {

    private Map<String, Personaje> prototipos;

    public RegistroPrototipos() {
        prototipos = new HashMap<>();
    }

    public void registrarPrototipo(String clave, Personaje personaje) {
        prototipos.put(clave, personaje);
    }

    public Personaje obtenerCopia(String clave) {
        Personaje prototipo = prototipos.get(clave);

        if (prototipo == null) {
            return null;
        }

        return prototipo.clonar();
    }
}