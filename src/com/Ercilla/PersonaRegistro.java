package com.Ercilla;

public record PersonaRegistro() {
    public String toString (){
        return "%s %s" .formatted(nombre, apellidos);
    }
} s
