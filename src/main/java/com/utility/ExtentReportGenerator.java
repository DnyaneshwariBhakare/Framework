package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		String path="C:\\Users\\HP\\eclipse-workspace\\Framework\\Report";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Teamrock report");
		reporter.config().setTheme(Theme.DARK);
		
	    extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name ", "Test Batch Project");
		extent.setSystemInfo("O.S.", "Windows");
		extent.setSystemInfo("Tool", "Selenium WebDriver");
		extent.setSystemInfo("QA", "ABC");
		return extent;
	}

}