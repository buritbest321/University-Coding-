package step4_super_method;

public class Food {
	public String name;		
	private int level;		
	
	Food(String name, int level){
		this.name = name;
		this.level = level;
	}
	
	void printInfo(){
		System.out.println(
				name + ": " + level);
	}
	
	int getLevel(){
		return level;
	}
}

