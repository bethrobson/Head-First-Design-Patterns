package factory.drivermanager;



public class DriverManagerFactory {

    
    public static DriverManager getManager(DriverType type){

        System.out.println("Creating a unique(???) instance of Web Driver.");

        DriverManager driverManager;

        switch(type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case SAFARI:
                driverManager = new SafariDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        System.out.println("Returning instance of Web Driver.");
        return driverManager;

    }
}
