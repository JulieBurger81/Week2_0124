/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Jan 15, 2023
 */
package model;

public class Breakfast {
	private String dayOfWeek;
	private String foodieName;
	private String foodName;
	/**
	 * 
	 */
	public Breakfast() {
		super();
	}
	/**
	 * @param dayOfWeek
	 * @param foodieName
	 */
	public Breakfast(String dayOfWeek, String foodieName) {
		super();
		setDayOfWeek(dayOfWeek);
		setFoodieName(foodieName);
		if((dayOfWeek == "Saturday") || dayOfWeek == "Sunday") {
			setFoodName("Fancy Scrambled Eggs");
		} else {
			setFoodName("Peanut Butter Nutella Wafffles");
		}
	}
	/**
	 * @return the dayOfWeek
	 */
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	/**
	 * @param dayOfWeek the dayOfWeek to set
	 */
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	/**
	 * @return the foodieName
	 */
	public String getFoodieName() {
		return foodieName;
	}
	/**
	 * @param foodie the foodieName to set
	 */
	public void setFoodieName(String foodieName) {
		this.foodieName = foodieName;
	}
	/**
	 * @return the foodName
	 */
	public String getFoodName() {
		return foodName;
	}
	/**
	 * @param foodName the foodName to set
	 */
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	@Override
	public String toString() {
		return "Breakfast [dayOfWeek=" + dayOfWeek + ", foodieName=" + foodieName + ", foodName=" + foodName + "]";
	}
}
