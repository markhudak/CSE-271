

import java.security.InvalidParameterException;

public abstract class Person {

	//================================================Properties
	private int personID;
	private String name;
	//================================================Constructors

	public Person(String line) {
		this(line.split("\t"));
	}

	public Person(String[] parts) {
		this(Integer.parseInt(parts[0]), parts[1]);
	}

	public Person(Person p) {
		this(p.personID, p.name);
	}

	public Person(int personID, String name) {
		super();
		setPersonID(personID);
		setName(name);
	}

	//================================================Methods

	@Override
	public String toString() {
		return String.format("%-10d %-25s",  personID, name);
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Person)) return false;
		return ((Person)o).name.equals(name) &&
				((Person)o).personID == personID;
	}

	//================================================Getters/Setters
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		if(personID < 1) throw new InvalidParameterException("personID (" + personID + ") invalid");
		this.personID = personID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



}
