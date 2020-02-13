package production;

import java.util.Scanner;

public class IncomeTax implements Space{
	
	String Name;

	public void setName(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void collectTheMonies(Player player){
		
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Pay $200 or 10%?");

	    String choice = myObj.nextLine();
	    int ammountToBeDeducted = Integer.parseInt(choice);
		
		if(ammountToBeDeducted==200){
			player.setMoney(player.getMoney()-200);
			System.out.println("$200 have been deducted from your account.");
			
		}else if(ammountToBeDeducted==10){
			int percent = (int)(player.getMoney()*.10);
			player.setMoney(player.getMoney()-percent);
			System.out.println("10% has been decucted from your account.");
		}
		
		myObj.close();
	}
}
