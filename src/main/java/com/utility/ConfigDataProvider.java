package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties p;
	public ConfigDataProvider() throws Exception
	{
		String path="C:\\Users\\HP\\eclipse-workspace\\Framework\\config\\config.Properties";
		FileInputStream file1=new FileInputStream(path);
		p=new Properties();
		p.load(file1);
		
	}
	public String get_BaseUrl_QA1()   {
		return p.getProperty("BaseUrl_QA1");
		
		
	}

}
