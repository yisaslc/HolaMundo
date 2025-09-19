package com.ercilla;
public class persona {

}
public class HolaMundo {

    public static void main (String[] args) {
          Mensaje msg = new Mensaje();
          String nombre = msg.SolicitarDatos("Escribe tu nombre: ");
          String apellidos = msg.SolicitarDatos("Escribe tu apellido");
          persona p1 = new Persona(nombre, apellidos);
          msg.saludar(p1);
    }
}
