package com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.SelectedStatus;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.userinterfaces.DatosCompradorInterface.BOTON_CONTINUAR_INVITADO;
import static com.sofka.userinterfaces.DatosCompradorInterface.CHECKBOX_DIRECCION_COMPRA_IGUAL_ENVIO;
import static com.sofka.userinterfaces.DatosCompradorInterface.INPUT_APELLIDO;
import static com.sofka.userinterfaces.DatosCompradorInterface.INPUT_CIUDAD;
import static com.sofka.userinterfaces.DatosCompradorInterface.INPUT_CODIGO_POSTAL;
import static com.sofka.userinterfaces.DatosCompradorInterface.INPUT_COMPANIA;
import static com.sofka.userinterfaces.DatosCompradorInterface.INPUT_CORREO;
import static com.sofka.userinterfaces.DatosCompradorInterface.INPUT_DIRECCION1;
import static com.sofka.userinterfaces.DatosCompradorInterface.INPUT_DIRECCION2;
import static com.sofka.userinterfaces.DatosCompradorInterface.INPUT_NOMBRE;
import static com.sofka.userinterfaces.DatosCompradorInterface.INPUT_TELEFONO;
import static com.sofka.userinterfaces.DatosCompradorInterface.SELECT_ESTADO;
import static com.sofka.userinterfaces.DatosCompradorInterface.SELECT_PAIS;

public class LlenarDatosEnvioInvitado implements Task
 {    @Override
 public <T extends Actor> void performAs(T actor) {
     String nombreComprador = actor.recall("NOMBRE_COMPRADOR");
     String apellidoComprador = actor.recall("APELLIDO_COMPRADOR");
     String correoComprador = actor.recall("CORREO_COMPRADOR");
     String telefonoComprador = actor.recall("TELEFONO_COMPRADOR");
     String companiaComprador = actor.recall("COMPANIA_COMPRADOR");
     String direccion1Comprador = actor.recall("DIRECCION1_COMPRADOR");
     String direccion2Comprador = actor.recall("DIRECCION2_COMPRADOR");
     String paisComprador = actor.recall("PAIS_COMPRADOR");
     String estadoComprador = actor.recall("ESTADO_COMPRADOR");
     String ciudadComprador = actor.recall("CIUDAD_COMPRADOR");
     String codigoPostalComprador = actor.recall("CODIGO_POSTAL_COMPRADOR");
     Boolean direccionCompraIgualEnvio = actor.recall("DIRECCION_COMPRA_IGUAL_ENVIO");
     boolean direccionCompraIgualEnvioChecked = actor.asksFor(SelectedStatus.of(CHECKBOX_DIRECCION_COMPRA_IGUAL_ENVIO));
     actor.attemptsTo(
             WaitUntil.the(INPUT_NOMBRE, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             Enter.theValue(nombreComprador).into(INPUT_NOMBRE),
             WaitUntil.the(INPUT_APELLIDO, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             Enter.theValue(apellidoComprador).into(INPUT_APELLIDO),
             WaitUntil.the(INPUT_CORREO, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             Enter.theValue(correoComprador).into(INPUT_CORREO),
             WaitUntil.the(INPUT_TELEFONO, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             Enter.theValue(telefonoComprador).into(INPUT_TELEFONO),
             WaitUntil.the(INPUT_COMPANIA, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             Enter.theValue(companiaComprador).into(INPUT_COMPANIA),
             WaitUntil.the(INPUT_DIRECCION1, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             Enter.theValue(direccion1Comprador).into(INPUT_DIRECCION1),
             WaitUntil.the(INPUT_DIRECCION2, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             Enter.theValue(direccion2Comprador).into(INPUT_DIRECCION2),
             WaitUntil.the(SELECT_PAIS, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             SelectFromOptions.byVisibleText(paisComprador).from(SELECT_PAIS),
             WaitUntil.the(SELECT_ESTADO, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             SelectFromOptions.byVisibleText(estadoComprador).from(SELECT_ESTADO),
             WaitUntil.the(INPUT_CIUDAD, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             Enter.theValue(ciudadComprador).into(INPUT_CIUDAD),
             WaitUntil.the(INPUT_CODIGO_POSTAL, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             Enter.theValue(codigoPostalComprador).into(INPUT_CODIGO_POSTAL)
     );
     if (direccionCompraIgualEnvioChecked == true && direccionCompraIgualEnvio){
     }else{
         if (direccionCompraIgualEnvio.equals("false")) {
             actor.attemptsTo(
                     WaitUntil.the(CHECKBOX_DIRECCION_COMPRA_IGUAL_ENVIO, WebElementStateMatchers.isClickable())
                             .forNoMoreThan(30).seconds(),
                     Click.on(CHECKBOX_DIRECCION_COMPRA_IGUAL_ENVIO)
             );
         }
     }
     actor.attemptsTo(
             WaitUntil.the(BOTON_CONTINUAR_INVITADO, WebElementStateMatchers.isClickable())
                     .forNoMoreThan(30).seconds(),
             Click.on(BOTON_CONTINUAR_INVITADO)
     );
 }

     public static LlenarDatosEnvioInvitado llenarDatosEnvioInvitado() {
         return Tasks.instrumented(LlenarDatosEnvioInvitado.class);
     }
}
