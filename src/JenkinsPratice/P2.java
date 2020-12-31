package JenkinsPratice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P2
{
	@Test
	public void tc_02() 
	{
		Reporter.log("Jenkins Failed Test Casel",true);
		Assert.fail();
	}

}