package com.ercilla;

import java.util.Scanner;

public class Mensaje {
      public String SolicitarDatos (String mensaje){
          System.out.print(mensaje);
          Scanner scn = new Scanner(System.in);
          return scn.nextLine();
      }

    public void saludar(String nombre) {
          System.out.printf("Hola %s, bienvenido a Java \n",nombre);
    }
}
