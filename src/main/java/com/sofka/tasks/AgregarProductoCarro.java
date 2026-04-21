package com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.sofka.userinterfaces.DetallarProductoInterface.BOTON_AGREGAR_AL_CARRITO;

public class AgregarProductoCarro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().navigate().refresh();
        actor.attemptsTo(
                WaitUntil.the(BOTON_AGREGAR_AL_CARRITO, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(BOTON_AGREGAR_AL_CARRITO)
        );
        BrowseTheWeb.as(actor).waitFor(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'"));
    }

    public static AgregarProductoCarro agregarProductoCarro() {
        return Tasks.instrumented(AgregarProductoCarro.class);
    }
}
