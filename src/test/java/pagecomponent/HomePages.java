package pagecomponent;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import enginecomponent.Base;
import utility.WebUtil;

public class HomePages extends Base{
	
	WebUtil webutilobj = new WebUtil();
	
	
//	@FindBy(className = "css-1dbjc4n r-1awozwy r-1eqmklk r-dwliz8 r-1phboty r-18u37iz r-1n0xq6e")
//	WebElement signup;   // Not Working
	
	
//	@FindBy(css = "div[class='css-1dbjc4n.r-1awozwy.r-1eqmklk.r-dwliz8.r-1phboty.r-18u37iz.r-1n0xq6e']")
//	WebElement signup;   // Not Working
	
	@FindBy(css = "div[class='css-1dbjc4n r-1awozwy r-1eqmklk r-dwliz8 r-1phboty r-18u37iz r-1n0xq6e']")
	WebElement signup;   // Working
	
//	@FindBy(linkText ="Signup")
//	WebElement signup;   // Working
	
	@FindBy(xpath = "//select[@class='form-control form-select ']")
	WebElement dropdowninsignupfortitle;     // Working
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;    // Working
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname;     // Working
	
	@FindBy(xpath = "//select[@class='form-control form-select' and @tabindex='0']")
	WebElement country;      // Working
	
	@FindBy(id = "dobDate")
	WebElement dateofbirth;   // Working
	
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement drop_down_year_in_dateofbirth;   // Working
	
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement drop_down_month_in_dateofbirth;   // Working 
	
//	@FindBy(xpath = "//div[text()='20']")
//	WebElement drop_down_date_in_dateofbirth;    // Not Working
	
	@FindBy(xpath = "//div[@aria-label='Choose Sunday, August 20th, 1995']")
	WebElement drop_down_date_in_dateofbirth;    // Working
	
	@FindBy(xpath = "//div[@class='arrow']")
	WebElement dropdownarrowinphonenumber;       // Working
	
	@FindAll({@FindBy(xpath = "//ul[@class=' country-list']")})
	List<WebElement> dropdownlistinphonenumber;    // Working
	
//	@FindBy(xpath = "//ul[@class=' country-list']")
//	WebElement dropdownlistinphonenumber;
	
//	@FindBy(xpath = "//li[@data-country-code='in']")
//	WebElement indiainphonenumber;     // Working doubt
	
//	@FindBy(xpath = "//li[@class='country highlight']")
//	WebElement indiainphonenumber;     // Working doubt
	
	@FindBy(xpath = "//span[text()='India']")
	WebElement indiainphonenumber;     // Working
	
	@FindBy(xpath = "//input[normalize-space(@type)='tel']")
	WebElement phonenumber;
	
//	@FindBy(xpath = "//input[@type='tel' and @value='+91']")
//	WebElement phonenumber;            // Working doubt 
	
//	@FindBy(xpath = "//div[text()='Phone']")
//	WebElement phonenumber;            // Working doubt
	
//	@FindBy(xpath = "//input[@placeholder='+91 01234 56789']")
//	WebElement phonenumber;             // Working doubt
	
//	@FindBy(xpath = "//*[@id='react-root']/div/div/div[2]/div[2]/div/div[1]/div[4]/div[1]/div/div[1]/input")
//	WebElement phonenumber;        // Working
	
	@FindBy(id = "email_id")
	WebElement email;
	
//	@FindBy(xpath = "//input[@id='email_id']")
//	WebElement email;
	
	@FindBy(xpath = "//input[@type='password' and @id='new-password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='password' and @id='c-password']")
	WebElement confirmpassword;
	
	@FindBy(id = "defaultCheck1")
	WebElement checkboxinsignup;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitinsignup;
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginbutton;
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[4]")
	WebElement emailbutton;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement emailtextbox;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement passwordtextbox;
	
//	@FindBy(xpath = "(//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa'])[1]")
//	WebElement usernameaftersignin;
	
//	@FindBy(css = "(div[class='css-76zvg2.r-jwli3a]")
//	WebElement usernameaftersignin;
	
//	@FindBy(xpath = "//div[text()='Hi ']")
//	WebElement usernameaftersignin;
	
//	@FindBy(xpath = "//*[@id='main-container']/div/div[1]/div[2]/div[1]/div/div[3]/div[1]/div[2]/div[1]")
//	WebElement usernameaftersignin;   // Working
	
//	@FindBy(xpath = "//div[normalize-space(@class)='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa']")
//	WebElement usernameaftersignin;    // Not Working
	
//	@FindBy(xpath = "//div[contains(@class,'Hi')]")
//	WebElement usernameaftersignin;    // Not Working
	
