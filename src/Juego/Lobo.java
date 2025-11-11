package Juego;

public class Lobo extends Personaje {
public Lobo () {
    super();
    setEstado(1);
}
public void comer(Caperucita caperucita) {  
    System.out.println("El lobo se comio a"+ caperucita.getNombre()); 
}
}
