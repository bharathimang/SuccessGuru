package genericWrappers;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import pages.BasePage;

public class Wrapper extends BasePage{
	
	public static String generateRandomString(int length) {
		String s="iosdhfosui89jsdfi";
		StringBuilder sb=new StringBuilder();
		Random rand=new Random();
		for(int i=0;i<=length; i++) {
			int index=rand.nextInt(s.length());
			char c=s.charAt(index);
			sb.append(c);
		}
		return sb.toString();
	}
		
	
	public static void createScreenCapture() throws IOException {
		TakesScreenshot ss=(TakesScreenshot) driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("target//Screenshots//"+generateRandomString(8)+".png");
		FileHandler.copy(src, dest);
	}
	
	public static Boolean compareTwoStrings(String str1, String str2){
		boolean result=false;
		if(str1.equals(str2)){
			result=true;
		}
		else{
			result=false;
		}
		return result;
	}
}
