package com.sofka.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SubtipoProductoInterface extends PageObject {

    public static final Target HIPERVINCULO_ESCRITORIO_PC = (Target.the("Hipervinculo tipo de producto escritorio PC").located(By.partialLinkText("PC")));
    public static final Target HIPERVINCULO_ESCRITORIO_MAC = (Target.the("Hipervinculo tipo de producto escritorio MAC").located(By.partialLinkText("Mac")));

    public static final Target HIPERVINCULO_PORTATILES_MAC = (Target.the("Hipervinculo tipo de producto portatiles MAC").located(By.partialLinkText("Macs")));
    public static final Target HIPERVINCULO_PORTATILES_WINDOWS = (Target.the("Hipervinculo tipo de producto portatiles Windows").located(By.partialLinkText("Windows")));

    public static final Target HIPERVINCULO_COMPONENTES_RATONES = (Target.the("Hipervinculo tipo de producto componentes ratones").located(By.partialLinkText("Mice and Trackballs")));
    public static final Target HIPERVINCULO_COMPONENTES_MONITORES = (Target.the("Hipervinculo tipo de producto componentes monitores").located(By.partialLinkText("Monitors")));
    public static final Target HIPERVINCULO_COMPONENTES_IMPRESORAS = (Target.the("Hipervinculo tipo de producto componentes impresoras").located(By.partialLinkText("Printers")));
    public static final Target HIPERVINCULO_COMPONENTES_SCANNERS = (Target.the("Hipervinculo tipo de producto componentes scanners").located(By.partialLinkText("Scanners")));
    public static final Target HIPERVINCULO_COMPONENTES_CAMARAS_WEB = (Target.the("Hipervinculo tipo de producto componentes camaras web").located(By.partialLinkText("Web Cameras")));

}
