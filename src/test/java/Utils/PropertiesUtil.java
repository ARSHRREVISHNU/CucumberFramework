package Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public Properties properties;
    public FileInputStream fileInputStream;

    public PropertiesUtil() throws IOException {

        if(properties==null){
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        }
    }

    public String valueReadFromProperty(String key){

        return properties.getProperty(key);
    }
}
