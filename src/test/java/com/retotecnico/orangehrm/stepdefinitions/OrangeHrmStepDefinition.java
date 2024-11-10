package com.retotecnico.orangehrm.stepdefinitions;

import com.retotecnico.orangehrm.questions.VerEstado;
import com.retotecnico.orangehrm.taks.AgregarCandidato;
import com.retotecnico.orangehrm.taks.CompletarEntrevistas;
import com.retotecnico.orangehrm.taks.Finalizar;
import com.retotecnico.orangehrm.taks.IniciarSesion;
import com.retotecnico.orangehrm.userinterfaces.IniciarSesionOrangeHrm;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrangeHrmStepDefinition {
    private IniciarSesionOrangeHrm page;

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("tester");
    }

    @Dado("^que se ingresa a la pagina de OrangeHRM con usuario (.*) y clave (.*)$")
    public void queSeIngresaALaPaginaDeOrangeHRMConUsuarioAdminYClaveAdmin(String usuario, String clave) {
        theActorCalled("tester").wasAbleTo(Open.browserOn(page));
        theActorCalled("tester").wasAbleTo(IniciarSesion.con(usuario,clave));

    }

    @Dado("^se procede a agregar un candidato$")
    public void seProcedeAAgregarUnCandidato(List<Map<String, String>> data) {
        theActorCalled("tester").wasAbleTo(AgregarCandidato.con(data));

    }

    @Cuando("^cumple con el proceso de entrevista$")
    public void cumpleConElProcesoDeEntrevista(List<Map<String, String>> data) {
            theActorCalled("tester").wasAbleTo(CompletarEntrevistas.programadas(data));
    }

    @Cuando("^el candidato es contratado$")
    public void elCandidatoEsContratado() {
        theActorCalled("tester").wasAbleTo(Finalizar.contratacion());
    }

    @Entonces("^validamos que el candidato tenga estado (.*)$")
    public void validamosQueElCandidatoTengaEstadoContratado(String texto) {
        theActorInTheSpotlight().should(seeThat(VerEstado.delCandidatoEs(texto)));
    }
}



