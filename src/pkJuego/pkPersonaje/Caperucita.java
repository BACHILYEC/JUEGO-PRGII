package pkJuego.pkPersonaje;

public class Caperucita extends SerVivo {
    public Caperucita() {
        super();
        setNombre("La Caperuza");
    }

    public void comer(Uva uvita) {
        System.out.println("La caperuza se comio la " + uvita.getNombre());
    }
}
