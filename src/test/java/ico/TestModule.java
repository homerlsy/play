package ico;

import com.google.inject.AbstractModule;
import ioc.FileModule;

public class TestModule extends AbstractModule {
	@Override
	protected void configure() {
		install(new FileModule());
	}
}
