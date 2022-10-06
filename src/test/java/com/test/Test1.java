package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page_object.Login_pom;
import com.utility.BaseClass;
import com.utility.Library;

public class Test1 extends BaseClass{
	
	@Test
	public void test_01() {
		
		Login_pom login=PageFactory.initElements(driver,Login_pom.class );
		
		Library.custom_sendkeys(login.getEmail(),excel.getstringdata("Sheet1", 0, 0),"EmailId");
		
		Library.custom_sendkeys(login.getPassword(), excel.getstringdata("Sheet1", 0, 1),"Password");
		
		Library.custom_click(login.getLogin_btn(),"login");

		Library.custom_HandleDropDrown(null, null);
		Library.custom_HandleMouseHover_click(null, null);
		
	
	}

}
