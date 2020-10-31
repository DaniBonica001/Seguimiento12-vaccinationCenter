package ui;
import java.util.Scanner;
import model.Centro;
public class Main{
	public static Centro objCentro;
	public final static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		createCentro();
		boolean exit=true;
		while (exit==true){
			System.out.println("Menu principal, seleccione una opcion:"+
								"\n(1)Crear un paciente"+
								"\n(2)Mostrar la cantidad de pacientes que atiende el centro de vacunacion"+
								"\n(3)Mostrar la informacion mas relevante de un paciente"+
								"\n(4)Mostrar la informacion del centro"+
								"\n(0)Salir");
			int option=lector.nextInt();
			lector.nextLine();

			switch (option){
				case 1: createPatient();				
				break;

				case 2: System.out.println(objCentro.showAmountPatient());				
				break;

				case 3: showInfoPatient();
				break;

				case 4: System.out.println(objCentro.showAllInformation());
				break;

				case 0:
				System.out.println("¡Bye!");
				exit=false;
				break;
			}
		}
	}

	public static void createCentro(){
		objCentro=new Centro();
	}

	public static void createPatient(){
		String showMessage="";
		System.out.println("Ingrese el nombre del paciente");
		String name=lector.nextLine();

		System.out.println("Ingrese el apellido del paciente");
		String lastName=lector.nextLine();

		System.out.println("Ingrese la edad del paciente");
		int age=lector.nextInt();
		lector.nextLine();

		System.out.println("Ingrese el ID del paciente");
		String id=lector.nextLine();

		System.out.println("Ingrese: "+
							"\n(1)Si es un paciente particular"+
							"\n(2)Si es un paciente de la EPS"+
							"\n(3)Si es un paciente de medicina prepagada");
		int option=lector.nextInt();
		lector.nextLine();

		switch(option){
			case 1:
			System.out.println("Ingrese su telefono de contacto");
			String contactPhone=lector.nextLine();
			System.out.println("Ingrese el nombre de su medico tratante");
			String doctorName=lector.nextLine();

			System.out.println("Ingrese el telefono de su medico tratante");
			String doctorPhone=lector.nextLine();

			System.out.println("Ingrese el numero de licensia de su medico");
			String license=lector.nextLine();

			showMessage= objCentro.createPatientParticular(name,lastName,age,id,contactPhone,doctorName,doctorPhone,license);
			System.out.println(showMessage);
			break;

			case 2:

			System.out.println("Ingrese el nombre de la EPS");
			String epsName=lector.nextLine();

			System.out.println("Ingrese el numero de la orden de servicio");
			String order=lector.nextLine();

			showMessage=objCentro.createPatientEPS(name,lastName,age,id,epsName,order);
			System.out.println(showMessage);
			break;

			case 3:

			System.out.println("Ingrese el numero de afiliacion");
			int affiliation= lector.nextInt();
			lector.nextLine();

			System.out.println("Ingrese el nombre de la entidad");
			String entityNam=lector.nextLine();

			System.out.println("Ingrese un numero de contacto de la entidad");
			String entityNum=lector.nextLine();

			System.out.println("Igrese:"+
								"\n(1)Si pertenece a Conmeva"+
								"\n(2)Si pertenece a Sura"+
								"\n(0)Ninguna ");
			int medicine=lector.nextInt();
			lector.nextLine();

				switch(medicine){

					case 1:
					System.out.println("Seleccion una categoria:"+
										"\n(1)Platino"+
										"\n(2)Oro"+
										"\n(3)Oro plus");
					int category=lector.nextInt();
					lector.nextLine();

					showMessage=objCentro.createPatientConmeva(name,lastName,age,id,affiliation,entityNam,entityNum,category);
					System.out.println(showMessage);
					break;

					case 2: 

					System.out.println("Ingrese el valor minimo de la poliza de cubrimiento");
					int minimum=lector.nextInt();

					System.out.println("Ingrese el valor maximo de la poliza de cubrimiento");
					int maximum=lector.nextInt();

					showMessage=objCentro.createPatientSura(name,lastName,age,id,affiliation,entityNam,entityNum,minimum,maximum);
					System.out.println(showMessage);
					break;


					case 0:
					System.out.println("No se registrara el paciente");

					default: 
					System.out.println("Opcion incorrecta");
					break;
				}
			break;

			default:
			System.out.println("Opcion incorrecta");
			break;

		}
	}

	public static void showInfoPatient(){
		String message="";
		System.out.println("Ingrese el id del paceinte que quiere conocer la informacion");
		String identification=lector.nextLine();
		message=objCentro.showInfoPatient(identification);
		System.out.println(message);
	}


}