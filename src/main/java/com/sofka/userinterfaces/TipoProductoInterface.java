package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TipoProductoInterface extends PageObject {

    public static final Target HIPERVINCULO_ESCRITORIO = (Target.the("Hipervinculo tipo de producto escritorio").located(By.linkText("Desktops")));
    public static final Target HIPERVINCULO_PORTATILES = (Target.the("Hipervinculo tipo de producto portatiles").located(By.linkText("Laptops & Notebooks")));
    public static final Target HIPERVINCULO_COMPONENTES = (Target.the("Hipervinculo tipo de producto componentes").located(By.linkText("Components")));
    public static final Target HIPERVINCULO_TABLETAS = (Target.the("Hipervinculo tipo de producto tabletas").located(By.linkText("Tablets")));
    public static final Target HIPERVINCULO_TELEFONOS = (Target.the("Hipervinculo tipo de producto telefonos").located(By.linkText("Phones & PDAs")));
    public static final Target HIPERVINCULO_CAMARAS = (Target.the("Hipervinculo tipo de producto camaras").located(By.linkText("Cameras")));
}
