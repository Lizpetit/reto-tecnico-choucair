package com.retotecnico.orangehrm.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static com.retotecnico.orangehrm.userinterfaces.AgregarCandidatoPagina.*;
import static com.retotecnico.orangehrm.utils.DataTables.*;

public class AgregarCandidato implements Task {
private List<Map<String, String>> data;

public AgregarCandidato(List<Map<String, String>> data){
    this.data= data;
}

    public static AgregarCandidato con(List<Map<String, String>> data) {
        return Tasks.instrumented(AgregarCandidato.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(OPCION_RECRUITMENT));
    actor.attemptsTo(Click.on(BOTON_ADD));
    actor.attemptsTo(Enter.theValue(data.get(0).get(NOMBRE_CANDIDATO)).into(CAMPO_NOMBRE));
    actor.attemptsTo(Enter.theValue(data.get(0).get(APELLIDO_CANDIDATO)).into(CAMPO_APELLIDO));
    actor.attemptsTo(Click.on(CAMPO_VACANTE));
    actor.attemptsTo(Click.on(SELECCION_VACANTE));
    actor.attemptsTo(Enter.theValue(data.get(0).get(CORREO_CANDIDATO)).into(CAMPO_CORREO));
    actor.attemptsTo(Enter.theValue(data.get(0).get(TLF_CANDIDATO)).into(CAMPO_TELEFONO));
    actor.attemptsTo(Click.on(BOTON_SAVE));
    }
}
