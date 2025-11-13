package pkJuego.pkPersonaje;

public class Barca {
    private Integer estado;

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Barca() {
        setEstado(1);
    }

    public void cruzarPersonaje(SerVivo ser, Observador obs) {
        if (ser.getEstado() == obs.getEstado()) {
            if (ser == obs) {
                System.out.println("El observador cruza solo");
                obs.setEstado(-obs.getEstado());
            } else {
                System.out.println("Cruza " + ser.getNombre() + " con el observador");
                ser.setEstado(-ser.getEstado());
                obs.setEstado(-obs.getEstado());
            }
        } else
            System.out.println("No esta el observador en el mismo lado");
    }
}