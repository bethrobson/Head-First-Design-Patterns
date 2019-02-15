package factory.drivermanager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class ChromeDriverManager extends DriverManager {

    private ChromeDriverService chService;

    @Override
    public void startService(){
        System.setProperty("webdriver.chrome.driver","/Users/cwr.derek.berger/Projects/git-hub/Head-First-Design-Patterns/src/main/resources/chromedriver");
        if (null == chService){
            try{
                chService = new ChromeDriverService
                        .Builder()
                        .usingDriverExecutable(new File(System.getProperty("webdriver.chrome.driver")))
                        .usingAnyFreePort()
                        .build();

                chService.start();

            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stopService(){
        if(null != chService && chService.isRunning())
            chService.stop();
    }

    @Override
    public void createDriver(){
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(chService, capabilities);
    }
}
