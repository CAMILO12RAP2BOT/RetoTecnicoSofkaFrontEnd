package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmarCompraInterface extends PageObject {
        public static final Target BOTON_CONFIRMAR_COMPRA = Target.the("Boton para confirmar la compra").located(By.id("button-confirm"));
}
