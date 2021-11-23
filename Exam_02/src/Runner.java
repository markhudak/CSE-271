
public class Runner extends Athlete implements iEnduranceSport{

	//================================================Properties

	public int speed;

	//================================================Constructors

	public Runner(String name, int age, enuAgeCategory ageCategory, int speed) {
		super(name, age, ageCategory, speed);
	}

	public Runner(Runner r)	{
		this(r.getName(), r.getAge(), r.getAgeCategory(), r.getSpeed());
	}

	//================================================Methods

	@Override
	public void Compete() {}

	@Override
	public int runMiles() {}

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

	public int getSpeed()
	{return speed;}
	public void setSpeed(int speed)
	{this.speed = speed;}




}
