package api.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import api.tests.products.ProductsSuggestTest;
import api.tests.products.ProductsTest;
import api.tests.tags.TagsTest;
import api.utils.AuthUtil;
import api.utils.SessionId;

@RunWith(Suite.class)
@SuiteClasses({
	// products
	ProductsSuggestTest.class,
	ProductsTest.class,
	
	// tags
	TagsTest.class,
})
public class ApiTestSuite {
	@BeforeClass
	public static void before() {
		SessionId.abcUser = AuthUtil.login();
	}
	
	@AfterClass
	public static void after() {
		AuthUtil.logout(SessionId.abcUser);
	}
}
