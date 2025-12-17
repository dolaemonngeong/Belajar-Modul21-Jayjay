package myTest.junitTest.stepdef;

import io.cucumber.java.en.Then;
import myTest.junitTest.page.HomePage;

public class HomeStepDef extends BaseTest {
    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateBackButoonDisplayed();
    }
}
