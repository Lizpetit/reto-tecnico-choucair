package com.retotecnico.orangehrm.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static com.retotecnico.orangehrm.userinterfaces.AgregarCandidatoPagina.BOTON_SAVE;
import static com.retotecnico.orangehrm.userinterfaces.EstacionDeAplicacionPagina.*;
import static com.retotecnico.orangehrm.userinterfaces.ProgramarEntrevistaPagina.*;
import static com.retotecnico.orangehrm.utils.DataTables.*;

public class CompletarEntrevistas implements Task {
    private List<Map<String, String>> data;

    public CompletarEntrevistas(List<Map<String, String>> data){
        this.data= data;
    }
    public static CompletarEntrevistas programadas(List<Map<String, String>> data) {
        return Tasks.instrumented(CompletarEntrevistas.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_SHORTLIST));
        actor.attemptsTo(Click.on(BOTON_SAVE_SHORTLIST));
        actor.attemptsTo(Click.on(BOTON_SCHEDULE_INTERVIEW));

        actor.attemptsTo(Enter.theValue(data.get(0).get(NOMBRE_ENTREVISTA)).into(TITULO_ENTREVISTA));
        actor.attemptsTo(Enter.theValue(data.get(0).get(NOMBRE_ENTREVISTADOR)).into(CAMPO_ENTREVISTADOR));
        BrowseTheWeb.as(actor).waitFor(5).seconds();
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(CAMPO_ENTREVISTADOR));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CAMPO_ENTREVISTADOR));
        actor.attemptsTo(Enter.theValue(data.get(0).get(FECHA_ENTREVISTA)).into(FECHA));
        actor.attemptsTo(Click.on(BOTON_SAVE));
    }
}