	@FindBy(xpath = "//div[contains(text(),'Hi ')]")
	WebElement usernameaftersignin;    //  Working 

//	@FindBy(linkText ="Log Out")
//	WebElement logout;
	
	@FindBy(xpath = "//div[contains(text(),'Log ')]")
	WebElement logout;  // Working

//	@FindBy(xpath ="//*[@id='main-container']/div/div[1]/div[2]/div[1]/div/div[3]/div[2]/div[3]/div")
//	WebElement logout;   // Working
	
//	@FindBy(xpath = "//*[@id='main-container']/div/div[3]/div[2]/div[2]/div/div/div/div[5]/div[3]")
//	WebElement loginbox;   // Working
	
//	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
//	WebElement loginbox;   // Not Working
	
	@FindBy(xpath = "//div[normalize-space(@class)='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement loginbox;   // Working
	
	
//	@FindBy(xpath = "//div[normalize-space(@class)='css-76zvg2 r-jwli3a r-18tvxmy r-1b43r93 r-majxgm r-q4m81j']")
//	WebElement loginbox;   // Not Working
	
	

//   @FindBy(xpath = "//div[normalize-space(@class)='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af']")
//	WebElement loginbox;   // Not Working
	
//	@FindBy(xpath = "//*[@id='main-container]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input")
//	WebElement tobutton;   // Working

	@FindBy(xpath = "//input[normalize-space(@class)='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")
	WebElement tobutton;
	
	
	
	
	
	
	
	
	
//	@FindBy(css="('class.r-10paoce.r-13qz1uu')")
//	WebElement frombutton;   // Not Working
	
//	@FindBy(css="input[class='r-10paoce r-13qz1uu']")
//	WebElement frombutton;    // Not Working
	
//	@FindBy(xpath = "//input[@class=' r-10paoce r-13qz1uu’]")
//	WebElement frombutton;    // Not Working
	
//	@FindBy(xpath = "//input[contains(@class, ‘r-10paoce’) and contains(@class, ‘r-13qz1uu’)]")
//	WebElement frombutton;  // Not Working 
	
//	@FindBy(xpath = "//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")
//	WebElement frombutton;   // Working
	
//	@FindBy(xpath = "//input[contains(class,' r-10paoce r-13qz1uu')]")
//	WebElement frombutton;   // Not Working
	
//	@FindBy(xpath = "//input[@class[normalize-space() = 'css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu]]")
//	WebElement frombutton; // Not Working 
	
	@FindBy(xpath = "//input[normalize-space(@class)='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")
	WebElement frombutton;   // Working
	
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[2]")
	WebElement roundtripbutton; 
	
	@FindBy(xpath = "//div[normalize-space(@class)='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79 r-1ozqkpa']")
	WebElement internationalbutton; 
	
	@FindBy(xpath = "//div[normalize-space(@class)='css-76zvg2 r-jwli3a r-ubezar']")
	WebElement bangkok;
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	WebElement to;
	
	@FindBy(xpath = "//div[normalize-space(@class)='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")
	WebElement depaturedate;
	
	@FindBy(xpath = "//div[normalize-space(@class)='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")
	WebElement returndate;
	
	
	@FindBy(xpath = "//div[normalize-space(@class)='css-76zvg2 r-jwli3a r-1b6yd1w r-1kfrs79']")
	WebElement searchflight;

	
public HomePages() {
		
		PageFactory.initElements(WebUtil.driver, this);
	}

public void openSpiceJet() {
	try {
		
		test.addScreenCaptureFromPath(getScreenShot("openspicejet"));
		test.log(Status.PASS, "Website Opened Successfull");
	} catch (IOException e) {
		test.log(Status.FAIL, "Website Opened Failed");
		e.printStackTrace();
	}
	
}

public void spiceJetLinkValidation() {
	try {
		Assert.assertEquals(webutilobj.getCurrentUrlMethod(), (readProperty("url")));
		test.addScreenCaptureFromPath(getScreenShot("spicejetlinkvalidation"));
		test.log(Status.PASS, "spicejet website link validation Successfull");
	} catch (Exception e) {
		test.log(Status.FAIL, "spicejet website link validation Failed");
		e.printStackTrace();
	}
}

public void signIn() throws Throwable {
	
	eleClick(loginbutton);
	
	explicitWaitMethod(emailbutton,9);
	eleClick(emailbutton);
	
	eleClick(emailtextbox);
	sendKeysMethod(emailtextbox,readProperty("email"));

	eleClick(passwordtextbox);
	sendKeysMethod(passwordtextbox,readProperty("password"));
	
	eleClick(loginbox);
		
}



public void signUp() throws Throwable {
	
	try {
		explicitWaitMethod(signup,15);
		eleClick(signup);
		
		windowHandle(signup);
			
		eleClick(dropdowninsignupfortitle);
		explicitWaitMethod(dropdowninsignupfortitle,15);
		dropDownMethodWithValue(dropdowninsignupfortitle,"MR");
		
		eleClick(firstname);
		clearMethod(firstname);
		sendKeysMethod(firstname,(readProperty("firstname")));
		
		eleClick(lastname);
		clearMethod(lastname);
		sendKeysMethod(lastname,(readProperty("lastname")));
		
		eleClick(country);
		explicitWaitMethod(country,15);
		dropDownMethodWithValue(country,"IN");
		
		eleClick(dateofbirth);
		
		eleClick(drop_down_year_in_dateofbirth);
		explicitWaitMethod(drop_down_year_in_dateofbirth,15);
		dropDownMethodWithValue(drop_down_year_in_dateofbirth,"1995");
		
		eleClick(drop_down_month_in_dateofbirth);
		explicitWaitMethod(drop_down_month_in_dateofbirth,15);
		dropDownMethodWithValue(drop_down_month_in_dateofbirth,"7");
		explicitWaitMethod(drop_down_month_in_dateofbirth,15);
		
		eleClick(drop_down_date_in_dateofbirth);
		
		pageScrollDownWithJavaScript();
		
		
//		explicitWaitMethod(phonenumber,15);
//		eleClick(phonenumber);
		
//		sikuliClickMethodForPhoneNumberTextBoxInSignUp();
//		javaScriptClickMethods(phonenumber);
//		sendKeysMethod(phonenumber,(readProperty("phonenumber")));
//		sendKeysMethod(phonenumber,"9626395591");
		
		
//		javaScriptClickMethods(email);
		
//		explicitWaitMethod(email,15);
//		eleClick(email);
//		explicitWaitMethod(email,15);
		
//		sikuliClickMethodForEmailTextBoxInSignUp();
//		sendKeysMethod(email,(readProperty("email")));

//		sendKeysMethod(email,"tisik2535@peogi.com");
		
		pageScrollDownWithJavaScript();
		
		eleClick(password);
//		sikuliClickMethodForPasswordInSignUp();
//		explicitWaitMethod(password,15);
//		javaScriptClickMethods(password);
//		sendKeysMethod3();
		sendKeysMethod(password,(readProperty("password")));
		
//		eleClick(confirmpassword);
//		javaScriptClickMethods(confirmpassword);
//		sendKeysMethod(confirmpassword,(readProperty("confirmpassword")));
//		
		eleClick(checkboxinsignup);

		
		
		eleClick(submitinsignup);
		
		test.addScreenCaptureFromPath(getScreenShot("signUp"));
		test.log(Status.PASS, "Signup Successfull");
		
	} catch (Exception e) {
		test.log(Status.FAIL, "Signup Failed");
		e.printStackTrace();
	}
	
}


public void signInWithSignOut() {
    eleClick(loginbutton);
	
	explicitWaitMethod(emailbutton,9);
	eleClick(emailbutton);
	
	eleClick(emailtextbox);
	sendKeysMethod(emailtextbox,readProperty("email"));

	eleClick(passwordtextbox);
	sendKeysMethod(passwordtextbox,readProperty("password"));
	
	eleClick(loginbox);
	
	//sikuliClickMethodForLoginButton();
	
	explicitWaitMethod(usernameaftersignin,9);
	eleClick(usernameaftersignin);
	
	explicitWaitMethod(logout,9);
	eleClick(logout);
	
	//sikuliClickMethodForLogout();
}




public void roundTripOption() {
	
	eleClick(roundtripbutton);
	
	eleClick(frombutton);
	sendKeysMethod(frombutton,"DEL");
	
//	explicitWaitMethod(internationalbutton,15);
//	eleClick(internationalbutton);
//	explicitWaitMethod(bangkok,15);
//	eleClick(bangkok);
	
//	explicitWaitMethod(to,15);
//	sendKeysMethod(to,"BKK");
	
	actionMethod();
	
	//eleClick(tobutton);
	//sendKeysMethod(tobutton,"bkk");
		
	eleClick(depaturedate);
	
	eleClick(returndate);
	
	eleClick(searchflight);
	
}


public void oneWayTripOption() {
	
	eleClick(frombutton);
	sendKeysMethod(frombutton,"blr");
	
	
	//eleClick(tobutton);
	//sendKeysMethod(tobutton,"blr");
		
	
}




	
}






















