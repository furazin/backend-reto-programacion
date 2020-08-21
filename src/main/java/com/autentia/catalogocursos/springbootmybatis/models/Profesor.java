package com.autentia.catalogocursos.springbootmybatis.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Profesor {

    String nombre;

    String apellidos;

    @Override
    public String toString() {
        return "Profesor{" +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
