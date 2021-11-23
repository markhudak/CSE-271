
import java.util.ArrayList;

public class Player extends Person{

	//================================================Properties
	private int totalFunds;
	private ArrayList<HandOutcome> outcomes = new ArrayList<HandOutcome>();
	//================================================Constructors

	public Player(String line) {
		this(line.split("\t"));
	}

	public Player(String[] parts) {
		this(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[3]));
	}

	public Player(int personID, String name, int totalFunds) {
		super(personID, name);
		setTotalFunds(totalFunds);
	}


	public Player(Player p ) {
		this(p.getPersonID(), p.getName(), p.totalFunds);
	}

	//================================================Methods

	public Player clone() {

		return new Player(this);
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Player)) return false;
		Player p = (Player)o;
		return super.equals(p) &&
				p.totalFunds == totalFunds &&
				p.outcomes.equals(outcomes);
	}
	
	public void addHand(HandOutcome h) {
		outcomes.add(h);
		totalFunds += h.getOutcome();
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%,10d", totalFunds);
	}

	//================================================Getters/Setters

	public int getTotalFunds() {
		return totalFunds;
	}

	public void setTotalFunds(int totalFunds) {
		this.totalFunds = totalFunds;


	}
}