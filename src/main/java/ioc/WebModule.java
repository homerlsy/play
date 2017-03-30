package ioc;

import com.google.inject.servlet.ServletModule;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class WebModule extends ServletModule {

	@Override
	protected void configureServlets() {
		serve("/test").with(new HttpServlet() {
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				System.out.println("---------");
			}
		});
	}
}
