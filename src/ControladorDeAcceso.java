import java.util.HashMap;

public class ControladorDeAcceso {
    private HashMap<String, Integer> permisos;

    public ControladorDeAcceso() {
        permisos = new HashMap<String, Integer>();
        permisos.put("ABC123", 2);
    }

    public boolean verificarAcceso(TarjetaRFID tarjeta, String zona) {
        Integer nivel = permisos.get(tarjeta.getCodigo());
        if (nivel != null && tarjeta.getNivelAcceso() >= nivel) {
            System.out.println("Acceso autorizado a " + zona);
            return true;
        }
        System.out.println("Acceso denegado a " + zona);
        return false;
    }
}
