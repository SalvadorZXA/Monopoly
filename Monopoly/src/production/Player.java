package production;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Player {

	private Integer money;
	private String currentToken;
	private Integer currentSpace;
	// private Space[] propertiesOwned;
	private final String[] ALLTOKENS = { "Battleship", "Boot", "Cannon",
	"Horse and rider", "Iron", "Racecar", "Dog", "Thimble", "Top hat",
	"Wheelbarrow" };
	private ArrayList<String> availableTokens;
	
	public Player() {
	availableTokens = new ArrayList<String>(Arrays.asList(ALLTOKENS));
	}
	
	public Integer getMoney() {
	return money;
	}
	
	public void setMoney(Integer money) {
	this.money = money;
	}
	
	public String getToken() {
	return currentToken;
	}
	
	public void setToken(String token) {
	this.currentToken = token;
	}
	
	public Integer getCurrentSpace() {
	return currentSpace;
	}
	
	public void setCurrentSpace(Integer currentSpace) {
	this.currentSpace = currentSpace;
	}
	
	public void chooseToken() {
	Scanner userInputScanner = new Scanner(System.in);
	String selection;
	
	System.out.println("Available Token List:");
	System.out.println(availableTokens);
	
	System.out.print("\nSelection: ");
	selection = userInputScanner.nextLine().trim();
	
	setToken(selection);
	
	userInputScanner.close();
	}
	
	public boolean checkIfTokenSelectionIsValid(String tokenSelection){
	
	for (String s : availableTokens) {
	if (s.equalsIgnoreCase(tokenSelection)) {
	return true;
	}
	}
	
	return false;
	}

}