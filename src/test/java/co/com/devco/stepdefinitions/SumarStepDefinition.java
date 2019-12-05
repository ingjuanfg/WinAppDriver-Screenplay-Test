package co.com.devco.stepdefinitions;

import co.com.devco.interactions.Abrir;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.tasks.Operaciones.restarLosNumeros;
import static co.com.devco.tasks.Operaciones.sumarLosNumeros;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SumarStepDefinition {

    @Before
    public void prepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) se encuentra en la calculadora de Windows$")
    public void prepararEscenario(String nombreActor){
        theActorCalled(nombreActor).attemptsTo(
                Abrir.calculadoraWindows()
        );
    }

    @Cuando("^Juan realiza la suma de 6 y 8$")
    public void juanRealizaLaSumaDe() {
        theActorInTheSpotlight().attemptsTo(
                sumarLosNumeros()
        );
    }

    @Cuando("^Juan realiza la resta de 4 y 2$")
    public void juanRealizaLaRestaDe() {
        theActorInTheSpotlight().attemptsTo(
                restarLosNumeros()
        );
    }

    @Entonces("^el deberia de ver el resultado igual a (\\d+)$")
    public void elDeberiaDeVerElResultadoIgualA(int resultado) {
    }

}

