
public class Axe extends Weapon implements Weapons{

	public Axe(){
		super(100);
	}
	
	@Override
	public void hit() {
		// TODO Auto-generated method stub
		System.out.println("Chop that thing! Dealed "+this.getDamage()+"!!! SUPER effective!!!");
	}
	
	public void doSth(){
		this.hit();
	}
	
}
