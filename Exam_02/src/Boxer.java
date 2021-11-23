
public class Boxer extends Athlete implements iAggressiveSport{

	//================================================Properties

	public String nickName;

	//================================================Constructors

	public Boxer(String name, int age, enuAgeCategory ageCategory, String nickName) {
		super(name, age, ageCategory, nickName);
	}

	public Boxer(Boxer b)	{
		this(b.getName(), b.getAge(), b.getAgeCategory(), b.getNickName);
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

	public String getNickName()
	{return nickName;}
	public String setNickName(String nickName)
	{this.nickName = nickName;}

}
