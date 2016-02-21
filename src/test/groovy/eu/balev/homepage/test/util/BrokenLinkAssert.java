package eu.balev.homepage.test.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Assert;

/**
 * A very simple check for broken links.
 */
public class BrokenLinkAssert {

	public void assertLinks(List<String> links) {
		links.forEach(BrokenLinkAssert::testLink);
	}

	private static void testLink(String link) {
		HttpURLConnection conn = null;

		try {
			//test if all links open fine, no redirects etc.
			URL url = new URL(link);
			conn = (HttpURLConnection) url.openConnection();
			conn.addRequestProperty("User-Agent", "Gebish broken links checker");
			conn.setConnectTimeout(5000);
			conn.connect();
			int code = conn.getResponseCode();
			Assert.assertEquals("Link " + link, 200, code);
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		} finally {
			if (conn != null)
				conn.disconnect();
		}
	}
}