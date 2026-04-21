package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarProductoInterface extends PageObject {

    public static final Target HIPERVINCULO_PRODUCTO = Target.the("Hipervinculo del producto").locatedBy("//a[text()='{0}']");
}
