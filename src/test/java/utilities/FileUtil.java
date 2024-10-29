package utilities;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import com.google.gson.Gson;

public class FileUtil {
	
	//This file contains filePaths and other file related reading and writing utilities
	
	public static final String loginTestDataFilePath = "./src/test/resources/TestData/LoginTestData.json";
	
	public static String readFromJson(String filePath, String key) {
		
		String value="";
		String json= null;
		
		try {
			byte[] encoded = Files.readAllBytes(Paths.get(filePath));
			json = new String(encoded, StandardCharsets.UTF_8);
		} catch(IOException e) {
			System.out.println("Read input test data from JSON failed");
		}
		
		if(json != null) {
			Gson gson = new Gson();
			HashMap<String, String> inputMap = gson.fromJson(json, HashMap.class);
			
			value = inputMap.get(key);
			
		} else {
			System.out.println("JSON is blank");
		}
		return value;	
		
	}
}
