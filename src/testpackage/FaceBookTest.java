package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackage.FaceBook;

public class FaceBookTest {
	WebDriver driver;
	String url="https://www.facebook.com/";
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void loginTest() throws Exception {
		FaceBook obj=new FaceBook(driver);
		obj.setValues("aleenaap", "aleenasreekutti");
		obj.login();
		Thread.sleep(2000);
		obj.backward();
		obj.CreatePage();
		obj.verifyTitle();
	}

}
