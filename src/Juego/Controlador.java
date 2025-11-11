package Juego;

import java.util.Scanner;

public class Controlador {

    Caperucita caperucita = new Caperucita();
    Lobo lobo = new Lobo();
    Uva uva = new Uva();
    Observador observador = new Observador();
    public Integer personaje;
    public Boolean juego = true;
    Scanner sc = new Scanner(System.in);

    public void iniciarJuego() {
        while (juego) {
            System.out.println("Iniciando juego:");
            System.out.println("Escoge Personaje para Cruzar");
            System.out.println("1. Caperucita");
            System.out.println("2. Lobo");
            System.out.println("3. Uva");
            System.out.println("4. Observador");
            personaje = sc.nextInt();
            switch (personaje) {
                case 1:
                    System.out.println("Caperucita ha cruzado el rio");
                    caperucita.setEstado(-caperucita.getEstado());
                    observador.setEstado(-observador.getEstado());
                    break;
                case 2:
                    System.out.println("Lobo ha cruzado el rio");
                    lobo.setEstado(-lobo.getEstado());
                    observador.setEstado(-observador.getEstado());
                    break;
                case 3:
                    System.out.println("Uva ha cruzado el rio");
                    uva.setEstado(-uva.getEstado());
                    observador.setEstado(-observador.getEstado());
                    break;
                case 4:
                    System.out.println("Observador ha cruzado solo el rio");
                    observador.setEstado(-observador.getEstado());
                    break;
            }
            if (caperucita.getEstado() == lobo.getEstado() && observador.getEstado() != lobo.getEstado()) {
                System.out.println("Perdiste");
                lobo.comer(caperucita);
                juego = false;
            } else if (caperucita.getEstado() == uva.getEstado() && observador.getEstado() != uva.getEstado()) {
                System.out.println("Perdiste");
                caperucita.comer(uva);
                juego = false;
            } else if (caperucita.getEstado() == -1 && lobo.getEstado() == -1 && uva.getEstado() == -1 && observador.getEstado() == -1) {
                System.out.println("Ganaste el juego");
                juego = false;
            }
        }
    }
}
