package com.sofka.tasks;

import com.sofka.models.Comentario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.userinterfaces.DatosAdicionalesCompradorInterface.BOTON_CONTINUAR_ENVIO;
import static com.sofka.userinterfaces.DatosAdicionalesCompradorInterface.INPUT_COMENTARIO_ENVIO;
import static com.sofka.userinterfaces.DatosAdicionalesCompradorInterface.RADIO_TIPO_ENVIO;


public class LlenarComentarioEnvio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Comentario comentario = new Comentario();
        String comentarioGenerado = comentario.generarComentarioAleatorio();
        actor.attemptsTo(
                WaitUntil.the(RADIO_TIPO_ENVIO, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(RADIO_TIPO_ENVIO),
                WaitUntil.the(INPUT_COMENTARIO_ENVIO, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Enter.theValue(comentarioGenerado).into(INPUT_COMENTARIO_ENVIO),
                WaitUntil.the(BOTON_CONTINUAR_ENVIO, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(BOTON_CONTINUAR_ENVIO)
        );
    }

    public static LlenarComentarioEnvio llenarComentarioEnvio() {
        return Tasks.instrumented(LlenarComentarioEnvio.class);
    }
}
