package file;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultDirectoryService implements DirectoryService{

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultDirectoryService.class);

	@Override
	public List<String> listFiles(String url) {
		Path path = Paths.get(url);
		try {
			return Files.list(path).filter(item-> !Files.isDirectory(item))
					.map(item -> path.getFileName().toString()).collect(Collectors.toList());
		} catch (IOException e) {
			LOGGER.error("wrong path [{}]",url,e);
			return Lists.newArrayList();
		}
	}
}
