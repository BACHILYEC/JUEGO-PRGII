package Juego;

public abstract class Personaje {
private String nombre;
private Integer estado;
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

public Personaje() {
}

}
