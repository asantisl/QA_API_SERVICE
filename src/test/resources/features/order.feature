Feature: Crear order PetStore

  @test-createOrder
  Scenario: Crear order

    When creo el order con petId 0
    Then el código de respuesta es 200
    And existe body en el response "placed"

  Scenario Outline: Crear order con petId negativo

    When creo el order con petId <numId>
    Then el código de respuesta es <statusCode>
    And existe body en el response <response>

    Examples:
      | numId | statusCode | response |
      | -1    | 500        | place    |
      | -2    | 500        | place    |

  @test-getOrder
  Scenario: Obtener order

    When establezco la peticion con id 2
    And envio la peticion GET HTTP
    Then recibo valida HTTP codigo de respuesta 200

  Scenario Outline: Obtener order con id negativo

    When creo el order con petId <numId>
    Then el código de respuesta es <statusCode>
    And existe body en el response <response>

    Examples:
      | numId | statusCode | response |
      | -1    | 500        | place    |
      | -2    | 500        | place    |