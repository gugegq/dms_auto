package com.inspirus.dms.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class getProperties {
	static Properties props;
	static {
		File file = new File("resources\\SiteInfo.properties");
		props = new Properties();
		String url = file.getAbsolutePath();

		try {
			InputStream in = new FileInputStream(url);
			props.load(in);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static String readValue(String key) {
		try {
			String value = props.getProperty(key);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("ConfigInfoError" + e.toString());
			return "";
		}
	}
}
