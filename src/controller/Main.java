package controller;

import ui.IUI;
import ui.TUI;

public class Main {
	public static void main(String[] args) {
		IUI ui = new TUI();
		Controller ctrl = new Controller(ui);
		
		ctrl.start();
	}
}
