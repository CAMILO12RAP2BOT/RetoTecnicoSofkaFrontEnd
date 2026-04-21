package com.sofka.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Comentario {

    Faker faker = new Faker(new Locale("es-CO"));

    private String comentario;

    public Comentario(String comentario) {
        this.comentario = comentario;
    }

    public Comentario() {
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String generarComentarioAleatorio() {
        return faker.lorem().paragraph();
    }
}
