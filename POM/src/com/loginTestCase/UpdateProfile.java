package com.loginTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.testng.annotations.Test;

public class UpdateProfile {
	public static WebElement profile(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='text']"));

	}
	public static  WebElement phoneNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='text']"));
	}
	public static WebElement pincode(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='text']"));

	}
	public static WebElement address(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='text']"));

	}
}
