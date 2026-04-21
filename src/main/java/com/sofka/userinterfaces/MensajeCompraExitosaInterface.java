package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeCompraExitosaInterface extends PageObject {
    public static final Target MENSAJE_COMPRA_EXITOSA = Target.the("Mensaje Compra Exitosa").located(By.xpath("//h1[text()='Your order has been placed!']"));

}
