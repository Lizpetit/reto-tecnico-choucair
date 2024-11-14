package com.retotecnico.orangehrm.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.retotecnico.orangehrm.userinterfaces.IniciarSesionOrangeHrm.*;

public class IniciarSesion implements Task {
    private String usuario;
    private String clave;

    public IniciarSesion(String usuario,String clave){
        this.usuario = usuario;
        this.clave = clave;
    }

    public static IniciarSesion con(String usuario, String clave) {
        return Tasks.instrumented(IniciarSesion.class,usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(CAMPO_USUARIO));
        actor.attemptsTo(Enter.theValue(clave).into(CAMPO_CLAVE));
        actor.attemptsTo(Click.on(BOTON_INICIAR_SESION));
    }
}
