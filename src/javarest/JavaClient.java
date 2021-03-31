package javarest;

import java.net.URL;
import java.net.URLConnection;

public class JavaClient {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8080/javarest/rest/test2");

		URLConnection urlcon = url.openConnection();

		urlcon.getInputStream();
	}
}
