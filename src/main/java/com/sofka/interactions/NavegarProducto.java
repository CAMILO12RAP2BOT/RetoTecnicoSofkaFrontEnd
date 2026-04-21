package com.sofka.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.sofka.userinterfaces.SeleccionarProductoInterface.HIPERVINCULO_PRODUCTO;


public class NavegarProducto implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String productoSeleccionado = actor.recall("NOMBRE_PRODUCTO");
        if (productoSeleccionado == null || productoSeleccionado.equals("No aplica")) {
            return;
        }
        actor.attemptsTo(
                WaitUntil.the(HIPERVINCULO_PRODUCTO.of(productoSeleccionado), WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(HIPERVINCULO_PRODUCTO.of(productoSeleccionado))
        );
    }

    public static NavegarProducto navegarProducto() {
        return Tasks.instrumented(NavegarProducto.class);
    }
}
