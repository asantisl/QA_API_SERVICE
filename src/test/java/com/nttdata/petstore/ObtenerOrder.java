package com.nttdata.petstore;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
public class ObtenerOrder {

    @Step("Obtener order {0} en PetStore")
    public void obtenerOrder(int Id ){
        SerenityRest.given()
                .contentType("application/json")
                .when()
                .get("https://petstore.swagger.io/v2/store/order/"+Id);
    }
}

