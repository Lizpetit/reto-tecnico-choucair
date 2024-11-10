package com.retotecnico.orangehrm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProgramarEntrevistaPagina {

    public static final Target TITULO_ENTREVISTA = Target.the("titulo entrevista")
            .located(By.xpath("//div[contains(@class,'oxd-input-group') and .//label[contains(text(),'Interview Title')]]//input"));

    public static final Target CAMPO_ENTREVISTADOR = Target.the("entrevistador")
            .located(By.xpath("//input[@placeholder='Type for hints...']"));

    public static final Target FECHA = Target.the("fecha")
            .located(By.xpath("//input[@placeholder='yyyy-dd-mm']"));


}
