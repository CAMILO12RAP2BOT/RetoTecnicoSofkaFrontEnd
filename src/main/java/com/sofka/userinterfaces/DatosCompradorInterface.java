package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosCompradorInterface extends PageObject {

    public static final Target INPUT_NOMBRE = Target.the("Campo del comprador para asignar el nombre").located(By.id("input-payment-firstname"));
    public static final Target INPUT_APELLIDO = Target.the("Campo del comprador para asignar el apellido").located(By.id("input-payment-lastname"));
    public static final Target INPUT_CORREO = Target.the("Campo del comprador para asignar el correo").located(By.id("input-payment-email"));
    public static final Target INPUT_TELEFONO = Target.the("Campo del comprador para asignar el telefono").located(By.id("input-payment-telephone"));
    public static final Target INPUT_COMPANIA = Target.the("Campo del comprador para asignar la compañia").located(By.id("input-payment-company"));
    public static final Target INPUT_DIRECCION1 = Target.the("Campo del comprador para asignar la direccion 1").located(By.id("input-payment-address-1"));
    public static final Target INPUT_DIRECCION2 = Target.the("Campo del comprador para asignar la direccion 2").located(By.id("input-payment-address-2"));
    public static final Target SELECT_PAIS = Target.the("Select del comprador para asignar el pais").located(By.id("input-payment-country"));
    public static final Target SELECT_ESTADO = Target.the("Select del comprador para asignar el estado").located(By.id("input-payment-zone"));
    public static final Target INPUT_CIUDAD = Target.the("Campo del comprador para asignar la ciudad").located(By.id("input-payment-city"));
    public static final Target INPUT_CODIGO_POSTAL = Target.the("Campo del comprador para asignar el codigo postal").located(By.id("input-payment-postcode"));

    public static final Target INPUT_CONTRASENIA = Target.the("Campo del comprador para asignar la contraseña").located(By.id("input-payment-password"));
    public static final Target INPUT_CONFIRMACION_CONTRASENIA = Target.the("Campo del comprador para asignar la confirmación").located(By.id("input-payment-confirm"));


    public static final Target CHECKBOX_DIRECCION_COMPRA_IGUAL_ENVIO = Target.the("Checkbox para saber si hay que llenar dos direcciones una de envio y otra de facturacion").located(By.name("shipping_address"));
    public static final Target CHECKBOX_NOTIFICACION = Target.the("Checkbox para saber si se desea dar de alta en centro de notificaciones").located(By.name("newsletter"));
    public static final Target CHECKBOX_POLITICA_DATOS = Target.the("Checkbox para saber aceptar politica de datos").located(By.name("agree"));

    public static final Target BOTON_CONTINUAR_REGISTRADO = Target.the("Boton para continuar con el proceso de compra").located(By.id("button-register"));
    public static final Target BOTON_CONTINUAR_INVITADO = Target.the("Boton para continuar con el proceso de compra").located(By.id("button-guest"));

    public static final Target RADIO_DIRECCION_ENVIO = Target.the("Radio direccion envio")
            .located(By.name("shipping_address"));
    public static final Target BOTON_CONTINUAR_ENVIO_REGISTRADO = Target.the("Boton para continuar con el proceso de compra").located(By.id("button-shipping-address"));



}
