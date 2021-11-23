

import java.security.InvalidParameterException;

public class HandOutcome {

	//================================================Properties
	private int handNumber, personID, outcome;
	private boolean folded;
	//================================================Constructors

	public HandOutcome(String line) {
		this(line.split("\t"));
	}

	public HandOutcome(String[] parts) {
		this(	Integer.parseInt(parts[0]),
				Integer.parseInt(parts[1]),
				Integer.parseInt(parts[2]),
				Boolean.parseBoolean(parts[3]));

	}

	public HandOutcome(int handNumber, int personID, int outcome, boolean folded) {
		super();
		setHandNumber(handNumber);
		setPersonID(personID);
		setOutcome(outcome);
		setFolded(folded);
	}

	public HandOutcome(HandOutcome h) {
		this(h.handNumber, h.personID, h.outcome, h.folded);
	}

	//================================================Methods

	@Override
	public HandOutcome clone() {
		return new HandOutcome(this);
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof HandOutcome)) return false;
		HandOutcome h = (HandOutcome)o;
		return h.handNumber == handNumber &&
				h.personID == personID &&
				h.outcome == outcome&&
				h.folded == folded;
	}

	@Override
	public String toString() {
		return "HandOutcome [handNumber=" + handNumber + ", personID=" + personID + ", outcome=" + outcome + ", folded="
				+ folded + "]";
	}

	//================================================Getters/Setters

	public int getHandNumber() {
		return handNumber;
	}

	public void setHandNumber(int handNumber) {
		if(handNumber < 1) throw new InvalidParameterException("Hand Number (" + handNumber + ") invalid");

		this.handNumber = handNumber;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		if(personID < 1) throw new InvalidParameterException("Hand outcome Person ID (" + personID + ") invalid");
		this.personID = personID;
	}

	public int getOutcome() {
		return outcome;
	}

	public void setOutcome(int outcome) {
		this.outcome = outcome;
	}

	public boolean isFolded() {
		return folded;
	}
	
	public void setFolded(boolean folded) {
		this.folded = folded;
	}
	
}
