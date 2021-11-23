
public class FootballPlayer extends Athlete implements iAgressiveSport{

	//================================================Properties

	public int jerseyNum;

	//================================================Constructors

	public FootballPlayer(String name, int age, enuAgeCategory ageCategory, int jerseyNum) {
		super(name, age, ageCategory, jerseyNum);
	}

	public FootballPlayer(FootballPlayer fb)	{
		this(fb.getName(), fb.getAge(), fb.getAgeCategory(), fb.getJerseyNum());
	}


	//================================================Methods

	@Override
	public void Compete() {}

	@Override
	public boolean fight() {}

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

	public int getJerseyNum()
	{return jerseyNum;}
	public void setJerseyNum(int jerseyNum)
	{this.jerseyNum = jerseyNum;}


}
