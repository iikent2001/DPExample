package other.remento.player;

import other.remento.player.player.Player;
import other.remento.player.player.PlayerCareTaker;

public class PlayerTester {

	public static void main(String... a){
		PlayerCareTaker careTaker = new PlayerCareTaker();
		Player player = new Player(100,100);
		player.play();
		player.setHp(20);
		player.setMp(20);
		player.play();
		careTaker.setRemento(player.save());
		player.setHp(0);
		player.setMp(0);
		player.play();
		player.restore(careTaker.getRemento());
		player.play();
	}
	
}
