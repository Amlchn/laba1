package bsu.rfe.java.group9.lab1.molchanov.var17;

public class mainApplication {
 
	public static void main(String[] args) {
		int i1=0;
		int i2=0;
		int i3=0;
		int smallApple=0;
		int bigApple=0;
		int smallBurger=0;
		int mediumBurger=0;
		int bigBurger=0;
		int calories=-1;
		
		Food [] breakfast = new Food [20];
		int ItemsSoFar=0;
		for (String arg: args) {
			if(arg.startsWith("-")) {
				if (arg.equals("-calories")) {
					calories=0;
					} 
					
			}
			String[] parts = arg.split("/");
			if (parts[0].equals("Cheese")) { 
				breakfast[ItemsSoFar] = new Cheese(); i1++;}
			else
			if (parts[0].equals("Apple")) {
			breakfast[ItemsSoFar] = new Apple(parts[1]); 
			if(parts[1].equals("BIG")) { bigApple++;
				
			 }
			if(parts[1].equals("SMALL")) { smallApple++;
			
			 }
			  i2++;
			   } else
				if (parts[0].equals("Burger")) {
					breakfast[ItemsSoFar] = new Burger(parts[1]);
					if(parts[1].equals("BIG")) { bigBurger++;
					
					 }
					if(parts[1].equals("SMALL")) { smallBurger++;
					
					 }
					if(parts[1].equals("MEDIUM")) { mediumBurger++;
					
					 }
					i3++;}
				
			ItemsSoFar++;
		
	}
		
		for (Food item: breakfast) {
			
		
		if (item!=null) {
		item.consume();
		if(calories>=0) {
			calories+=item.calculateCalories();
		}
		}
		else  
			continue;
		}
		System.out.println("количество сыра: " + i1 + "; количество яблок: "+ i2 + "; количество бургеров: " + i3 + ".");
		System.out.println("количество больших бургеров: " + bigBurger);
		System.out.println("количество маленьких бургеров: " + smallBurger);
		System.out.println("количество средних бургеров: " + mediumBurger);
		System.out.println("количество маленьких яблок: " + smallApple);
		System.out.println("количество больших яблок: " + bigApple);
		System.out.println("калорийность завтрака: "+ calories);
		System.out.println("всего хорошего!");
	
	
	
	}
	
	
}
