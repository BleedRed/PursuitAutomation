package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	private static String propertiesData;

	public static String readPropertiesFile(String inputData) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(
					"C:\\Users\\shuva\\eclipse-workspace\\AutomationuUsingSeleium\\src\\test\\java\\TestResources");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			fis.close();
		}
		propertiesData = prop.getProperty(inputData);
		return propertiesData;
		
	}
}
