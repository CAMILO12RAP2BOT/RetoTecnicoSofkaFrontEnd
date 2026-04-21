package com.sofka.interactions;

import com.sofka.models.Comprador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofka.userinterfaces.TipoCuentaInterface.BOTON_CONTINUAR;
import static com.sofka.userinterfaces.TipoCuentaInterface.RADIO_TIPO_CUENTA;


public class NavegarCompradorTipoCuenta implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Comprador comprador = new Comprador();
        String tipoCuentaComprador = comprador.generarTipoCuentaCompradorAleatorio();
        String nombreComprador = comprador.generarNombreCompradorAleatorio();
        String apellidoComprador = comprador.generarApellidoCompradorAleatorio();
        String correoComprador = comprador.generarCorreoCompradorAleatorio();
        String telefonoComprador = comprador.generarTelefonoCompradorAleatorio();
        String companiaComprador = comprador.generarCompaniaCompradorAleatorio();
        String direccion1Comprador = comprador.generarDireccion1CompradorAleatorio();
        String direccion2Comprador = comprador.generarDireccion2CompradorAleatorio();
        String paisComprador = comprador.generarDatosGeograficoPaisComprado();
        String estadoComprador = comprador.generarDatosGeograficoEstadoCompradorAleatorio();
        String ciudadComprador = comprador.generarDatosGeograficosCiudadCompradorAleatorio();
        String codigoPostalComprador = comprador.generarCodigoPostalCompradorAleatorio();
        boolean direccionCompraIgualEnvio = comprador.generarDireccionCompraIgualEnvio();
        actor.remember("TIPO_CUENTA_COMPRADOR", tipoCuentaComprador);
        actor.remember("NOMBRE_COMPRADOR", nombreComprador);
        actor.remember("APELLIDO_COMPRADOR", apellidoComprador);
        actor.remember("CORREO_COMPRADOR", correoComprador);
        actor.remember("TELEFONO_COMPRADOR", telefonoComprador);
        actor.remember("COMPANIA_COMPRADOR", companiaComprador);
        actor.remember("DIRECCION1_COMPRADOR", direccion1Comprador);
        actor.remember("DIRECCION2_COMPRADOR", direccion2Comprador);
        actor.remember("PAIS_COMPRADOR", paisComprador);
        actor.remember("ESTADO_COMPRADOR", estadoComprador);
        actor.remember("CIUDAD_COMPRADOR", ciudadComprador);
        actor.remember("CODIGO_POSTAL_COMPRADOR", codigoPostalComprador);
        actor.remember("DIRECCION_COMPRA_IGUAL_ENVIO", direccionCompraIgualEnvio);
        String tipoCuentaCompradorSeleccionado = actor.recall("TIPO_CUENTA_COMPRADOR");
        if (tipoCuentaCompradorSeleccionado.equals("register")) {
            String contraseniaComprador = comprador.generarContraseniaCompradorAleatorio();
            boolean notificacion = comprador.generarNotificacion();
            boolean politicaDatos = comprador.generarPoliticaDatos();
            actor.remember("CONTRASENIA_COMPRADOR", contraseniaComprador);
            actor.remember("NOTIFICACION", notificacion);
            actor.remember("POLITICA_DATOS", politicaDatos);
        }
        actor.attemptsTo(
                WaitUntil.the(RADIO_TIPO_CUENTA.of(tipoCuentaCompradorSeleccionado), WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(RADIO_TIPO_CUENTA.of(tipoCuentaCompradorSeleccionado)),
                WaitUntil.the(BOTON_CONTINUAR, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(30).seconds(),
                Click.on(BOTON_CONTINUAR)
        );
    }

    public static NavegarCompradorTipoCuenta navegarCompradorTipoCuenta() {
        return Tasks.instrumented(NavegarCompradorTipoCuenta.class);
    }
}
