package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VisulizarCarroInterface extends PageObject{

    public static final Target BOTON_PREVIA_CARRO = Target.the("Boton del ver previamente el carro").located(By.id("cart"));

    public static final Target HIPERVINCULO_CARRO = Target.the("Hipervinculo ver carro").located(By.partialLinkText("View Cart"));

}
