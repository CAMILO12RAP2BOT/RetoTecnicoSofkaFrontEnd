package com.sofka.models;

import com.github.javafaker.Faker;
import net.serenitybdd.core.Serenity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Producto {

    Faker faker = new Faker();

    private String tipoProducto;
    private String subTipoProducto;
    private String nombreProducto;
    private int cantidadProducto;


    public Producto() {
        this.tipoProducto = tipoProducto;
        this.subTipoProducto = subTipoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public Producto(String tipoProducto, String subTipoProducto, String nombreProducto, int cantidadProducto) {
        this.tipoProducto = tipoProducto;
        this.subTipoProducto = subTipoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getSubTipoProducto() {
        return subTipoProducto;
    }

    public void setSubTipoProducto(String subTipoProducto) {
        this.subTipoProducto = subTipoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String generarTipoProductoAleatorio() {
        List<String> pool = Serenity.sessionVariableCalled("LISTA_PRODUCTOS");
        if (pool == null || pool.isEmpty()) {
            pool = new ArrayList<>(Arrays.asList(
                    "Escritorio", "Componentes", "Tabletas", "Telefonos", "Camaras"
            ));
            Collections.shuffle(pool);
        }
        String tipo = pool.remove(0);
        Serenity.setSessionVariable("LISTA_PRODUCTOS").to(pool);
        return tipo;
    }

    public String generarSubTipoProductoAleatorio(String tipoProducto) {
        switch (tipoProducto) {
            case "Escritorio":
                this.subTipoProducto = faker.options().option("Mac");
                break;
            case "Componentes":
                this.subTipoProducto = faker.options().option("Monitores");
                break;
            default:
                this.subTipoProducto = "No aplica";
        }
        return subTipoProducto;
    }

    public String generarNombreProductoAleatorio(String tipoProducto, String subTipoProducto) {
        switch (tipoProducto) {
            case "Escritorio":
                switch (subTipoProducto) {
                    case "Mac":
                        this.nombreProducto = faker.options().option("iMac");
                        break;
                }
                break;
            case "Componentes":
                switch (subTipoProducto) {
                    case "Monitores":
                        this.nombreProducto = faker.options().option("Samsung SyncMaster 941BW");
                        break;
                }
                break;
            case "Tabletas":
                this.nombreProducto = faker.options().option("Samsung Galaxy Tab 10.1");
                break;
            case "Telefonos":
                this.nombreProducto = faker.options().option("HTC Touch HD", "iPhone", "Palm Treo Pro");
                break;
            case "Camaras":
                this.nombreProducto = faker.options().option("Nikon D300");
                break;
            default:
                this.nombreProducto = "No aplica";
        }
        return nombreProducto;
    }

    public int generarCantidadProductoAleatorio() {
        this.cantidadProducto = faker.number().numberBetween(1, 9);
        return cantidadProducto;
    }
}
