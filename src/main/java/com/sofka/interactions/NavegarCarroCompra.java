package com.sofka.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.userinterfaces.VisulizarCarroInterface.BOTON_PREVIA_CARRO;
import static com.sofka.userinterfaces.VisulizarCarroInterface.HIPERVINCULO_CARRO;

public class NavegarCarroCompra implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_PREVIA_CARRO, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(BOTON_PREVIA_CARRO),
                WaitUntil.the(HIPERVINCULO_CARRO, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(HIPERVINCULO_CARRO)
        );
    }

    public static NavegarCarroCompra navegarCarroCompra() {
        return Tasks.instrumented(NavegarCarroCompra.class);
    }
}
