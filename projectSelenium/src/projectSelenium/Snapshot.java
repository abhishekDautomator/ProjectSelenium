package projectSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
;

public class Snapshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\naray\\OneDrive\\Desktop\\driver\\operadriver_win64\\operadriver.exe");
		OperaOptions opt=new OperaOptions(); 
		opt.setBinary("C:\\Program Files\\Opera\\launcher.exe");
		WebDriver driver=new OperaDriver(opt);
		
		driver.manage().window().maximize();
		
		driver.get("http:\\www.google.co.in");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\naray\\Desktop\\Snap.jpg"));
		

	}

}
