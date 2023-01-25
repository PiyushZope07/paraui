package sample;

import io.cucumber.java.en.*;

public class samplejava {

@Given("^I am on Github home page$")
public void i_am_on_github_home_page() {
    System.out.println(" i am on github page");
}

@When("^I specify ([a-zA-Z0-9]{1,})$")
public void sepcifyuname(String uname) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("UserName : "+uname);
}

}
