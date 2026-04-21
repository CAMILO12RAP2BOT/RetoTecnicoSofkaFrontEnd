package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetallarProductoInterface extends PageObject {

    public static final Target INPUT_CATIDAD = Target.the("Campo del producto para asignar la cantidad").located(By.id("input-quantity"));

    public static final Target BOTON_AGREGAR_AL_CARRITO = Target.the("Boton del agregar producto al carro").located(By.id("button-cart"));

}
