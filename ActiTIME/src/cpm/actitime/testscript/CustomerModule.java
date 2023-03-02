package cpm.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
import com.acttime.generic.BaseClass;
@Listeners(com.acttime.generic.LIstenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreatCustomer() throws InterruptedException {
		
		Reporter.log("creatCustomer" ,true);
		HomePage h=new HomePage(driver);
	h.setTasks();
	TaskListPage t= new TaskListPage(driver);
	t.getAddNewBtn();
	t.getNewCustomer();
	t.getEnterCustomerNameTbx().sendKeys("HDFC");
	t.getEnterCustomerDescription().sendKeys("Bank Project");
	t.getSelectCustomerDD().click();
	t.getOurCompanyTx().click();
	t.getCreateCustomerBtn().click();
	Thread.sleep(4000);
	
		
	}

}
