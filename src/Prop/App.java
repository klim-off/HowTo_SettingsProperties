package Prop;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        var props = getProperties();
        System.out.println(props.get("bear.emoji"));
    }

    public static Properties getProperties() {
        try (FileReader reader = new FileReader("settings.properties")) {
            Properties properties = new Properties();
            properties.load(reader);
            return properties;
            //System.out.println(properties.getProperty("bear.emoji"));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}