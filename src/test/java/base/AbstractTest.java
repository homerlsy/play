package base;


import com.google.inject.Guice;
import com.google.inject.Injector;
import ico.TestModule;

public class AbstractTest {
	protected Injector injector;
	@org.junit.Before
	public void setUp() throws Exception {
		injector = Guice.createInjector(new TestModule());
		injector.injectMembers(this);

	}
}
