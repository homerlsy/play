package sanyi;

import file.DirectoryLister;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Path("resource")
public class App {

	private DirectoryLister directoryLister = new DirectoryLister();

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test() throws IOException {
		Map<String, String> names = directoryLister.getContents("/Users/homer");
		return names.values().stream().reduce("",(a,b)->a+b + "\n");
	}

}
