package com.Ercilla;

public record PersonaRegistro() {
    public String toString (){
        //La línea se puede eliminar
        //System.out.println("Esta instruccion es inservible");
        return "%s %s" .formatted(nombre, apellidos);
    }
}
