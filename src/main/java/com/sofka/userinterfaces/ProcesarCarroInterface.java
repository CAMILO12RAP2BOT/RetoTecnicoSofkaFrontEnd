package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProcesarCarroInterface extends PageObject {
    public static final Target HIPERVINCULO_COMPRAR = Target.the("Hipervinculo comprar carro").located(By.linkText("Checkout"));

}
