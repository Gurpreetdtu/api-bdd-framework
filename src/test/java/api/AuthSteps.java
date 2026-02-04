package api;

import io.cucumber.java.en.*;

public class AuthSteps {

    @Given("I have valid auth credentials")
    public void i_have_valid_auth_credentials() {
        System.out.println("Credentials ready");
    }

    @When("I send POST request to generate token")
    public void i_send_post_request_to_generate_token() {
        System.out.println("POST request sent");
    }

    @Then("status code should be {int}")
    public void status_code_should_be(Integer code) {
        System.out.println("Status code: " + code);
    }

    @Then("token should be generated")
    public void token_should_be_generated() {
        System.out.println("Token generated");
    }
    
    
   
    
    
}
