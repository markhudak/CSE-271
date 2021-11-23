
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	
	static ArrayList<Player> players = new ArrayList<Player>();
	static ArrayList<Dealer> dealers = new ArrayList<Dealer>();

	public static void main(String[] args) {

		loadData();
		printReport();
	}

	private static void printReport() {
		
		System.out.println("\n==================================== Players");
		for(Player p : players)
			System.out.println(p);
		System.out.println("\n==================================== Dealers");
		for(Dealer d : dealers)
			System.out.println(d);
		
	}
	
	private static void loadData() {

		Scanner fin = null;
		
		try {
			
			fin = new Scanner(new File("People.txt"));
			fin.nextLine();
			
			while(fin.hasNextLine()) {
				
				String s = fin.nextLine();
				if(s.toUpperCase().contains("\tTRUE\t"))
					dealers.add(new Dealer(s));
				else
					players.add(new Player(s));
				
			}
			
			fin.close();
			
			
				
				fin = new Scanner(new File("HandOutcomes.txt"));
				fin.nextLine();
				
				while(fin.hasNextLine()) {
					
					HandOutcome h = new HandOutcome(fin.nextLine());
				    for(Player p : players) {
				    	if(p.getPersonID() == h.getPersonID()) {
				    		p.addHand(h); 
				    		break;
				    	}
				    }
				}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());		
		} finally {
			try { fin.close(); } catch (Exception e) {}
		}
		
		System.out.println("Dealer Count: " + dealers.size());
		System.out.println("Player Count: " + players.size());
		
	

	}

}
