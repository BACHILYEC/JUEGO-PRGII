package pkJuego.pkPersonaje;

public class Lobo extends SerVivo {
    public Lobo() {
        super();
        setNombre("El Lobo");
    }

    public void comer(Caperucita caperuza) {
        System.out.println("El lobo se comio a " + caperuza.getNombre());
    }
}
