package ioc;

import com.google.inject.AbstractModule;

public class MainModule extends AbstractModule {
	@Override
	protected void configure() {
		install(new WebModule());
		install(new FileModule());
	}
}
