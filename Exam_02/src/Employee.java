import java.io.RandomAccessFile;

public class Employee {

	//=======================================================Properties

	public String id, name;
	public int age;
	public double latitude, longitude, salary;
	public boolean alive;

	//=======================================================Constructors

	public Employee(String id, String name, int age, double latitude, double longitude, double salary, boolean alive) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.latitude = latitude;
		this.longitude = longitude;
		this.salary = salary;
		this.alive = alive;
	}

	public Employee(RandomAccessFile raf) throws Exception {
		load(raf);
	}

	//=======================================================Methods


	public void save(RandomAccessFile raf) throws Exception {
		raf.writeUTF(id);
		raf.writeUTF(name);
		raf.writeInt(age);
		raf.writeDouble(latitude);
		raf.writeDouble(longitude);
		raf.writeDouble(salary);
		raf.writeBoolean(alive);

	}

	public void load(RandomAccessFile raf) throws Exception {
		id = raf.readUTF();
		name = raf.readUTF();
		age = raf.readInt();
		latitude = raf.readDouble();
		longitude = raf.readDouble();
		salary = raf.readDouble();
		alive = raf.readBoolean();
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10d %-10.4f %-10.4f %-10.2f %-10b", name, age, latitude, longitude, salary, alive);
	}

	//=======================================================Getters/Setter

	public String getId()				 			{return id;}
	public void setId(String id) 					{this.id = id;}

	public String getName() 						{return name;}
	public void setName(String name) 				{this.name = name;}

	public int getAge() 							{return age;}
	public void setAge(int age) 					{this.age = age;}

	public double getLatitude() 					{return latitude;}
	public void setLatitude(double latitude) 		{this.latitude = latitude;}

	public double getLongitude() 					{return longitude;}
	public void setLongitude(double longitude) 		{this.longitude = longitude;}

	public double getSalary() 						{return salary;}
	public void setSalary(double salary) 			{this.salary = salary;}

	public boolean isAlive()						{return alive;}
	public void setAlive(boolean alive) 			{this.alive = alive;}



}
