package pkJuego;

import java.util.Scanner;

import pkJuego.pkPersonaje.Barca;
import pkJuego.pkPersonaje.Caperucita;
import pkJuego.pkPersonaje.Lobo;
import pkJuego.pkPersonaje.Observador;
import pkJuego.pkPersonaje.Uva;

public class Controlador {
    Caperucita caperucita = new Caperucita();
    Lobo lobo = new Lobo();
    Uva uva = new Uva();
    Observador observador = new Observador();
    Barca barca = new Barca();
    Integer personaje;
    boolean juego = true;
    String espaciado = "\t\t\t";
    String Amarillo = "\u001B[33m";
    String Blanco = "\u001B[37m";
    String Rojo = "\u001B[31m";
    String Verde = "\u001B[32m";
    String Azul = "\u001B[34m";
    Scanner sc = new Scanner(System.in);

    public void iniciarJuego() {
        System.out.println(Rojo);
        System.out.println("Iniciando juego:");
        System.out.print(Blanco);
        while (juego) {
            System.out.println(Azul);
            System.out.println("Izquierda" + "\t\t" + "Derecha");
            System.out.println(Blanco);
            if (caperucita.getEstado() == 1) {
                System.out.println("1. Caperucita ");
            } else {
                System.out.println(espaciado + "1.Caperucita ");
            }

            if (lobo.getEstado() == 1) {
                System.out.println("2. Lobo ");
            } else {
                System.out.println(espaciado + "2. Lobo ");
            }

            if (uva.getEstado() == 1) {
                System.out.println("3. Uva ");
            } else {
                System.out.println(espaciado + "3. Uva ");
            }

            if (observador.getEstado() == 1) {
                System.out.println("4. Observador ");
            } else {
                System.out.println(espaciado + "4. Observador ");
            }
            validarRegla();
            System.out.println(Amarillo);
            System.out.println("Seleccione el personaje: ");
            personaje = sc.nextInt();
            System.out.println(Blanco);
            switch (personaje) {
                case 1:
                    barca.cruzarPersonaje(caperucita, observador);
                    break;
                case 2:
                    barca.cruzarPersonaje(lobo, observador);
                    break;
                case 3:
                    barca.cruzarPersonaje(uva, observador);
                    break;
                case 4:
                    barca.cruzarPersonaje(observador, observador);
                    break;
            }

        }

    }

    public void validarRegla() {
        if (caperucita.getEstado() == lobo.getEstado() && lobo.getEstado() == uva.getEstado()
                && observador.getEstado() != lobo.getEstado()) {
            System.out.println("Perdiste");
            caperucita.comer(uva);
            lobo.comer(caperucita);
            juego = false;
        } else if (caperucita.getEstado() == uva.getEstado() && observador.getEstado() != uva.getEstado()) {
            System.out.println("Perdiste");
            caperucita.comer(uva);
            juego = false;
        } else if (caperucita.getEstado() == lobo.getEstado() && observador.getEstado() != lobo.getEstado()) {
            System.out.println("Perdiste");
            lobo.comer(caperucita);
            juego = false;
        } else if (caperucita.getEstado() == -1 && lobo.getEstado() == -1 && uva.getEstado() == -1
                && observador.getEstado() == -1) {
            System.out.println("Ganaste el juego");
            juego = false;
        }
    }
}
