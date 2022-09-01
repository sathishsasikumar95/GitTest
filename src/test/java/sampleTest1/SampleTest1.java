package sampleTest1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest1 {

	@Test
	public void loginTest() throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		wd.get("https://www.google.com/search?q=nature&sxsrf=ALiCzsZftMQch3xkm8RNFVWzR1eQs6FbwA:1659035369660&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiQh4OvpJz5AhVoFLcAHUWCC1EQ_AUoAXoECAMQAw&biw=1366&bih=625&dpr=1");
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
//			FileUtils //appache //1.0, 2.0
		FileHandler.copy(src, new File("GitTest\\screenshot\\google.png"));

	}

}
