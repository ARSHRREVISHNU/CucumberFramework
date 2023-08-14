package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;

public class APITests {

    public Response response;
    @Given("Get call without params")
    public void getCall(){
        RestAssured.baseURI = "https://reqres.in/";
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .get("/api/users");

          response.then().log().body();

    }

    @Given("Get call {string}")
    public void getCall(String endpoint){
        RestAssured.baseURI = "https://reqres.in/";
        response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .get(endpoint)
                .andReturn();

        response.then().log().body();
    }
    @Given("Read data from data table")
    public void dataTableValues(DataTable data){
        List<List<String>> list = data.asLists();
        System.out.println(list.get(0).get(0));
        System.out.println(list.get(0).get(1));
        System.out.println(list.get(0).get(2));
        System.out.println(list.get(0).get(3));
    }
    @When("Response status check {int}")
    public void responseCheck(int page){
        response.then().extract().path("page");
    }

    @Given("Username {string} and password {string} print")
    public void userNameAndPasswordPrint(String user, String pass){
        System.out.println(user+" "+pass);
    }


    @Given("Sample given statement")
    public void backgroundSampleGivenStatement(){
        System.out.println("Sample given statement");

    }
}
