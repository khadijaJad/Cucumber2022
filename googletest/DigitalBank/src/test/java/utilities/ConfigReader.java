package utilities;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;
    public static  void initProperties(){
        prop=new Properties();
        try {
            prop.load(Files.newInputStream(Paths.get("C:\\Users\\17033\\Desktop\\googletest\\DigitalBank\\src\\test\\ressources\\configuration.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String getProperties(String key) {

        return prop.getProperty(key).trim();
    }


}
