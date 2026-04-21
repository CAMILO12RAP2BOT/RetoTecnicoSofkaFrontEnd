package com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.userinterfaces.ProcesarCarroInterface.HIPERVINCULO_COMPRAR;

public class ProcesarCarro implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HIPERVINCULO_COMPRAR, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(HIPERVINCULO_COMPRAR)
        );
    }

    public static ProcesarCarro procesarCarro() {
        return Tasks.instrumented(ProcesarCarro.class);
    }
}
