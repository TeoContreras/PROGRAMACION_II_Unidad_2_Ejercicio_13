public class LectorTarjetas {
    private ControladorDeAcceso controlador;

    public LectorTarjetas(ControladorDeAcceso controlador) {
        this.controlador = controlador;
    }

    public void leerTarjeta(TarjetaRFID tarjeta, String zona) {
        System.out.println("Leyendo tarjeta " + tarjeta.getCodigo());
        controlador.verificarAcceso(tarjeta, zona);
    }
}
