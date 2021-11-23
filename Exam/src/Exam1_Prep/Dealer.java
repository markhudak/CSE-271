

import java.security.InvalidParameterException;

public class Dealer extends Person {

	//================================================Properties

	private int totalDeals;

	//================================================Constructors

	public Dealer(String line) {
		this(line.split("\t"));
	}

	public Dealer(String[] parts) {
		this(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[3]));
	}

	public Dealer(int personID, String name, int totalDeals) {
		super(personID, name);
		setTotalDeals(totalDeals);
	}




	public Dealer(Dealer p ) {
		this(p.getPersonID(), p.getName(), p.totalDeals);
	}

	//================================================Methods

	public Dealer clone() {
		return new Dealer(this);
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Dealer)) return false;
		return super.equals(o) &&
				((Dealer)o).totalDeals == totalDeals;	
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%,10d", totalDeals);
	}

	//================================================Getters/Setters


	public int getTotalDeals() {
		return totalDeals;
	}

	public void setTotalDeals(int totalDeals) {
		if(totalDeals < 0) throw new InvalidParameterException("Total Deals (" + totalDeals + ") invalid");
		this.totalDeals = totalDeals;

	}	

}
