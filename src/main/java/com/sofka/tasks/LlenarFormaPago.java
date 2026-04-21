package com.sofka.tasks;

import com.sofka.models.MetodoPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.userinterfaces.DatosPagoCompradorInterface.BOTON_CONTINUAR_PAGO;
import static com.sofka.userinterfaces.DatosPagoCompradorInterface.CHECKBOX_TERMINOS;
import static com.sofka.userinterfaces.DatosPagoCompradorInterface.METODO_PAGO;

public class LlenarFormaPago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        MetodoPago metodoPago = new MetodoPago();
        String metodo = metodoPago.generaMetodoPagoAleatorio();
        actor.attemptsTo(
                WaitUntil.the(METODO_PAGO.of(metodo), WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(METODO_PAGO.of(metodo)),
                WaitUntil.the(CHECKBOX_TERMINOS, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(CHECKBOX_TERMINOS),
                WaitUntil.the(BOTON_CONTINUAR_PAGO, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(BOTON_CONTINUAR_PAGO)
        );
    }

    public static LlenarFormaPago llenarFormaPago() {
        return Tasks.instrumented(LlenarFormaPago.class);
    }
}
