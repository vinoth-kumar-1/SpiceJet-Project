package enginecomponent;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import utility.WebUtil;

public class Base  extends WebUtil {
	
	@BeforeSuite
	public void beforesuite() {
		startReport();
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforetest() {
		test = reports.createTest("testcasereport");
		browserOpen(readProperty("browser"));
		browserMaximize();
		implicitWaitMethod(10);
		pageOpen(readProperty("url"));
		
	}

	@AfterMethod(alwaysRun=true)
	public void aftertest() {
		//implicitWaitMethod(5);
		//browserClose();
	}
	
	@AfterSuite
	public void aftersuite() {
		stopReport();
	}

}
