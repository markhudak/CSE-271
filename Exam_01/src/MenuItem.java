import java.security.InvalidParameterException;

public class MenuItem {

	//================================================Properties

	private int menuItemID, menuID;
	private String name;


	//================================================Constructors

	public MenuItem(String line) {
		this(line.split("\t"));
	}

	public MenuItem(String[] parts) {
		this(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), parts[2]);
	}

	public MenuItem(int menuItemID, int menuID, String name) {
		super();
		setMenuItemID(menuItemID);
		setMenuID(menuID);
		setName(name);
	}

	public MenuItem(MenuItem mi) {
		this(mi.getMenuItemID(), mi.getMenuID(), mi.getName());
	}

	//================================================Methods


	@Override
	protected MenuItem clone() {
		return new MenuItem(this);
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof MenuItem)) return false;
		return (((MenuItem)o).menuItemID == menuItemID &&
				((MenuItem)o).menuID == menuID &&
				((MenuItem)o).name.equals(name));
	}

	@Override
	public String toString() {
		return String.format("%-10d %-5d %-20s",  menuItemID, menuID, name);
	}

	//================================================Getters/Setters

	public void setMenuItemID(int menuItemID) {
		if(menuItemID < 1) throw new InvalidParameterException("Menu Item ID (" + menuItemID + ") invalid");
		this.menuItemID = menuItemID;
	}
	public void setMenuID(int menuID) {
		if(menuID < 1) throw new InvalidParameterException("Menu ID (" + menuID + ") invalid");
		this.menuID = menuID;
	}
	public void setName(String name) {this.name = name;}

	public int getMenuItemID() {return menuItemID;}
	public int getMenuID() {return menuID;}
	public String getName() {return name;}

}
