//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Servicio servicioWeb = new Servicio();

        servicioWeb.setNombre("API REST");
        servicioWeb.setPuerto(8080);

        // Probando validación (puerto negativo no debe guardarse)
        servicioWeb.setPuerto(-1);
        System.out.println("Puerto actual (se mantiene en 8080): " + servicioWeb.getPuerto());

        // Probando ejecución
        servicioWeb.iniciar();
        servicioWeb.registrarPeticion();
        servicioWeb.registrarPeticion();

        servicioWeb.detener();
    }
}