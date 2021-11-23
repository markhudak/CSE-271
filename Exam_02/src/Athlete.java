
public abstract class Athlete {

	//================================================Properties

	public String name;
	public int age;
	public enuAgeCategory ageCategory;

	//================================================Constructors

	public Athlete(String line)	{
		this(line.split("\t"));
	}

	public Athlete(String[] parts)	{
		this(parts[0], Integer.parseInt(parts[1]), parts[2]);
	}

	public Athlete(String name, int age, enuAgeCategory ageCategory) {
		super();
		this.name = name;
		this.age = age;
		this.ageCategory = ageCategory;
	}

	public Athlete(Athlete a)	{
		this(a.getName(), a.getAge(), a.getAgeCategory());
	}

	//================================================Methods

	public abstract void Compete();

	//================================================Setters/Getters

	public String getName() 					
	{return name;} 
	public void setName(String name) 			
	{this.name = name;}

	public int getAge() 						
	{return age;}
	public void setAge(int age) 				
	{this.age = age;}

	public enuAgeCategory getAgeCategory() 		
	{return ageCategory;}
	public void setAgeCategory(enuAgeCategory ageCategory) 
	{this.ageCategory = ageCategory;}



}
