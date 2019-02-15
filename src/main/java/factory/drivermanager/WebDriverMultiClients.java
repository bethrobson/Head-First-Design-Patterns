package factory.drivermanager;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebDriverMultiClients {

    public static void main(String args[]) {

        int threads = 4;
        ExecutorService executor= Executors.newFixedThreadPool(threads);

        try{
            for (int i=0; i < threads; i++){
                executor.execute(() -> launchWebDriver());
            }
        }catch(Exception err){
            err.printStackTrace();
        }
        executor.shutdown();

    }

    private static void launchWebDriver() {
        DriverManager driverManager;
        WebDriver driver;
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driverManager.quitDriver();

    }



}
