package model;
public class Centro{
	//Constants
	public final static int MAX_PATIENTS= 300;
	//Atributes
	private int patientAmount=0;
	private int patientParticular=0;
	private int patientEps=0;
	private int patientConmeva=0;
	private int patientSura=0;
	//Relations
	public Paciente [] patients;

	//Method
	public Centro(){
		patients= new Paciente[MAX_PATIENTS];
	}

	public boolean findPatient(String id){
		boolean exit=false;
		boolean find=false;
		for (int i=0;i<patients.length && !exit;i++){
			if (patients[i]!=null && patients[i].getId().equalsIgnoreCase(id)){
				exit=true;
				find=true;
			}
		}
	return find;
	}

	public String createPatientParticular(String name,String lastName,int age,String id,String phone,String doctorName,
		String doctorPhone, String license){
		String message="me canse de intentar";
		boolean exit=false;
		boolean seekPatient=findPatient(id);
		if (seekPatient==true){
			message="Error. El paciente ya existe";
		}else{
			for (int i=0;i<patients.length && !exit;i++){
				if (patients[i]==null){
					exit=true;
					patients[i]= new Particular(name,lastName,age,id,phone,doctorName,doctorPhone,license);
					message="Se ha registrado el paciente exitosamente";
					patientParticular+=1;
					
				}
			}

			if (exit==false){
				message="Error. No se pueden crear mas pacientes";
			}
		}
	return message;
	}

	public String createPatientEPS(String name,String lastName,int age,String id,String epsName,String order){
		String message="tienes que mostrar";
		boolean exit=false;
		boolean seekPatient=findPatient(id);
		if (seekPatient==true){
			message="Error. El paciente ya existe";
		}else{
			for (int i=0;i<patients.length && !exit;i++){
				if (patients[i]==null){
					exit=true;
					patients[i]= new Eps(name,lastName,age,id,epsName,order);
					patientEps+=1;
					message="Se ha registrado el paciente exitosamente";
				}
			}

			if (exit==false){
				message="Error. No se pueden crear mas pacientes";
			}
		}
	return message;
	}

	public String createPatientConmeva(String name,String lastName,int age,String id,int afiliacion,String entityNam,String entityNum,int category){
		String message="";
		boolean exit=false;
		boolean seekPatient=findPatient(id);
		if (seekPatient==true){
			message="Error. El paciente ya existe";
		}else{
			for (int i=0;i<patients.length && !exit;i++){
				if (patients[i]==null){
					exit=true;
					patientConmeva+=1;
					if (category==1){
						patients[i]= new Conmeva(name,lastName,age,id,afiliacion,entityNam,entityNum,Category.PLATINO);
					}else if (category==2){
						patients[i]= new Conmeva(name,lastName,age,id,afiliacion,entityNam,entityNum,Category.ORO);
					}else if (category==3){
						patients[i]= new Conmeva(name,lastName,age,id,afiliacion,entityNam,entityNum,Category.ORO_PLUS);
					}else{
						message="Opcion incorrecta";
					}
					
					message="Se ha registrado el paciente exitosamente";
				}
			}

			if (exit==false){
				message="Error. No se pueden crear mas pacientes";
			}
		}
	return message;
	}

	public String createPatientSura(String name,String lastName,int age,String id,int affiliation, String entityName, String entityNum, int minimum,int maximum){
		String message="";
		boolean exit=false;
		boolean seekPatient=findPatient(id);
		if (seekPatient==true){
			message="Error. El paciente ya existe";
		}else{
			for (int i=0;i<patients.length && !exit;i++){
				if (patients[i]==null){
					exit=true;
					patients[i]= new Sura(name,lastName,age,id,affiliation,entityName,entityNum,minimum,maximum);
					patientSura+=1;
					message="Se ha registrado el paciente exitosamente";
				}
			}

			if (exit==false){
				message="Error. No se pueden crear mas pacientes";
			}
		}
	return message;
	}

	public String showAmountPatient(){
		String message="";
		int patientAmount=patientParticular+patientEps+patientConmeva+patientSura;		
		message="Cantidad total de pacientes: "+patientAmount+
				"\nCantidad de pacientes particulares: "+patientParticular+
				"\nCanitdad de pacientes por Eps: "+patientEps+
				"\nCantidad de pacientes de Conmeva: "+patientConmeva+
				"\nCantidad de pacientes de Sura: "+patientSura;
		

		return message;
	}

	public String showInfoPatient(String id){
		String message="";
		boolean exit=false;
		boolean find = findPatient(id);
		if (find==true){
			for (int i=0;i<patients.length && !exit;i++){
				if (patients[i].getId().equalsIgnoreCase(id)){
					exit=true;
					message+=patients[i].toString();
				}
			}
		}else{
			message="Error. No se encontro el paciente";
		}
	return message;	
	}

	public String showAllInformation(){
		String message="";
		for (int i=0;i<patients.length;i++){
			if (patients[i]!=null){
				message+=patients[i].toString();
			}
		}
	return message;
	}
}