package DOG1;

public class Dog1
{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	//generic Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	 //generic getter
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
}

class Dog {
	public static void main(String[] args) {
		//Dog1 d = new Dog1();
	//d.setData("Tommy",4,"Brown",7000,"GR");
	//d.getData();
	Dog1 d1 = new Dog1();
	d1.setName("Rocky");
	d1.setAge(5);
	d1.setColor("yellow");
	d1.setBreed("pug");
	d1.setCost(9000);
	System.out.println("=====================");
	System.out.println(d1.getName());
	System.out.println(d1.getAge());
	System.out.println(d1.getColor());
	System.out.println(d1.getCost());
	System.out.println(d1.getBreed());
	}
}

	
	
	
		
	
	
