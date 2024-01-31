package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    Properties Pro;

    public ConfigReader() {
        File file = new File(System.getProperty("user.dir") + "/ObjectRepository/config.properties");
        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
            Pro = new Properties();
            Pro.load(fis);
        } catch (Exception e) {
            System.out.println("Error Message is --- " + e.getMessage());
        }
    }

    public String valueOnTheKey(String name) {
        return Pro.getProperty(name);
    }

}
