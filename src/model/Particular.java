package model;
public class Particular extends Paciente{
	//Atributes
	private String phone;
	private String doctorName;
	private String doctorPhone;
	private String license;

	public Particular (String name,String lastName,int age, String id,String phone, String doctorName, String doctorPhone, String license){
		super(name,lastName,age,id);
		this.phone=phone;
		this.doctorName=doctorName;
		this.doctorPhone=doctorPhone;
		this.license=license;
	}

	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}

	public void setDoctorName(String doctorName){
		this.doctorName=doctorName;
	}
	public String getDoctorName(){
		return doctorName;
	}

	public void setDoctorPhone(String doctorPhone){
		this.doctorPhone=doctorPhone;
	}
	public String getDoctorPhone(){
		return doctorPhone;
	}

	public void setLicense(String license){
		this.license=license;
	}
	public String getLicense(){
		return  license;
	}

	public String toString(){
		return "\n*************Informacion del paciente*************"+
				"\n**Nombre: "+getName()+
				"\n**Apellido: "+getLastname()+
				"\n**Edad: "+getAge()+
				"\n**Id: "+getId()+
				"\n**Telefono de contacto: "+phone+
				"\n**Nombre del medico tratante: "+doctorName+
				"\n**Telefono del medico: "+doctorPhone+
				"\n**Numero de licensia del doctor: "+license+
				"\n*************************************************";

	}


}