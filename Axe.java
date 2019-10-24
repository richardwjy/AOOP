
public class Axe implements Weapons{

	public Axe(){}
	
	@Override
	public void hit() {
		// TODO Auto-generated method stub
		System.out.println("Chop that thing!");
	}
	
	public void doSth(){
		this.hit();
	}
	
}
