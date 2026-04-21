package com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import com.sofka.userinterfaces.UrlPaginaPrincipalOpenCartAbstracta;

public class AbrirPaginaPrincipal implements  Task{

    private UrlPaginaPrincipalOpenCartAbstracta urlPaginaPrincipal;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(urlPaginaPrincipal));
    }

    public static AbrirPaginaPrincipal abrirPaginaPrincipal() {
        return Tasks.instrumented(AbrirPaginaPrincipal.class);
    }
}
