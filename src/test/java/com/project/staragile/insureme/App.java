package com.project.staragile.insureme;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class App {
	@SuppressWarnings({ "deprecation" })
	public static void main(final String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
		final ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		final WebDriver driver = (WebDriver) new ChromeDriver(chromeOptions);
		driver.get("http://15.206.203.77:8085/contact.html");
		//driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		driver.findElement(By.id("inputName")).sendKeys(new CharSequence[] { "Zeehan Khan" });
		driver.findElement(By.id("inputNumber")).sendKeys(new CharSequence[] { "808512687" });
		driver.findElement(By.id("inputMail")).sendKeys(new CharSequence[] { "khan@gmail.com" });
		driver.findElement(By.id("inputMessage")).sendKeys(new CharSequence[] { "hi i m zeehan this is my insurance project" });
		driver.findElement(By.id("my-button")).click();
		final String message = driver.findElement(By.id("response")).getText();
		if (message.equals("Message Sent")) {
			System.out.println("Script executed Successfully");
		} else {
			System.out.println("Script failed");
		}
		
		}

}