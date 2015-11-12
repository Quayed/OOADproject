package ui;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

import logic.logic.BillItem;
import dal.dto.CustomerDTO;
import dal.dto.ReservationDTO;

public class TUI implements IUI{

	Scanner in = new Scanner(System.in);
	PrintStream out = System.out;
	
	@Override
	public int selectScreen() {
		int screen = 0;
		while(screen == 0){
			out.println("Select screen:");
			out.println("1: Create Reservation");
			String number = in.nextLine();
			if(number.equals("e") || number.equals("E")){
				return 0;
			}
			try {
				screen = Integer.parseInt(number);
			} catch (NumberFormatException e) {
				screen = 0;
			}
			
			if(screen == 1){
				
			}
			else{
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showBill(ReservationDTO reservation, List<BillItem> billItems) {
		// TODO Auto-generated method stub
		
	}

}
