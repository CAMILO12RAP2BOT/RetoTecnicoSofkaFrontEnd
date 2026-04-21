package com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.userinterfaces.DetallarProductoInterface.INPUT_CATIDAD;

public class LlenarCantidad implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Integer cantidad = actor.recall("CANTIDAD_PRODUCTO");
        actor.attemptsTo(
                WaitUntil.the(INPUT_CATIDAD, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(INPUT_CATIDAD),
                Enter.theValue(String.valueOf(cantidad)).into(INPUT_CATIDAD)
        );
    }

    public static LlenarCantidad llenarCantidad() {
        return Tasks.instrumented(LlenarCantidad.class);
    }
}
