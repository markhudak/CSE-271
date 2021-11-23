
public enum enuAgeCategory {

	YOUTH		("Youth"),
	AMATEUR		("Amateur"),
	SEMI_PRO	("Semi Pro"),
	PRO			("Pro");

	//----------------------------------------------------------------------//

	private String friendlyName;

	//----------------------------------------------------------------------//

	private enuAgeCategory(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

}