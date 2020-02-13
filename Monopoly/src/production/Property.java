package production;

import java.awt.Color;
import java.util.List;

public class Property implements Space{
	
	String Name;
	List<Player> Players;
	String Owner;
	Color Color;
	int Cost;

	public void setName(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}
	
	public void setPlayers(List<Player> players){
		Players = players;
	}
	
	public List<Player> getPlayers(){
		return Players;
	}

	public void setColor(Color color){
		Color = color;
	}
	
	public Color getColor(){
		return Color;
	}
	
	public void setCost(int cost){
		Cost = cost;
	}
	
	public int getCost(){
		return Cost;
	}
}
