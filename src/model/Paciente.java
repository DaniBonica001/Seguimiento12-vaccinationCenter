package model;
public abstract class Paciente{
	//Atributes
	private String name;
	private String lastName;
	private int age;
	private String id;

	public Paciente(String name,String lastName,int age, String id){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.id=id;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	public String getLastname(){
		return lastName;
	}

	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}

	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}


}