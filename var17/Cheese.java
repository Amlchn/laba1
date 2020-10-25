package bsu.rfe.java.group9.lab1.molchanov.var17;

public class Cheese extends Food implements Consumable {

	public Cheese() {
		super("сыр");
		

	}
	

	public void consume() {
		System.out.println( this + " съеден");

	}
	public int calculateCalories() {
		return 300;
	}

}
