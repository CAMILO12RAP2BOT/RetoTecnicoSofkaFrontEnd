package com.sofka.stepdefinitions;

import com.sofka.interactions.NavegarCarroCompra;
import com.sofka.interactions.NavegarCompradorTipoCuenta;
import com.sofka.interactions.NavegarProducto;
import com.sofka.interactions.NavegarSubTipoProducto;
import com.sofka.interactions.NavegarTipoProducto;
import com.sofka.questions.VerificarMensajeCompra;
import com.sofka.tasks.AgregarProductoCarro;
import com.sofka.tasks.ConfirmarCompra;
import com.sofka.tasks.LlenarCantidad;
import com.sofka.tasks.LlenarComentarioEnvio;
import com.sofka.tasks.LlenarDatosEnvio;
import com.sofka.tasks.LlenarFormaPago;
import com.sofka.tasks.ProcesarCarro;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.sofka.tasks.AbrirPaginaPrincipal;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraStepDefinition {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Camilo Andres Amaya Granados");
    }

    @Dado("que el usuario está en la página de inicio de Open Cart Abstracta")
    public void queElUsuarioEstaEnLaPaginaDeInicioDeOpenCartAbstracta() {
        theActorInTheSpotlight().wasAbleTo(AbrirPaginaPrincipal.abrirPaginaPrincipal());
    }

    @Cuando("el usuario selecciona el producto a comprar")
    public void elUsuarioSeleccionaElProductoAComprar() {
        theActorInTheSpotlight().attemptsTo(
                NavegarTipoProducto.navegarTipoProducto(),
                NavegarSubTipoProducto.navegarSubTipoProducto(),
                NavegarProducto.navegarProducto(),
                LlenarCantidad.llenarCantidad(),
                AgregarProductoCarro.agregarProductoCarro()
        );
    }

    @Y("el usuario va a el carro de compra")
    public void elUsuarioVaAElCarroDeCompra() {
        theActorInTheSpotlight().attemptsTo(
                NavegarCarroCompra.navegarCarroCompra()
        );
    }

    @Y("el usuario procede a la compra")
    public void elUsuarioProcedeALaCompra() {
        theActorInTheSpotlight().attemptsTo(
                ProcesarCarro.procesarCarro()
        );
    }

    @Y("el usuario ingresa sus datos personales")
    public void elUsuarioIngresaSusDatosPersonales(){
        theActorInTheSpotlight().attemptsTo(
                NavegarCompradorTipoCuenta.navegarCompradorTipoCuenta(),
                LlenarDatosEnvio.llenarDatosEnvio()
        );
    }

    @Y("el usuario ingresa comentarios adicionales")
    public void elUsuarioIngresaComentariosAdicionales(){
        theActorInTheSpotlight().attemptsTo(
                LlenarComentarioEnvio.llenarComentarioEnvio()
        );
    }

    @Y("el usuario ingresa la forma de pago")
    public void elUsuarioIngresaLaFormaDePago(){
        theActorInTheSpotlight().attemptsTo(
                LlenarFormaPago.llenarFormaPago()
        );
    }

    @Y("el usuario confirma la compra")
    public void elUsuarioConfirmaLaCompra() {
        theActorInTheSpotlight().attemptsTo(
                ConfirmarCompra.confirmarCompra()
        );
    }

    @Entonces("la compra se realiza exitosamente mostrando un mensaje de confirmación el cual es {string}")
    public void laCompraSeRealizaExitosamenteMostrandoUnMensajeDeConfirmacionElCualEs(String mensajeEsperado) {
        theActorInTheSpotlight().should(seeThat(VerificarMensajeCompra.verificarMensajeCompra(mensajeEsperado)));
    }
}
