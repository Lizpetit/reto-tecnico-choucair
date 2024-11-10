package com.retotecnico.orangehrm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EstacionDeAplicacionPagina {

    public static final Target BOTON_SHORTLIST = Target.the("boton shorlits")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--success']");

    public static final Target BOTON_SAVE_SHORTLIST = Target.the("boton save shorlits")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public static final Target BOTON_SCHEDULE_INTERVIEW = Target.the("boton schedule interview")
            .located(By.xpath("//button[normalize-space()='Schedule Interview']"));

    public static final Target BOTON_MARK_INTERVIEW= Target.the("boton mark interview")
            .located(By.xpath("//button[normalize-space()='Mark Interview Passed']"));

    public static final Target BOTON_OFFER_JOB= Target.the("boton offer job")
            .located(By.xpath("//button[normalize-space()='Offer Job']"));

    public static final Target BOTON_HIRE = Target.the("boton hire")
            .located(By.xpath("//button[normalize-space()='Hire']"));

}
