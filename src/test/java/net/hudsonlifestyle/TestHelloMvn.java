package net.hudsonlifestyle;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestHelloMvn {

	@Test
	public void testMain() throws Exception {
		ByteArrayOutputStream capture = new ByteArrayOutputStream();
		PrintStream newOut = new PrintStream(capture);
		System.setOut(newOut);
		HelloMvn.main(null);
		assertTrue(capture.toString().contains("Hello Maven!"));
	}
}
