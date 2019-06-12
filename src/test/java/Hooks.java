import com.vwfsinsurance.driver.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {


    DriverManager driverManager = new DriverManager();

    @Before
    public void setup() {


        driverManager.openBrowser("chrome");
        driverManager.navigateTo("https://covercheck.vwfsinsuranceportal.co.uk/");
        driverManager.maxBrowser();
        driverManager.applyImplicit();
        driverManager.sleep(3000);
    }

    @After
    public void tearDown() {
        driverManager.closeBrowser();
    }
}



