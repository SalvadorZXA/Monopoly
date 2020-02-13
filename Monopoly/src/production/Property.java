package production;

import java.awt.Color;

public class Property implements Space{
	
	String Name;
	String Owner;
	Color Color;
	int Cost;

	public void setName(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
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
