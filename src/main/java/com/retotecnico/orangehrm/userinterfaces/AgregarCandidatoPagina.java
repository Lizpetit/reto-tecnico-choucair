package com.retotecnico.orangehrm.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AgregarCandidatoPagina {
    public static final Target OPCION_RECRUITMENT = Target.the("opcion Recruitment").
            locatedBy("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']//span");

    public static final Target BOTON_ADD = Target.the("boton add")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    public static final Target CAMPO_NOMBRE = Target.the("campo nombre").
            located(By.name("firstName"));

    public static final Target CAMPO_APELLIDO = Target.the("campo apellido").
            located(By.name("lastName"));

    public static final Target CAMPO_CORREO = Target.the("campo correo")
            .locatedBy("(//input[@class='oxd-input oxd-input--active'])[2]");

    public static final Target CAMPO_TELEFONO = Target.the("campo telefono")
            .locatedBy("(//input[@class='oxd-input oxd-input--active'])[2]");

    public static final Target CAMPO_VACANTE = Target.the("campo vacante")
            .locatedBy("(//div[@class='oxd-select-text oxd-select-text--active'])");

    public static final Target SELECCION_VACANTE = Target.the("seleccion vacante")
            .located(By.xpath("//div[@class ='oxd-select-wrapper']//*[text()='Payroll Administrator']"));

    public static final Target BOTON_SAVE = Target.the("boton save")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public static final Target CAMPO_NOMBRE_CANDIDATO = Target.the("entrevistador")
            .located(org.openqa.selenium.By.xpath("//input[@placeholder='Type for hints...']"));

    public static final Target BOTON_SEARCH = Target.the("boton search")
            .located(org.openqa.selenium.By.xpath("//button[normalize-space()='Search']"));

    public static final Target ESTATUS_DEL_EMPLEADO = Target.the("estatus del empleado")
            .locatedBy("(//div[@class ='oxd-table-cell oxd-padding-cell'])[6]");



}
