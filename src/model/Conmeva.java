package model;
public class Conmeva extends Prepagada{
	//Atributes
	private Category category;

	public Conmeva(String name,String lastName,int age, String id, int affiliation, String entityNam, String entityNum, Category cat){
		super(name,lastName,age,id,affiliation,entityNam,entityNum);
		category=cat;
	}

	public void setCategory(Category category){
		this.category=category;
	}
	public Category getCategory(){
		return category;
	}


	public String toString(){
		return super.toString()+		
				"\nCategoria:  "+category+
				"\n*************************************************";
	}

}