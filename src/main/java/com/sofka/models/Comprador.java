package com.sofka.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Comprador {

    Faker faker = new Faker(new Locale("es-CO"));

    private String tipoCuenta;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String compania;
    private String direccion1;
    private String direccion2;
    private String pais;
    private String estado;
    private String ciudad;
    private String codigoPostal;
    private String contrasenia;
    private boolean direccionCompraIgualEnvio;
    private boolean notificacion;
    private boolean politicaDatos;

    public Comprador(String tipoCuenta, String nombre, String apellido, String correo, String telefono, String compania, String direccion1, String direccion2, String pais, String estado, String ciudad, String codigoPostal, String contrasenia, boolean direccionCompraIgualEnvio, boolean notificacion, boolean politicaDatos) {
        this.tipoCuenta = tipoCuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.compania = compania;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.pais = pais;
        this.estado = estado;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.contrasenia = contrasenia;
        this.direccionCompraIgualEnvio = direccionCompraIgualEnvio;
        this.notificacion = notificacion;
        this.politicaDatos = politicaDatos;
    }
    public Comprador() {
        this.tipoCuenta = tipoCuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.compania = compania;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.pais = pais;
        this.estado = estado;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.contrasenia = contrasenia;
        this.direccionCompraIgualEnvio = direccionCompraIgualEnvio;
        this.notificacion = notificacion;
        this.politicaDatos = politicaDatos;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isDireccionCompraIgualEnvio() {
        return direccionCompraIgualEnvio;
    }

    public void setDireccionCompraIgualEnvio(boolean direccionCompraIgualEnvio) {
        this.direccionCompraIgualEnvio = direccionCompraIgualEnvio;
    }

    public boolean isNotificacion() {
        return notificacion;
    }

    public void setNotificacion(boolean notificacion) {
        this.notificacion = notificacion;
    }

    public boolean isPoliticaDatos() {
        return politicaDatos;
    }

    public void setPoliticaDatos(boolean politicaDatos) {
        this.politicaDatos = politicaDatos;
    }

    public String generarTipoCuentaCompradorAleatorio() {
        String seleccion = faker.options().option("Registrado", "Invitado");
        return switch (seleccion) {
            case "Registrado" -> this.tipoCuenta = "register";
            case "Invitado"   -> this.tipoCuenta = "guest";
            default           -> this.tipoCuenta = null;
        };
    }

    public String generarNombreCompradorAleatorio() {
        return this.nombre = faker.name().firstName();
    }

    public String generarApellidoCompradorAleatorio() {
        return this.apellido = faker.name().lastName();
    }

    public String generarCorreoCompradorAleatorio() {
        return this.correo = "camilo.amaya." + faker.internet().emailAddress();
    }

    public String generarTelefonoCompradorAleatorio() {
        return this.telefono = faker.phoneNumber().cellPhone();
    }

    public String generarCompaniaCompradorAleatorio() {
        return this.compania = faker.company().name();
    }

    public String generarDireccion1CompradorAleatorio() {
        return this.direccion1 = faker.address().streetAddress();
    }

    public String generarDireccion2CompradorAleatorio() {
        return this.direccion2 = faker.address().streetAddress();
    }

    public String generarDatosGeograficoPaisComprado(){
        return this.pais = "Colombia";
    }

    public String generarDatosGeograficoEstadoCompradorAleatorio(){
        return this.estado = faker.options().option("Amazonas", "Antioquia", "Arauca", "Atlantico", "Bogota D.C.", "Bolivar", "Boyaca", "Caldas", "Caqueta", "Casanare", "Cauca", "Cesar", "Choco", "Cordoba", "Cundinamarca", "Guainia", "Guajira", "Guaviare", "Huila", "Magdalena", "Meta", "Narino", "Norte de Santander", "Putumayo", "Quindio", "Risaralda", "San Andres y Providencia", "Santander", "Sucre", "Tolima", "Valle del Cauca", "Vaupes", "Vichada");
    }

    public String generarDatosGeograficosCiudadCompradorAleatorio(){
        return this.ciudad = faker.address().city();
    }

    public String generarCodigoPostalCompradorAleatorio(){
        return this.codigoPostal = faker.address().zipCode();
    }

    public String generarContraseniaCompradorAleatorio(){
        return this.contrasenia = faker.internet().password(8, 16, true, true, true);
    }

    public boolean generarDireccionCompraIgualEnvio(){
        return this.direccionCompraIgualEnvio = true;
    }

    public boolean generarNotificacion(){
        return this.notificacion = faker.bool().bool();
    }

    public boolean generarPoliticaDatos(){
        return this.politicaDatos = true;
    }
}
