public class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    // Getters y Setters con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCantidadPeticiones() {
        return cantidadPeticiones;
    }

    public void setCantidadPeticiones(int cantidadPeticiones) {
        if (cantidadPeticiones >= 0) {
            this.cantidadPeticiones = cantidadPeticiones;
        }
    }

    // Métodos de acción
    public void iniciar() {
        this.activo = true;
        System.out.println("El servicio " + nombre + " ha iniciado.");
    }

    public void detener() {
        this.activo = false;
        System.out.println("El servicio " + nombre + " se ha detenido.");
    }

    public void registrarPeticion() {
        if (this.activo) {
            this.cantidadPeticiones++;
            System.out.println("Petición registrada. Total: " + this.cantidadPeticiones);
        } else {
            System.out.println("No se puede registrar petición, el servicio está detenido.");
        }
    }
}
