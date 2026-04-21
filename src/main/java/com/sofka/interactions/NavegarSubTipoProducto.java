package com.sofka.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.userinterfaces.SubtipoProductoInterface.HIPERVINCULO_COMPONENTES_CAMARAS_WEB;
import static com.sofka.userinterfaces.SubtipoProductoInterface.HIPERVINCULO_COMPONENTES_IMPRESORAS;
import static com.sofka.userinterfaces.SubtipoProductoInterface.HIPERVINCULO_COMPONENTES_MONITORES;
import static com.sofka.userinterfaces.SubtipoProductoInterface.HIPERVINCULO_COMPONENTES_RATONES;
import static com.sofka.userinterfaces.SubtipoProductoInterface.HIPERVINCULO_COMPONENTES_SCANNERS;
import static com.sofka.userinterfaces.SubtipoProductoInterface.HIPERVINCULO_ESCRITORIO_MAC;
import static com.sofka.userinterfaces.SubtipoProductoInterface.HIPERVINCULO_ESCRITORIO_PC;
import static com.sofka.userinterfaces.SubtipoProductoInterface.HIPERVINCULO_PORTATILES_MAC;
import static com.sofka.userinterfaces.SubtipoProductoInterface.HIPERVINCULO_PORTATILES_WINDOWS;

public class NavegarSubTipoProducto implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String subTipoProductoSeleccionado = actor.recall("SUBTIPO_PRODUCTO");
        if (subTipoProductoSeleccionado == null || subTipoProductoSeleccionado.equals("No aplica")) {
            return;
        }

        Target targetDestino = switch (subTipoProductoSeleccionado) {
            case "PC" -> HIPERVINCULO_ESCRITORIO_PC;
            case "Mac" -> HIPERVINCULO_ESCRITORIO_MAC;
            case "Macs" -> HIPERVINCULO_PORTATILES_MAC;
            case "Windows" -> HIPERVINCULO_PORTATILES_WINDOWS;
            case "Ratones" -> HIPERVINCULO_COMPONENTES_RATONES;
            case "Monitores" -> HIPERVINCULO_COMPONENTES_MONITORES;
            case "Impresoras" -> HIPERVINCULO_COMPONENTES_IMPRESORAS;
            case "Scanners" -> HIPERVINCULO_COMPONENTES_SCANNERS;
            case "WebCams" -> HIPERVINCULO_COMPONENTES_CAMARAS_WEB;
            default -> null;
        };
        if (targetDestino != null) {
            actor.attemptsTo(
                    WaitUntil.the(targetDestino, WebElementStateMatchers.isClickable())
                            .forNoMoreThan(30).seconds(),
                    Click.on(targetDestino)
            );
        }
    }

    public static NavegarSubTipoProducto navegarSubTipoProducto() {
        return Tasks.instrumented(NavegarSubTipoProducto.class);
    }
}
