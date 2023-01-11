package com.nttdata.petstore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ObtenerOrderStepsDefs {
    @Steps
    ObtenerOrder obtenerOrder;

    @When("establezco la peticion con id {int}")
    public void obtenerOrder(int id) {
        obtenerOrder.obtenerOrder(id);
    }

    @And("envio la peticion GET HTTP")
    public void existeBodyEnElResponse() {
        System.out.println(SerenityRest.lastResponse().print());
    }

    @And("recibo valida HTTP codigo de respuesta {int}")
    public void elCódigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

}
