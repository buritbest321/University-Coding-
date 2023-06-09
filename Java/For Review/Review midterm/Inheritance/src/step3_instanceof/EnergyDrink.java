package step3_instanceof;

//EnergyDrink is a subclass, and Food is a superclass
public class EnergyDrink extends Food{
	private int power; 
	
	EnergyDrink(String name, int level, int power){
		// call constructor method of the superclass
		super(name, level);	
		
		// assign a input value to a new variable (power) 
		this.power = power;
	}
	
	// override method
	void printInfo(){
		System.out.println(
				super.name + ": " + getLevel() + ", power: " + power);
	}
		
	// new method (doesn't have this in Food)
	int getPower(){
		return power;
	}
}
