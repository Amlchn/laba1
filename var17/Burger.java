package bsu.rfe.java.group9.lab1.molchanov.var17;

public class Burger extends Food implements Consumable{
	private String size;
	
	 public Burger(String size) {
		 super("бургер");
		 this.size=size;
	 }


	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	public void consume() {
		System.out.println(this + " съедено");

	}
	public int calculateCalories() {
		if (this.size.equals("BIG")) {
		return 700; }
		else 
			if(this.size.equals("MEDIUM")) {
				return 500;}
			else {return 350;
			}
			}
		
	public String toString() {
		return super.toString() + " размера " + size.toUpperCase() + " ";
		
	}
	 public boolean equals(Object arg1) {
		 if (super.equals(arg1)) {
			 if (!(arg1 instanceof Burger)) return false; 
			 return size.equals(((Burger)arg1).size);
		 } else
		 return false;
		 }
	

	}


