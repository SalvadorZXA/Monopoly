package production;

import java.util.List;
import java.util.Scanner;

public class IncomeTax implements Space{
	
	String Name;
	List<Player> Players;

	public void setName(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setPlayers(List<Player> players) {
		Players = players;		
	}

	public List<Player> getPlayers() {
		return Players;
	}

	public void collectTheMonies(String playerName){
		
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Pay $200 or 10%?");

	    String choice = myObj.nextLine();
		
		for(Player p : Players){
			
			if(p.getToken().equals(playerName)){
				
				if(choice=="200"){
					p.setMoney(p.getMoney()-200);
					System.out.print("$200 have been deducted from your account.");
					
				}else if(choice=="10%"){
					int percent = (int)(p.getMoney()*.10);
					p.setMoney(p.getMoney()-percent);
					System.out.print("10% has been decucted from your account.");
				}
			}
		}
		myObj.close();
	}
}
