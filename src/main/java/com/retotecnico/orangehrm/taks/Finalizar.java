package com.retotecnico.orangehrm.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.retotecnico.orangehrm.userinterfaces.AgregarCandidatoPagina.BOTON_SAVE;
import static com.retotecnico.orangehrm.userinterfaces.AgregarCandidatoPagina.OPCION_RECRUITMENT;
import static com.retotecnico.orangehrm.userinterfaces.EstacionDeAplicacionPagina.*;

public class Finalizar implements Task {

    public static Finalizar contratacion() {
        return Tasks.instrumented(Finalizar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_MARK_INTERVIEW));
        actor.attemptsTo(Click.on(BOTON_SAVE));
        actor.attemptsTo(Click.on(BOTON_OFFER_JOB));
        actor.attemptsTo(Click.on(BOTON_SAVE));
        actor.attemptsTo(Click.on(BOTON_HIRE));
        actor.attemptsTo(Click.on(BOTON_SAVE));
        actor.attemptsTo(Click.on(OPCION_RECRUITMENT));
    }
}
