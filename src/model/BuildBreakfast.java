/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Jan 15, 2023
 */
package model;

public class BuildBreakfast {
	
	//breakfast tator tots for Julie and Carl are defined, everyone else is 0
	public int determineNumOfTatorTots(Breakfast breakfast) {
		int numOfTatorTots = 0;
	
		if (breakfast.getFoodieName() == "Julie") {
			numOfTatorTots = 3;
		} else if (breakfast.getFoodieName() == "Carl") {
			numOfTatorTots = 16;
		} else if (breakfast.getFoodieName() == "Mckenzie") {
			numOfTatorTots = 5;
		}
		
		return numOfTatorTots;
	}
	
	
	//breakfast meat for Saturday and Sunday are defined, the rest is null
	public String determineMeat(Breakfast breakfast) {
		String meat = null;
		
		if (breakfast.getDayOfWeek() == "Saturday") {
			meat = "Meatballs";
		} else if (breakfast.getDayOfWeek() == "Sunday") {
			meat = "Turkey Sausage Patties";
		}
		
		return meat;
	}
	
	//breakfast topping for Julie and Carl are defined, everyone else is null
	public String determineTopping(Breakfast breakfast) {
		String topping = null;
	
		if (breakfast.getFoodieName() == "Julie") {
			topping = "Medium Salsa";
		} else if (breakfast.getFoodieName() == "Carl") {
			topping = "Mild Sauce";
		}
		
		return topping;
	}
}
