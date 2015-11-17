package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import logic.logic.BillItem;
import ui.IUI;
import ui.TUI;

public class TestTUI {

	@Test
	public void test() {
		IUI ui = new TUI();
		
		List<BillItem> billItems = new ArrayList<BillItem>();
		billItems.add(new BillItem("Test post", 2, 220.95));
		billItems.add(new BillItem("Test post2", 1, 52.95));
		billItems.add(new BillItem("Test post3", 7, 12.95));
		billItems.add(new BillItem("Test post4", 3, 83.95));
		
		ui.showBill(null, billItems);
	}

}
