package model;
public class Eps extends Paciente{
	//Atributes 
	private String epsName;
	private String orderNumber;

	//Method
	public Eps(String name,String lastName,int age, String id,String epsName,String orderNumber){
		super(name,lastName,age,id);
		this.epsName=epsName;
		this.orderNumber=orderNumber;
	}

	public void setEpsName(String epsName){
		this.epsName=epsName;
	}
	public String getEpsName(){
		return epsName;
	}

	public void setOrderNumber(String orderNumber){
		this.orderNumber=orderNumber;
	}
	public String getOrderNumber(){
		return orderNumber;
	}

	public String toString(){
		return "\n*************Informacion del paciente*************"+
				"\n**Nombre: "+getName()+
				"\n**Apellido: "+getLastname()+
				"\n**Edad: "+getAge()+
				"\n**Id: "+getId()+
				"\n**Nombre de la Eps: "+epsName+
				"\n**Numero de la orden de servicio: "+orderNumber+
				"\n*************************************************";
	}

}