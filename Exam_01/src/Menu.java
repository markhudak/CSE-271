import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Menu {
	//================================================Properties

	private int menuID, restaurantID;
	private String meal;
	private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

	//================================================Constructors

	public Menu(String line) {
		this(line.split("\t"));
	}

	public Menu(String[] parts) {
		this(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), parts[2]);
	}

	public Menu(int menuID, int restaurantID, String meal) {
		super();
		setMenuID(menuID);
		setRestaurantID(restaurantID);
		setMeal(meal);
		setMenuItems(menuItems);
	}

	public Menu(Menu m) {
		this(m.getMenuID(), m.getRestaurantID(), m.getMeal());
	}

	//================================================Methods

	@Override
	protected Menu clone() {
		return new Menu(this);
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Menu)) return false;
		Menu m = (Menu)o;
		return (m.menuID == menuID &&
				m.restaurantID == restaurantID &&
				m.meal.equals(meal) &&
				m.menuItems.equals(menuItems));
	}

	public void addMenuItem(MenuItem mi) {
		menuItems.add(mi);
	}


	@Override
	public String toString() {
		return String.format("%-10d %-5s %-20s %-20s",  menuID, restaurantID, meal, menuItems);
	}


	//================================================Getters/Setters

	public void setMenuID(int menuID) {
		if(menuID < 1) throw new InvalidParameterException("Menu ID (" + menuID + ") invalid");
		this.menuID = menuID;
	}
	public void setRestaurantID(int restaurantID) {
		if(restaurantID < 1) throw new InvalidParameterException("Restaurant ID (" + restaurantID + ") invalid");
		this.restaurantID = restaurantID;
	}
	public void setMeal(String meal) {this.meal = meal;}
	public void setMenuItems(ArrayList<MenuItem> menuItems) {this.menuItems = menuItems;}

	public int getMenuID() {return menuID;}
	public int getRestaurantID() {return restaurantID;}
	public String getMeal() {return meal;}
	public ArrayList<MenuItem> getMenuItems() {return menuItems;}
}
