package org.execution;

import java.io.IOException;

import org.global.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScript extends BaseClass {
	public static void main(String[] args) throws IOException {
		BaseClass baseClass = new BaseClass();
		
		baseClass.getDriver(baseClass.readExcel(1, 0));
		
		baseClass.getUrl(baseClass.readExcel(1, 1));
		
//		WebElement findElement = driver.findElement(By.id("username"));
//		baseClass.sendKeys(findElement, baseClass.readExcel(1, 2));
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		baseClass.sendKeys(userName, baseClass.readExcel(1, 2));
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		baseClass.sendKeys(password, baseClass.readExcel(1, 3));
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		baseClass.clickButton(loginButton);
		
		WebElement openNewAccount = driver.findElement(By.xpath("//a[text()='Open New Account']"));
		baseClass.clickButton(openNewAccount);
		
		WebElement checkingButton = driver.findElement(By.xpath("//select[@id='type']"));
		baseClass.selectByVisibleText(checkingButton, baseClass.readExcel(1, 4));
		
		WebElement findElement = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
		baseClass.clickButton(findElement);
		
		WebElement openNewAccountButton = driver.findElement(By.xpath("//input[@value='Open New Account']"));
		baseClass.click(openNewAccountButton);
		
		//WebElement accountOverview = driver.findElement(By.xpath("//a[text()='Accounts Overview']"));
		//baseClass.click(accountOverview);
		
		//WebElement accountNo = driver.findElement(By.xpath("//a[@href='activity.htm?id=16563']"));
		//baseClass.clickButton(accountNo);
		
		WebElement transferFunds = driver.findElement(By.xpath("//a[text()='Transfer Funds']"));
		baseClass.click(transferFunds);
		
		WebElement amount = driver.findElement(By.id("amount"));
		baseClass.sendKeys(amount, baseClass.readExcel(1, 5));
		
		WebElement fromAccount = driver.findElement(By.id("fromAccountId"));
		baseClass.sendKeys(fromAccount, baseClass.readExcel(1, 6));
		
		WebElement toAccount = driver.findElement(By.id("toAccountId"));
		baseClass.sendKeys(toAccount, baseClass.readExcel(1, 7));
		
		WebElement Transfer = driver.findElement(By.xpath("//input[@class='button']"));
		baseClass.clickButton(Transfer);
		
		WebElement BillPay = driver.findElement(By.xpath("//a[text()='Bill Pay']"));
		baseClass.clickButton(BillPay);
		
		WebElement payeerName = driver.findElement(By.name("payee.name"));
		baseClass.sendKeys(payeerName, baseClass.readExcel(1, 8));
		
		WebElement address = driver.findElement(By.name("payee.address.street"));
		baseClass.sendKeys(address, baseClass.readExcel(1, 9));
		
		WebElement city = driver.findElement(By.name("payee.address.city"));
		baseClass.sendKeys(city, baseClass.readExcel(1, 10));
		
		WebElement state = driver.findElement(By.name("payee.address.state"));
		baseClass.sendKeys(state, baseClass.readExcel(1, 11));
		
		WebElement ZipCode = driver.findElement(By.name("payee.address.zipCode"));
		baseClass.sendKeys(ZipCode, baseClass.readExcel(1, 12));
		
		WebElement phone = driver.findElement(By.name("payee.phoneNumber"));
		baseClass.sendKeys(phone, baseClass.readExcel(1, 13));
		
		WebElement account1 = driver.findElement(By.name("payee.accountNumber"));
		baseClass.sendKeys(account1, baseClass.readExcel(1, 14));
		
		WebElement verifyAccount = driver.findElement(By.name("verifyAccount"));
		baseClass.sendKeys(verifyAccount, baseClass.readExcel(1, 15));
		
		WebElement amount2 = driver.findElement(By.name("amount"));
		baseClass.sendKeys(amount2, baseClass.readExcel(1, 16));
		
		WebElement fromAccount1 = driver.findElement(By.name("fromAccountId"));
		baseClass.sendKeys(fromAccount1, baseClass.readExcel(1, 17));
		
		WebElement sendPayment = driver.findElement(By.xpath("//input[@value='Send Payment']"));
		baseClass.clickButton(sendPayment);
		
		WebElement findTransaction = driver.findElement(By.xpath("//a[text()='Find Transactions']"));
		baseClass.clickButton(findTransaction);
		
	}
	

}
