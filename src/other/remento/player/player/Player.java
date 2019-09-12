package other.remento.player.player;

public class Player {

	private int hp;
	private int mp;

	public Player(int hp, int mp) {
		this.hp = hp;
		this.mp = mp;
	}
	
	public PlayerRemento save () {
		return new PlayerRemento(hp, mp);
	}
	
	public void restore(PlayerRemento rememto) {
		this.hp = rememto.getHp();
		this.mp = rememto.getMp();
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public void play() {
		System.out.println(hp);
		System.out.println(mp);
	}
}
