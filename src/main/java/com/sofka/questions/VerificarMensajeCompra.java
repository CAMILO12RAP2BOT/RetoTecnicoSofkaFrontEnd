package com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofka.userinterfaces.MensajeCompraExitosaInterface.MENSAJE_COMPRA_EXITOSA;

public class VerificarMensajeCompra implements Question<Boolean> {
    public final String mensajeExitoso;

    public VerificarMensajeCompra(String mensajeExitoso) {
        this.mensajeExitoso = mensajeExitoso;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return MENSAJE_COMPRA_EXITOSA.resolveFor(actor).getText().equals(mensajeExitoso);
    }

    public static VerificarMensajeCompra verificarMensajeCompra(String mensajeExitoso) {
        return new VerificarMensajeCompra(mensajeExitoso);
    }
}
