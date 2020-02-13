package production;

import java.util.List;

public interface Space {
	
	void setName(String name);
	String getName();
	void setPlayers(List<Player> players);
	List<Player> getPlayers();
}
