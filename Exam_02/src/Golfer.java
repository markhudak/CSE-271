
public class Golfer extends Athlete{

	//================================================Properties

	public int range;

	//================================================Constructors

	public Golfer(String name, int age, enuAgeCategory ageCategory, int range) {
		super(name, age, ageCategory, range);
	}

	public Golfer(Golfer g)	{
		this(g.getName(), g.getAge(), g.getAgeCategory(), g.getRange());
	}

	//================================================Methods

	@Override
	public void Compete() {}

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

	public int getRange()
	{return range;}
	public void setRange(int range)
	{this.range = range;}

}
