package com.retotecnico.orangehrm.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class IniciarSesionOrangeHrm extends PageObject {

    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.name("username"));
    public static final Target CAMPO_CLAVE = Target.the("campo clave")
            .located(By.name("password"));
    public static final Target BOTON_INICIAR_SESION = Target.the("sección para continuar")
            .locatedBy("//button[@type='submit']");

}
