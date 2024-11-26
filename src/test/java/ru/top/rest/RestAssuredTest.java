package ru.top.rest;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Matches;

public class RestAssuredTest {

    @Test
    public void getOkTest() {
        RestAssured.get("https://run.mocky.io/v3/30032c5a-a214-428f-aed0-6bf301573d41").then()
                .statusCode(200)
                .header("top",Matchers.equalTo("academy"))
                .body("user.name", Matchers.equalTo("lena"))
                .body("user.age", Matchers.equalTo(38));
    }


}
