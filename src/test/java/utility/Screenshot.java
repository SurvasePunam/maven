package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	
	
	public static String captureScreenshot (WebDriver driver) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date date=new Date();
		SimpleDateFormat fmat=new SimpleDateFormat("dd_MM_YYYY_hh_MM_SS");
		String name=fmat.format(date);
		String path="C:\\Users\\Punam Survase\\eclipse-workspace\\MavenProject\\Screenshot\\login"+System.currentTimeMillis()+".jpg";
		File dest=new File(path);
		FileHandler.copy(src, dest);
		
		return path;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
