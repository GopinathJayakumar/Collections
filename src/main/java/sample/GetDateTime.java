package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class GetDateTime {
	
	public static void main(String[] args) {
		GetDateTime ss = new GetDateTime();
		WriteProperty wr = new WriteProperty();
		wr.writeProperty(ss.getCurrentTime());		
	}

	public String getCurrentTime() {
		DateFormat simpleDateF = new SimpleDateFormat("yyyy/m/dd HH:mm:ss");
		Date name = new Date();		
		System.out.println(simpleDateF.format(name));
		return simpleDateF.format(name);
	}
	
	public void damp() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("./config.properties"));
			prop.getProperty("time");
		}catch (IOException e) {
			
		}
		/*Properties prop = new Properties()
				File file = new File('config.properties')
				file.withInputStream {
			prop.load(it)
				}*/
	}
	
	
	
}
