package examples;

import java.util.Date;
import org.apache.click.Page;

public class HelloWorld extends Page {
	private Date time = new Date();

	public HelloWorld() {
		addModel("time", time);
	}
}