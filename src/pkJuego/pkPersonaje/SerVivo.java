package pkJuego.pkPersonaje;

public abstract class SerVivo {
    private String nombre;
    private Integer estado;

    public SerVivo() {
        setEstado(1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

}
