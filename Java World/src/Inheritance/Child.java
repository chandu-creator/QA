package Inheritance;

public class Child extends Parent{
	
	public static void main(String[] args) {
		Parent c1 = new Child();
		
		
		
	}

	@Override
	public void engineStart(int cyl) {
		// TODO Auto-generated method stub
		super.engineStart(cyl);
	}

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		super.increaseSpeed();
	}

	
	public void Speedbreaker() {
		// TODO Auto-generated method stub
		super.staticExample();
	
	}
}
	
	
	
