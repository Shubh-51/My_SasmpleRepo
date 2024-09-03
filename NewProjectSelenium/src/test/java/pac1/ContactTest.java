package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		System.out.println("CreateContact");
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	public void modifyContactTest() {
		System.out.println("modifyContact");
	}
	@Test
	public void deleteContactTest() {
		System.out.println("deleteContact");
	}
	@Test
	public void createContactWithOrgTest() {
		System.out.println("contact is created with org");
	}
}
