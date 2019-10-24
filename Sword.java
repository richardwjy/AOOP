
public class Sword extends Weapon implements Weapons{
	
	public Sword(){
		super(70);
	}
	
//	public Sword(String type,int damage){
//		super(type,damage);
//	}
	
	public void hit() {
		// TODO Auto-generated method stub
//		System.out.println("Sword is making "+this.getDamage()+" amount of damage");
		System.out.println("Swing the sword! Dealed "+this.getDamage()+"!! VERY effective");
	}
	
	public void doSth(){
		this.hit();
	}
}
