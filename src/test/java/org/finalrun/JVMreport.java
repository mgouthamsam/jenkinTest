package org.finalrun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import gherkin.GenerateTokens;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {
	public static void generateJVMreport(String json) {
		
	// select the report to be concerted
		File f =new File("Report\\JVM");
		
		
	// name the report and if u want add some extra details about	
		Configuration c = new Configuration(f, "FB app");
		c.addClassifications("value 1", "java");
		c.addClassifications("value 2", "selenium");
		
		
	//to get the report listed	
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		
	// finally to get the report         (list, config)
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
		
		
		 
		
				
		
		
		
		
		
		
		
		
		
	}

}
