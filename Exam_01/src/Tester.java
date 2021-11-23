import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	static ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
	static ArrayList<Menu> menus = new ArrayList<Menu>();
	static ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

	public static void main(String[] args) {

		loadData();
		printReport();
	}

	private static void printReport() {
		System.out.println("\n==================================== ");
		for(Restaurant r : restaurants)

			System.out.println(r);
		System.out.println("\n====================================");
		for(Menu m : menus)
			System.out.println(m);
		System.out.println("\n====================================");
		for(MenuItem mi : menuItems)
			System.out.println(mi);
	}

	private static void loadData() {

		Scanner fin = null;

		try {

			fin = new Scanner(new File("restaurants.txt"));
			fin.nextLine();

			while(fin.hasNextLine()) {

				restaurants.add(new Restaurant(fin.nextLine()));

			}

			fin.close();

			fin = new Scanner(new File("menus.txt"));
			fin.nextLine();

			while(fin.hasNextLine()) {

				menus.add(new Menu(fin.nextLine()));

			}


			fin.close();

			fin = new Scanner(new File("menuItems.txt"));
			fin.nextLine();

			while(fin.hasNextLine()) {

				menuItems.add(new MenuItem(fin.nextLine()));
			}

		}

		catch (Exception e) {
			System.out.println(e.getMessage());		
		} finally {
			try { fin.close(); } catch (Exception e) {}
		}

	}

}
