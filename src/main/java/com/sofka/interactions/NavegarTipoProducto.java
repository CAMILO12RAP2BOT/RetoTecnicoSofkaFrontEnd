package com.sofka.interactions;

import com.sofka.models.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HoverOverTarget;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.userinterfaces.TipoProductoInterface.HIPERVINCULO_CAMARAS;
import static com.sofka.userinterfaces.TipoProductoInterface.HIPERVINCULO_COMPONENTES;
import static com.sofka.userinterfaces.TipoProductoInterface.HIPERVINCULO_ESCRITORIO;
import static com.sofka.userinterfaces.TipoProductoInterface.HIPERVINCULO_PORTATILES;
import static com.sofka.userinterfaces.TipoProductoInterface.HIPERVINCULO_TABLETAS;
import static com.sofka.userinterfaces.TipoProductoInterface.HIPERVINCULO_TELEFONOS;

public class NavegarTipoProducto implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        Producto producto = new Producto();
        String tipoProducto = producto.generarTipoProductoAleatorio();
        String subTipoProducto = producto.generarSubTipoProductoAleatorio(tipoProducto);
        String nombreProducto = producto.generarNombreProductoAleatorio(tipoProducto, subTipoProducto);
        int cantidadProducto = producto.generarCantidadProductoAleatorio();
        actor.remember("TIPO_PRODUCTO", tipoProducto);
        actor.remember("SUBTIPO_PRODUCTO", subTipoProducto);
        actor.remember("NOMBRE_PRODUCTO", nombreProducto);
        actor.remember("CANTIDAD_PRODUCTO", cantidadProducto);
        String tipoProductoSeleccionado = actor.recall("TIPO_PRODUCTO");
        Target targetPrincipal = switch (tipoProductoSeleccionado) {
            case "Escritorio" -> HIPERVINCULO_ESCRITORIO;
            case "Portatiles" -> HIPERVINCULO_PORTATILES;
            case "Componentes" -> HIPERVINCULO_COMPONENTES;
            case "Tabletas" -> HIPERVINCULO_TABLETAS;
            case "Telefonos" -> HIPERVINCULO_TELEFONOS;
            case "Camaras" -> HIPERVINCULO_CAMARAS;
            default -> null;
        };
        if (targetPrincipal != null) {
            actor.attemptsTo(
                    WaitUntil.the(targetPrincipal, WebElementStateMatchers.isClickable())
                            .forNoMoreThan(30).seconds()
            );

            if (tipoProductoSeleccionado.equals("Escritorio") || tipoProductoSeleccionado.equals("Portatiles") || tipoProductoSeleccionado.equals("Componentes")) {
                actor.attemptsTo(HoverOverTarget.over(targetPrincipal));
            } else {
                actor.attemptsTo(Click.on(targetPrincipal));
            }
        } else {
        }
    }

    public static NavegarTipoProducto navegarTipoProducto() {
        return Tasks.instrumented(NavegarTipoProducto.class);
    }
}
