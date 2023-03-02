package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
		
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
		
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerNameTbx;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;

	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;

	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompanyTx;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerCreated;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the addNewBtn
	 */
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	/**
	 * @return the newCustomer
	 */
	public WebElement getNewCustomer() {
		return newCustomer;
	}

	/**
	 * @return the enterCustomerNameTbx
	 */
	public WebElement getEnterCustomerNameTbx() {
		return enterCustomerNameTbx;
	}

	/**
	 * @return the enterCustomerDescription
	 */
	public WebElement getEnterCustomerDescription() {
		return enterCustomerDescription;
	}

	/**
	 * @return the selectCustomerDD
	 */
	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	/**
	 * @return the ourCompanyTx
	 */
	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}

	/**
	 * @return the createCustomerBtn
	 */
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	/**
	 * @return the actualCustomerCreated
	 */
	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}
}
