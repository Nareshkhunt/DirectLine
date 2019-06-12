package Stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class Home_stepdef {

        HomePage homePage = new HomePage();

        @Given("^user is on  Dealer Portal Page$")
        public void userIsOnDealerPortalPage()
        {
            String actual=homePage.getUrl();
            assertThat(actual,is(equalToIgnoringCase("https://covercheck.vwfsinsuranceportal.co.uk/")));
        }



        @When("^user enter the vehicle registration no \"([^\"]*)\"$")
        public void user_enter_the_vehicle_registration_no(String regno)
        {
            homePage.setRegistrationNo(regno);
        }

        @When("^user click on find button$")
        public void user_click_on_find_button()
        {
            homePage.setMagnifierglass();
        }

        @Then("^user should able to see his vehicle cover details$")
        public void user_should_able_to_see_his_vehicle_cover_details()
        {
            String actual=homePage.getResultfor();
            System.out.println(actual);
            assertThat(actual,is(equalToIgnoringCase(homePage.regNumber)));

        }}



