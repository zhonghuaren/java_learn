package playgame;
import java.util.ArrayList;
import java.util.List;

/**
 * 玩家类需要具备的属性
 * 1.玩家ID
 * 2.玩家姓名
 * 3.玩家所持有的手牌
 * @author huasir
 *
 */

public class Player {
	private String ID;
	private String name;
	public List<Poker> playerPoker;
	
	public Player(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public Player() {
		this.playerPoker = new ArrayList<Poker>();
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
