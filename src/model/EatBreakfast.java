/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Jan 15, 2023
 */
package model;

public class EatBreakfast {
		
	// Only Mckenzie doesn't watch tv, the rest do; based on the day of the week.
	public String determineShowToWatch(Breakfast breakfast) {
		String show = null;
		
		if (breakfast.getFoodieName() == "Mckenzie") {
			show = null;
		} else {
			if (breakfast.getDayOfWeek() == "Saturday") {
				show = "Wednesday";
			} else if (breakfast.getDayOfWeek() == "Sunday") {
				show = "The Crown";
			} else {
				show = "Call the Midwife";
			}
		}
		
		return show;
		
	}
}
