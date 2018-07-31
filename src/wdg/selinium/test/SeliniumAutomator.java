package wdg.selinium.test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeliniumAutomator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\Selinium\\Gecko\\geckodriver.exe"); WebDriver driver = new
		 * FirefoxDriver(); driver.get("http://www.toolsqa.com");
		 * 
		 * Thread.sleep(5000); driver.quit();
		 * 
		 */

		// *********************** Fire Fox driver ***********************
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\Selinium\\Gecko\\geckodriver.exe");
		 * 
		 * DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 * capabilities.setCapability("marionette", true); WebDriver driver = new
		 * FirefoxDriver(capabilities); driver.get("http://www.toolsqa.com");
		 * 
		 * Thread.sleep(5000); driver.quit();
		 * 
		 */

		// excirseOne();

		// excirseTwo();

		// excirseThree();

		// excirseFour();

		// excirseFive();

		// excirseSix();

		excirseSeven();

	}

	public static void excirseSeven() throws InterruptedException {
		String URL = "Open http://toolsqa.wpengine.com/automation-practice-form/";
		String xpath = "res/Chrome/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", xpath);

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximise window
		driver.manage().window().maximize();
		System.out.println("Maximise window");

		// Open “http://toolsqa.wpengine.com/automation-practice-form/”
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		System.out.println("Open “http://toolsqa.wpengine.com/automation-practice-form/”");

		// Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to
		// identify the element )
		Select multiSelect = new Select(driver.findElement(By.name("selenium_commands")));
		System.out.println("Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element");

		for(WebElement option : multiSelect.getOptions()) {
			
			option.click();
			
			System.out.println(option.getText());
		}
		
		Thread.sleep(5000);
		multiSelect.deselectAll();
		
		// Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		multiSelect.selectByVisibleText("Navigation Commands");
		Thread.sleep(5000);
		multiSelect.deselectByVisibleText("Navigation Commands");
		System.out.println("Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)");
		
		
		Thread.sleep(5000);
		
		driver.quit();
	}

	public static void excirseSix() throws InterruptedException {
		String URL = "Open http://toolsqa.wpengine.com/automation-practice-form/";
		String xpath = "res/Chrome/chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", xpath);

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximise window
		driver.manage().window().maximize();
		System.out.println("Maximise window");

		// Open “http://toolsqa.wpengine.com/automation-practice-form/”
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		System.out.println("Open “http://toolsqa.wpengine.com/automation-practice-form/”");

		// Select ‘Continents’ Drop down ( Use Id to identify the element )
		WebElement selectContinnent = driver.findElement(By.id("continents"));
		System.out.println("Select ‘Continents’ Drop down ( Use Id to identify the element )");

		// Select option ‘Europe’ (Use selectByIndex)
		Select sel = new Select(selectContinnent);
		sel.selectByIndex(1);
		System.out.println("Select option ‘Europe’ (Use selectByIndex)");

		Thread.sleep(4000);

		// Select option ‘Africa’ now (Use selectByVisibleText)
		sel.selectByVisibleText("Africa");
		System.out.println("Select option ‘Africa’ now (Use selectByVisibleText)");

		Thread.sleep(4000);

		// Print all the options for the selected drop down and select one option of
		// your choice
		List<WebElement> dropdownElements = sel.getOptions();

		for (WebElement ddElement : dropdownElements) {

			System.out.println(ddElement.getText());

			if (ddElement.getText().equals("Antartica")) {
				sel.selectByVisibleText("Antartica");
				break;
			}
		}

		Thread.sleep(4000);

		// Kill the browser
		driver.quit();

		System.out.println("Print all the options for the selected drop down and select one option of your choice");

	}

	public static void excirseFive() throws InterruptedException {

		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		String exePath = "D:\\Selinium\\Chrome\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		// Put an Implicit wait,
		System.out.println("Set implicit wait");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(URL);
		System.out.println("Go to the form url");

		// Maximise the window
		driver.manage().window().maximize();
		System.out.println("Maximise the window");

		// Challenge One
		List<WebElement> radio = driver.findElements(By.name("sex"));

		if (!radio.get(1).isSelected()) {
			radio.get(1).click();
		} else {

		}
		System.out.println("Challenge One");

		// Select the Third radio button for category ‘Years of Exp’
		WebElement yearsRadio = driver.findElement(By.id("exp-2"));
		yearsRadio.click();
		System.out.println("Select the Third radio button for category ‘Years of Exp’");

		// Check the Check Box ‘Automation Tester’ for category ‘Profession'
		List<WebElement> profCheck = driver.findElements(By.name("profession"));

		for (WebElement checkList : profCheck) {

			if (checkList.getAttribute("value") == "Automation Tester") {
				checkList.click();
				break;
			}
		}
		System.out.println("Check the Check Box ‘Automation Tester’ for category ‘Profession'");

		// Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use
		// cssSelector)
		WebElement catCheck = driver.findElement(By.cssSelector("#tool-1"));
		catCheck.click();
		System.out.println("Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)");

	}

	public static void excirseFour() throws InterruptedException {

		String URL = "https://www.google.com/";
		String exePath = "D:\\Selinium\\Chrome\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		// Put an Implicit wait,
		System.out.println("Set implicit wait");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// go to the google
		driver.get(URL);
		System.out.println("go to the google");

		// Maximise the window
		driver.manage().window().maximize();
		System.out.println("Maximise the window");

		Thread.sleep(5000);

		// get google text input
		WebElement txtGoogle = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		System.out.println("get google text input");

		// Select google txt input
		txtGoogle.click();
		System.out.println("Select google txt input");

		// Enter Search criteria
		txtGoogle.sendKeys("face book");
		System.out.println("Enter Search criteria");

		// Press Enter
		txtGoogle.sendKeys(Keys.ENTER);
		System.out.println("Press Enter");

		// get face book link
		WebElement linkFacebook = driver.findElement(By.xpath("//a[contains(text(),'Facebook - Log In or Sign Up')]"));
		System.out.println("get face book link");

		// Click on face book link
		linkFacebook.click();
		System.out.println("Click on facebook link");

		// Get txt username
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println("Get txt username");

		// Get txt pwd
		WebElement txtPwd = driver.findElement(By.xpath("//input[@id='pass']"));
		System.out.println("Get txt pwd");

		// Fill user name
		txtUserName.sendKeys("jananga_h@yahoo.com");
		System.out.println("Fill user name");

		// Fill Password
		txtPwd.sendKeys("janaboy12345678");
		System.out.println("Get txt pwd");

		// get submit
		WebElement submit = driver.findElement(By.id("loginbutton"));
		System.out.println("get submit");

		// do submit
		submit.submit();
		System.out.println("Do submit");

	}

	public static void excirseThree() throws InterruptedException {

		String URL = "http://demoqa.com/";
		String exePath = "D:\\Selinium\\Chrome\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.navigate().to(URL);
		System.out.println("Loaded");
		// Click on link
		driver.findElement(By.xpath("//a[contains(text(),'Registration')]")).click();
		System.out.println("clicked");
		Thread.sleep(5000);

		// Come to Back Page
		driver.navigate().back();
		System.out.println("go back");

		// Go to forward page
		driver.navigate().forward();
		System.out.println("go forward");

		// go back to main page
		driver.navigate().to(URL);
		System.out.println("load main");

		// Refresh the browser
		driver.navigate().refresh();
		System.out.println("refrish");

		Thread.sleep(5000);

		// Close the browser
		driver.close();
		System.out.println("closed");

	}

	public static void excirseTwo() throws InterruptedException {

		String URL = "http://demoqa.com/frames-and-windows/";
		String exePath = "D:\\Selinium\\Chrome\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();

		driver.get(URL);
		String elementName = driver.findElement(By.xpath("//a[contains(text(),'Registration')]")).getText();
		System.out.println("Name : " + elementName);

		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Registration')]"));

		Actions newTab = new Actions(driver);
		newTab.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(5000);

		// handle windows change
		String base = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();

		set.remove(base);
		assert set.size() == 1;
		driver.switchTo().window((String) set.toArray()[0]);

		// driver.findElement(By.xpath("//a[contains(text(),'Registration')]")).click();

		// Point testLoc =
		// driver.findElement(By.xpath("//a[contains(text(),'Registration')]")).getLocation();

		// System.out.println(testLoc.toString());

		// driver.close();
	}

	public static void excirseOne() {

		String URL = "http://www.store.demoqa.com";
		String exePath = "D:\\Selinium\\Chrome\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);

		String title = driver.getTitle();

		System.out.println("Title : " + title);
		System.out.println("Title Length : " + title.length());

		if (driver.getCurrentUrl().equals(URL)) {
			System.out.println("Yes, Correct URL");
		} else {
			System.out.println("No, Bad URL");
			System.out.println("Expected URL : " + URL);
			System.out.println("Current URL : " + driver.getCurrentUrl());
		}

		System.out.println("Page Source Length : " + driver.getPageSource().length());

	}

}
