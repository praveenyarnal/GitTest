package guru99.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
 protected WebDriver driver;
 @Test
 public void guru(){
	 driver=new FirefoxDriver();
	 String eTitle="Meet Guru99";
	 String aTitle="";
	 driver.get("http://www.guru99.com/");
	 driver.manage().window().maximize();
	 aTitle=driver.getTitle();
	 if(aTitle.contentEquals(eTitle)){
		 System.out.println("Test is passed");
	 }
	 else{
		 System.out.println("Its failed");
	 }
	 driver.close();
 }
}
