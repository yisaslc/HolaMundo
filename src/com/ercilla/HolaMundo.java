package com.ercilla;

public class HolaMundo {

    public static void main (String[] args) {
          Mensaje msg = new Mensaje();
          String nombre = msg.SolicitarDatos("Escribe tu nombre: ");
          msg.saludar(nombre);
    }

}
