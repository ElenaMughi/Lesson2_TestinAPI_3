package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
//                .body("add{\"id\"~4;\"name\"~\"Текущий зарплатный счёт\";\"number\"~1111111112;\"balance\"~110;\"currency\"~\"USD\"}")
//                .body("{\"id\"=4,\"name\"=\"Текущий зарплатный счёт\",\"number\"=1111111112,\"balance\"=110,\"currency\"=\"USD\"}")
                .body("Текущий зарплатный счёт")
                // Выполняемые действия
                .when()
                .post("/post")

                // Проверки
                .then()
                .statusCode(200)
//                .body("data.name", equalTo("Текущий зарплатный счёт"));
                .body("data", equalTo("Текущий зарплатный счёт"));

    }
}

