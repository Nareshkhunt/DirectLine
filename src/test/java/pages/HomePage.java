package pages;

import com.vwfsinsurance.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends DriverManager
{
    public static String regNumber;

    @FindBy(id="vehicleReg")
    WebElement registrationNo;
    @FindBy(id="icon")
    WebElement magnifierGlass;
    @FindBy(css="div.result")
    WebElement resultFor;



    public void setRegistrationNo(String regno)
    {
        regNumber=regno;
        registrationNo.sendKeys(regno);
    }
    public void setMagnifierglass()
    {
        magnifierGlass.click();
    }

    public String getUrl()
    {
         return driver.getCurrentUrl();

    }


    public String getResultfor()
    {
        return resultFor.getText().substring(13,20);
    }
}
