package com.retotecnico.orangehrm.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static com.retotecnico.orangehrm.userinterfaces.AgregarCandidatoPagina.*;
import static com.retotecnico.orangehrm.userinterfaces.ProgramarEntrevistaPagina.CAMPO_ENTREVISTADOR;

public class VerEstado implements Question<Boolean> {
    private final Target estado_del_candidato;
    private final String texto;

    public static VerEstado delCandidatoEs(String texto) {
    return new VerEstado(ESTATUS_DEL_EMPLEADO,texto);
    }

    public VerEstado(Target estado_del_candidato, String texto){
        this.estado_del_candidato = estado_del_candidato;
        this.texto = texto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Enter.theValue("Agustin").into(CAMPO_NOMBRE_CANDIDATO));
        BrowseTheWeb.as(actor).waitFor(5).seconds();
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(CAMPO_NOMBRE_CANDIDATO));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CAMPO_NOMBRE_CANDIDATO));
        actor.attemptsTo(Click.on(BOTON_SEARCH));
        BrowseTheWeb.as(actor).waitFor(5).seconds();

        String estatus_de_contratacion = estado_del_candidato.resolveFor(actor).getText();
        return estatus_de_contratacion.equals(texto);
    }
}
