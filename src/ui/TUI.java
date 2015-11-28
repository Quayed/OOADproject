package ui;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import dal.dto.CustomerDTO;
import dal.dto.ReservationDTO;
import logic.logic.BillItem;

public class TUI implements IUI{

	Scanner in = new Scanner(System.in);
	PrintStream out = System.out;
	
	Map<Integer, String> screens = new HashMap<Integer, String>();
	
	public TUI() {
		screens.put(1, "Create Customer");
		screens.put(2, "Create Reservation");
		screens.put(3, "Create Get Reservation Bill");
	}
	
	@Override
	public int selectScreen() {
		int screen = 0;
		while(screen == 0){
			out.println("Select screen:");
			for (Iterator<Integer> iterator = screens.keySet().iterator(); iterator.hasNext();) {
				int key = (int) iterator.next();
				out.println(key+": "+screens.get(key));
			}
			String number = in.nextLine();
			if(number.equals("e") || number.equals("E")){
				return 0;
			}
			try {
				screen = Integer.parseInt(number);
			} catch (NumberFormatException e) {
				screen = 0;
			}
			
			if(screens.get(screen) == null){
				screen = 0;
			}
			
			if(screen == 0)
				out.println("Wrong input!");
			
		}
		return screen;
	}

	@Override
	public CustomerDTO createCustomer() {
		out.println("## CREATE CUSTOMER ##");
		out.println("Enter name");
		String name = in.nextLine();
		out.println("Enter phone");
		String phone = in.nextLine();
		return new CustomerDTO(name, phone);
	}

	@Override
	public void customerCreated(int customerId) {
		out.println("Customer created and has been awarded with customerId "+customerId);
	}
	
	@Override
	public ReservationDTO createReservation() {
		out.println("## CREATE RESERVATION ##");
		out.println("Enter Pitch ID");
		int pitchId = getInt();
		out.println("Enter Customer ID");
		int customerId = getInt();
		out.println("Enter arrival date");
		String arrival = getString();
		out.println("Enter departure date");
		String departure = getString();
		out.println("Enter number of adults");
		int adults = getInt();
		out.println("Enter number of children");
		int children = getInt();
		out.println("Enter number of dogs+cats");
		int dogs = getInt();
		return new ReservationDTO(customerId, pitchId, adults, children, dogs,  arrival, departure);
	}
	
	@Override
	public void reservationCreated(int reservationId){
		out.println("Reservation created and has been awarded with reservationId "+reservationId);
	}

	@Override
	public int getReservationBill() {
		int reservationId = 0;
		out.println("## GET RESERVATION BILL ##");
		out.println("Enter Reservation Id");
		String number = in.nextLine();
		
		while(reservationId == 0){
			try {
				reservationId = Integer.parseInt(number);
			} catch (NumberFormatException e) {
				reservationId = 0;
			}
			
			if(reservationId == 0)
				out.println("Wrong input!");
			
		}
		return reservationId;
	}
	
	@Override
	public void showBill(ReservationDTO reservation, List<BillItem> billItems) {
		double total = 0;
		DecimalFormat df = new DecimalFormat("0.00");  
		DecimalFormat dfUnit = new DecimalFormat("0.0");  

		out.println("Item\t\tAmount\t\tCount\tPrice");

		out.println("-----------------------------------------------");

		for (int b = 0; b < billItems.size(); b++) {
			BillItem bill = billItems.get(b);
			total += bill.getSumPrice();
			out.println(bill.getTitle()+(bill.getTitle().length()<8?"\t":"")+"\t"+df.format(bill.getUnitPrice())+"\t\t"+dfUnit.format(bill.getUnits())+"\t"+df.format(bill.getSumPrice()));
			
		}
		out.println("-----------------------------------------------");
		    
		out.println("Total\t\t\t\t\t"+df.format(total));
		out.println("-----------------------------------------------");
		out.println("-----------------------------------------------");
		out.println("");
		out.println("");

		
	}

	private String getString(){
		return in.nextLine();
	}
	
	private int getInt(){
		int number;
		while(true){
			try {
				number = Integer.parseInt(getString());
				break;
			} catch (NumberFormatException e) {
				out.println("not a number");
			}
		}
		return number;
	}

}
