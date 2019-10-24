
public abstract class Weapon {

	private int damage;
	
	public Weapon(){}
	public Weapon(int damage){
		super();
		this.damage=damage;
	}
	
	
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	
}
