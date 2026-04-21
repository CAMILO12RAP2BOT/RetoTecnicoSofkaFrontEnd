package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosPagoCompradorInterface extends PageObject {

    public static final Target METODO_PAGO = Target.the("método de pago {0}")
            .locatedBy("//input[@value='{0}']");
    public static final Target CHECKBOX_TERMINOS = Target.the("Checkbox para aceptar los terminos y condiciones").located(By.name("agree"));

    public static final Target BOTON_CONTINUAR_PAGO = Target.the("Boton para continuar con el proceso de compra").located(By.id("button-payment-method"));
}
