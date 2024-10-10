package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FaceBook {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement fbEmail;
	
	@FindBy(id="pass")
	WebElement fbPass;
	
	@FindBy(name="login")
	WebElement fbLogin;
	
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement fbCreatePage;
	
	public FaceBook(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setValues(String un,String pswd) {
		fbEmail.sendKeys(un);
		fbPass.sendKeys(pswd);
	}
	public void login() {
		fbLogin.click();
	}
	public void backward() {
		driver.navigate().back();
	}
	public void CreatePage() {
		fbCreatePage.click();
	}
	public void verifyTitle() {
		String exp_title="facebook";
		String act_title=driver.getTitle();
		System.out.println("Actual title= "+act_title);
		Assert.assertEquals(act_title,exp_title);
	}
 
}
