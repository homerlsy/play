package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


public class DirectoryLister {

	public Map<String, String> getContents(String path) throws IOException {
		final Map<String, String> result = new HashMap<>();
		Files.list(Paths.get(path)).forEach(item -> result.put(item.getFileName().toString(),
				item.toAbsolutePath().toString()));
		return result;
	}

}
