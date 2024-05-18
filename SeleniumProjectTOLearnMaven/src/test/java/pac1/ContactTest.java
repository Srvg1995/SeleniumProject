package pac1;

import org.testng.annotations.Test;

public class ContactTest {


	@Test
	public void createContactTest() {
		System.out.println("execute createContactTest");
		String BROWSER = System.getProperty("browser","chrome"); //Here "chrome" is mentioned,bcz if you forgot to pass the command through CMD line also ,it will take "chrome" as a browser.Similarly,we can pass other credentials also(like,URL,UN,PW)inside this program only by putting comma after the credentials. 
		String URL = System.getProperty("url");
		String UN = System.getProperty("username");
		String PW = System.getProperty("password");

		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PW);
		
	}

	@Test
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}
}



