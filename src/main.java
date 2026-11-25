public class main {
    public static void main(String[] args) {
        ControladorDeAcceso controlador = new ControladorDeAcceso();
        LectorTarjetas lector = new LectorTarjetas(controlador);

        TarjetaRFID valida = new TarjetaRFID("ABC123", 3);
        TarjetaRFID invalida = new TarjetaRFID("XYZ999", 3);

        lector.leerTarjeta(valida, "Oficina");
        lector.leerTarjeta(invalida, "Oficina");
    }
}
