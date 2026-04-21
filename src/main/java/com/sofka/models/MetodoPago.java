package com.sofka.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class MetodoPago {

    Faker faker = new Faker(new Locale("es-CO"));

    private String metodoPago;

    public MetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public MetodoPago() {
        this.metodoPago = metodoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String generaMetodoPagoAleatorio(){
        String metodo = faker.options().option("Banco", "Dinero");
        switch (metodo) {
            case "Banco" -> {
                metodoPago = "bank_transfer";
                return metodoPago;
            }
            case "Dinero" -> {
                metodoPago = "cod";
                return metodoPago;
            }
            default -> {
                return metodoPago;
            }
        }
    }
}
