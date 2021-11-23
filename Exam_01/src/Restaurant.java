import java.util.ArrayList;

public class Restaurant extends Company {

	//================================================Properties

	private ArrayList<Menu> menus = new ArrayList<Menu>();

	//================================================Constructors

	public Restaurant(String line) {
		this(line.split("\t"));
	}

	public Restaurant(String[] parts) {
		this(Integer.parseInt(parts[0]), parts[1], parts[2]);
	}

	public Restaurant(int companyID, String companyName, String ownerName) {
		super(companyID, companyName, ownerName);
		setMenus(menus);
	}

	public Restaurant(Restaurant r) {
		this(r.getCompanyID(), r.getCompanyName(), r.getOwnerName());
	}


	//================================================Methods


	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Restaurant)) return false;
		Restaurant r = (Restaurant)o;
		return super.equals(r) &&
				r.menus.equals(menus);
	}

	public void addMenu(Menu m) {
		menus.add(m);
	}


	@Override
	public String toString() {
		return super.toString() + String.format("%s", menus);
	}

	//================================================Getters/Setters

	public void setMenus(ArrayList<Menu> menus) {this.menus = menus;}

	public ArrayList<Menu> getMenus() {return menus;}
}