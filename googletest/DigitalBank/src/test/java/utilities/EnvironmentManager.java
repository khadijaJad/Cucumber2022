package utilities;

public class EnvironmentManager {
    //we will use this class to set up all the environment variables
    ////our environment will have different Url's and different  user credentials, (api endpoint)
    public static String baseUrl;
    public static String username;
    public static String password;
    public static void setUpEnvironment() throws Exception {
        switch (ConfigReader.getProperties("environment").toLowerCase()){
            case "dev":
                DEV();
                break;
            case "qa":
                QA();
                break;
            case "prod":
                PROD();
                break;
            default:
                throw new Exception("Invalid environment in configuration .properties.\n"+ "please select from :dev,qa,prod");
        }
    }

    private static void DEV(){
        //this wiill be to setup dev variables
        baseUrl="https://www.dev-meetup.com/";
        username="TestUserDev";
        password="Test123";
    }
    private static void QA(){
        //this will setup qa variables
        baseUrl="https://www.qa-meetup.com/";
        username="TestUserQa";
        password="test123";

    }
    private static void PROD(){
        //this will setup prod variables
        baseUrl="https://www.meetup.com/";
        username="ProdUsre";
        password="test123";

    }
}
