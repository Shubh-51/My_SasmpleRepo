package pac2;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test
	public void createOrgTest() {
		System.out.println("CreateOrg");
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
	public void modifyOrgTest() {
		System.out.println("modifyOrg");
	}
	@Test
	public void deleteOrgTest() {
		System.out.println("deleteOrg");
	}

}
