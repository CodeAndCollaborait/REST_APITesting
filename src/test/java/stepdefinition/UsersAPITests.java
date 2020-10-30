package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matcher.*;
import io.restassured.RestAssured.*;
import io.restassured.matcher.ResponseAwareMatcher.*;

import static io.restassured.RestAssured.given;

public class UsersAPITests {

    String baseAPI;

    @Given("^Users API url can be called by system$")
    public void users_API_url_can_be_called_by_system() {
        given().when().get();
    }

    @When("^System call Users API url with valid data$")
    public void system_call_Users_API_url_with_valid_data() {
        System.out.println("This is When");
    }

    @Then("^Users API should return HTTP stats code (\\d+)$")
    public void users_API_should_return_HTTP_stats_code(int arg1)  {
        System.out.println("This is first then");
    }

    @Then("^Users API should return response with data in JSON format$")
    public void users_API_should_return_response_with_data_in_JSON_format()  {
        System.out.println("This is second then");
    }
}
