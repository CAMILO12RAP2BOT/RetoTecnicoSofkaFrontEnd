package com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.userinterfaces.ConfirmarCompraInterface.BOTON_CONFIRMAR_COMPRA;

public class ConfirmarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_CONFIRMAR_COMPRA, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(BOTON_CONFIRMAR_COMPRA)
        );
    }

    public static ConfirmarCompra confirmarCompra() {
        return Tasks.instrumented(ConfirmarCompra.class);
    }
}
