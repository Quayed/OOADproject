package test;

import org.junit.Test;

import controller.Controller;
import ui.IUI;
import ui.TestUI;

public class TestController {

	@Test
	public void test() {
		IUI ui = new TestUI();
		Controller ctrl = new Controller(ui);
		
		ctrl.start();
		
	}

}
