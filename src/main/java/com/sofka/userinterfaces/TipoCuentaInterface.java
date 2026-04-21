package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TipoCuentaInterface extends PageObject {

    public static final Target RADIO_TIPO_CUENTA = Target.the("Radio tipo cuenta")
            .locatedBy("//div[@class='radio']//input[@name='account' and @value='{0}']");

    public static final Target BOTON_CONTINUAR = Target.the("Boton para continuar con el proceso de compra").located(By.id("button-account"));


}
