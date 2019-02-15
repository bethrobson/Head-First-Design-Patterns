package factory.drivermanager;


import org.openqa.selenium.WebDriver;

public class WebDriverClient {

    public static void main (String args[]) {
        DriverManager driverManager;
        WebDriver driver;

        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driverManager.quitDriver();


    }

}
