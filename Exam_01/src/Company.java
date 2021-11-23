
import java.security.InvalidParameterException;


public abstract class Company {


	//================================================Properties

	private int companyID;
	private String companyName, ownerName;

	//================================================Constructors

	public Company(String line) {
		this(line.split("\t"));
	}

	public Company(String[] parts) {
		this(Integer.parseInt(parts[0]), parts[1], parts[3]);
	}

	public Company(int companyID, String companyName, String ownerName) {
		super();
		setCompanyID(companyID);
		setCompanyName(companyName);
		setOwnerName(ownerName);
	}

	public Company(Company c) {
		this(c.companyID, c.companyName, c.ownerName);
	}

	//================================================Methods

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Company)) return false;
		return (((Company)o).companyID == companyID &&
				((Company)o).companyName.equals(companyName) &&
				((Company)o).ownerName.equals(ownerName));
	}

	@Override
	public String toString() {
		return String.format("%-10d %-30s %-30s",  companyID, companyName, ownerName);
	}

	//================================================Getters/Setters

	public void setCompanyID(int companyID) {
		if(companyID < 1) throw new InvalidParameterException("Company ID (" + companyID + ") invalid");
		this.companyID = companyID;
	}
	public void setCompanyName(String companyName) {this.companyName = companyName;}
	public void setOwnerName(String ownerName) {this.ownerName = ownerName;}

	public int getCompanyID() {return companyID;}
	public String getCompanyName() {return companyName;}
	public String getOwnerName() {return ownerName;}

}

