package ioc;

import com.google.inject.AbstractModule;
import file.DefaultDirectoryService;
import file.DirectoryService;


public class FileModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(DirectoryService.class).to(DefaultDirectoryService.class);
	}
}
