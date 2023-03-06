package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
import com.acttime.generic.BaseClass;
@Listeners(com.acttime.generic.LIstenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreatCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	String customerName=f.getExcelData("Sheet1", 1, 2);
	String customerDescription=f.getExcelData("Sheet1", 1, 3);
		Reporter.log("creatCustomer" ,true);
		HomePage h=new HomePage(driver);
	h.setTasks();
	TaskListPage t= new TaskListPage(driver);
	t.getAddNewBtn();
	t.getNewCustomer();
	t.getEnterCustomerNameTbx().sendKeys(customerName);
	t.getEnterCustomerDescription().sendKeys(customerDescription);
	t.getSelectCustomerDD().click();
	t.getOurCompanyTx().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(4000);
	
		
	}

}
