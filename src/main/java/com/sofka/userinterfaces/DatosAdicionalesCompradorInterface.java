package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosAdicionalesCompradorInterface extends PageObject {
    public static final Target RADIO_TIPO_ENVIO = Target.the("Radio tipo envio")
            .located(By.name("shipping_method"));
    public static final Target INPUT_COMENTARIO_ENVIO = Target.the("Campo del comprador para asignar el comentario al envio").located(By.name("comment"));
    public static final Target BOTON_CONTINUAR_ENVIO = Target.the("Boton para continuar con el comentario del envio").located(By.id("button-shipping-method"));

}
