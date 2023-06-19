package testcomponent;

import org.testng.annotations.Test;

import enginecomponent.Base;
import pagecomponent.HomePages;


public class RegTest extends Base {
	
	@Test
	public void test01() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.openSpiceJet();
	}
	
	@Test
	public void test02() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.spiceJetLinkValidation();
	}
	
	@Test
	public void test03() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.signIn();
	}
	
	@Test
	public void test04() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.signUp();
	}
	
	@Test
	public void test05() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.signInWithSignOut();
	}
	
	
	@Test
	public void test06() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.roundTripOption();
	}
	
	
	@Test
	public void test07() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.oneWayTripOption();
	}
}
