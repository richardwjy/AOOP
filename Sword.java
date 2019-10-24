
public class Sword implements Weapons{
	
	public Sword(){}
	
//	public Sword(String type,int damage){
//		super(type,damage);
//	}
	
	public void hit() {
		// TODO Auto-generated method stub
//		System.out.println("Sword is making "+this.getDamage()+" amount of damage");
		System.out.println("Swing the sword!");
	}
	
	public void doSth(){
		this.hit();
	}
}
