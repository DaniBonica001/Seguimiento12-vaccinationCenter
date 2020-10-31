package model;
public abstract class Prepagada extends Paciente{
	//Atributes 
	private int affiliationNumber;
	private String entityName;
	private String entityNumber;

	//Method
	public Prepagada(String name,String lastName,int age, String id,int affiliationNumber, String entityName, String entityNumber){
		super(name,lastName,age,id);
		this.affiliationNumber=affiliationNumber;
		this.entityName=entityName;
		this.entityNumber=entityNumber;
	}

	public void setAffiliationNumber(int affiliationNumber){
		this.affiliationNumber=affiliationNumber;
	}
	public int getAffiliationNumber(){
		return affiliationNumber;
	}

	public void setEntityName(String entityName){
		this.entityName=entityName;
	}
	public String getEntityName(){
		return entityName;
	}

	public void setEntityNumber(String entityNumber){
		this.entityNumber=entityNumber;
	}
	public String getEntityNumber(){
		return entityNumber;
	}

	public String toString(){
		return "\n*************Informacion del paciente*************"+
				"\n**Nombre: "+getName()+
				"\n**Apellido: "+getLastname()+
				"\n**Edad: "+getAge()+
				"\n**Id: "+getId()+
				"\n**Numero de afiliacion: "+affiliationNumber+
				"\n**Nombre de la entidad: "+entityName+
				"\n**Numero de la entidad: "+entityNumber+
				"\n*************************************************";
	}
}