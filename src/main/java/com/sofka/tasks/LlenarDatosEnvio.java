package com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LlenarDatosEnvio implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String tipoCuentaCompradorSeleccionado = actor.recall("TIPO_CUENTA_COMPRADOR");
        switch (tipoCuentaCompradorSeleccionado) {
            case "register":
                actor.attemptsTo(
                        LlenarDatosEnvioRegistrado.llenarDatosEnvioRegistrado()
                );
                break;
            case "guest":
                actor.attemptsTo(
                        LlenarDatosEnvioInvitado.llenarDatosEnvioInvitado()
                );
                break;
            default:
        }
    }

    public static LlenarDatosEnvio llenarDatosEnvio() {
        return Tasks.instrumented(LlenarDatosEnvio.class);
    }
}
