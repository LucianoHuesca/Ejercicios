package com.mx.Empleado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//instanciar el objeto 
		Empleado emp1 = new Empleado("Gerardo", "lopez", 25, 8529634125L, "Aux.Contable", "Contabilidad");
		Empleado emp2 = new Empleado("Loreyn", "Allard", 18, 1234567890, "Developer", "Desarrollo");
		Empleado emp3 = new Empleado("Laura", "Ramírez", 30, 10293847, "Jefa de Recursos Humanos", "Recursos Humanos");
		Empleado emp4 = new Empleado("Saul", "Vega", 23, 2449876323L, "Recursos Humanos", "RRHH");
		
		//objeto auxiliar 
		Empleado emp = null;
		
		//mandar a llamar a mi clase implementacion para poder ocupar
		//todos su metodos 
		Implementacion imp = new Implementacion();
		/*
		//guardar
		imp.create(emp1);
		imp.create(emp2);
		imp.create(emp3);
		imp.create(emp4);
		
		//mostrar 
		imp.read();
		
		//buscar
		emp = imp.found(1);
		System.out.println("Elemento encontrado: " + emp);
		
		//editar
		emp = imp.found(0);
		emp.setArea("Finanzas");
		emp.setContacto(9871254026L);
		imp.update(0, emp);
		imp.read();
		
		//eliminar
		imp.delete(2);
		imp.read();
		
		//contar
		imp.contar();
		*/
		//replicar el ejercicio con otra entidad 
		
		
		//declaracion de variables
		Scanner datos = new Scanner(System.in);
		int menuP = 0, menuS =0, indice = 0;
		
		String nombre, apellido, puesto, area;
		long contacto;
		int edad;
		
		do {
			System.out.println("***M E N U***");
			System.out.println("1.- ALTA");
			System.out.println("2.- BUSCAR");
			System.out.println("3.- EDITAR");
			System.out.println("4.- ELIMINAR");
			System.out.println("5.- MOSTRAR");
			System.out.println("6.- CONTAR");
			System.out.println("7.- SALIR");
			System.out.println("---ELIGE UNA OPCION VALIDA EN EL MENU");
			
			//declaracion del bloque tryCatch para evitar que el progrma 
			//se detenga cuando el usuario introduzca valores no
			//numericos
			try {
				menuP = datos.nextInt();
				datos.nextLine();
				
				//inicia mi bloque switch 
				switch(menuP) {
				case 1:
					System.out.println("<<<<<A L T A>>>>>");
					System.out.println("Llena los sighuiente datos sobre el empleado");

					System.out.println("NOMBRE");
					nombre = datos.nextLine();

					System.out.println("APELLIDO");
					apellido = datos.nextLine();

					System.out.println("EDAD");
					edad = datos.nextInt();
					datos.nextLine(); //limpieza de buffer

					System.out.println("CONTACTO");
					contacto = datos.nextLong();
					datos.nextLine();

					System.out.println("PUESTO");
					puesto = datos.nextLine();

					System.out.println("AREA");
					area = datos.nextLine();

					emp = new Empleado(nombre, apellido, edad, contacto, puesto, area);

					if (imp.existeDuplicado(emp)){
						System.out.println("El empleado ya existe en el sistema");
					}else {
						imp.create(emp);
						System.out.println("Se guardo correctamente " + emp.getNombre() + " en la lista");
					}
					imp.create(emp);
					System.out.println("Se guardo el empleado: " + nombre + " exitosamente");
					break;
				case 2:
					/*
					System.out.println("<<<<<B U S C A R>>>>>");
					imprimirDatos(imp);
					if(imp.lista.size() > 0) {
						System.out.println("indica el indice para mostrar informacion");
						indice = datos.nextInt();
						datos.nextLine();

						if(indice >=0 && indice < imp.lista.size()) {
							emp = imp.found(indice);
							System.out.println("Esta es la informacion del empleado"
									+ emp);
						}else {
							System.out.println("Indice fuera de rango, intenta con uno dentro del menu");
						}
					}
					---else if {menuS == 2){
							System.out.println("Ingrese el nombre del empleado");
							String nombreBusqueda = datos.nextLine();
							emp = imp.buscarPorNombre(nombreBusqueda);
							if (emp != null) {
								System.out.println("Empleado encontrado"
										+ emp);
							}else {
								System.out.println("No existe el empleado");
							}
				}
				}*/
					break;
				case 3:
					System.out.println("<<<<<E D I T A R>>>>>");
					imprimirDatos(imp);
					if(imp.lista.size() > 0) {
						System.out.println("Indique el indice que desea editar");
						indice = datos.nextInt();
						datos.nextLine();
						if(indice >=0 && indice < imp.lista.size()) {
							do {
								System.out.println("*** MENU EDITAR***");
								System.out.println("1.- NOMBRE");
								System.out.println("2.- APELLIDO");
								System.out.println("3.- EDAD");
								System.out.println("4.- CONTACTO");
								System.out.println("5.- PUESTO");
								System.out.println("6.- AREA");
								System.out.println("7.- REGRESAR AL MENU PRINCIPAL");
								System.out.println("Elige la opcion para editar");
								menuS = datos.nextInt();
								datos.nextLine();
								emp = imp.found(indice);
								
								switch(menuS) {
								case 1:
									System.out.println("INGRESA EL NUEVO NOMBRE");
									nombre = datos.nextLine();
									emp.setNombre(nombre);
									break;
								case 2:
									System.out.println("INGRESA EL NUEVO APELLIDO");
									apellido = datos.nextLine();
									emp.setApellido(apellido);
									break;
								case 3:
									System.out.println("INGRESA LA NUEVA EDAD");
									edad = datos.nextInt();
									emp.setEdad(edad);
									break;
								case 4:
									System.out.println("INGRESA EL NUEVO CONTACTO");
									contacto = datos.nextLong();
									emp.setContacto(contacto);
									break;
								case 5: 
									System.out.println("INGRESA EL NUEVO PUESTO");
									puesto = datos.nextLine();
									emp.setPuesto(puesto);
									break;
								case 6:
									System.out.println("INGRESA LA NUEVA AREA");
									area = datos.nextLine();
									emp.setArea(area);
									break;
								case 7:
									System.out.println("Rgresando al menu Principal!");
									break;
									default:
										System.out.println("Inidce no valido");
										break;
									
								}
								System.out.println(" edicion exitosa");
							}while(menuS != 7);
						}else {
							System.out.println("Este indice no existe");
						}
					}
					break;
				case 4:
					System.out.println("<<<<<E L I M I N A R>>>>>");
					System.out.println("Como desea eliminar?");
					System.out.println("1.- INDICE");
					System.out.println("2.- NOMBRE");
					menuS = datos.nextInt();
					datos.nextLine();
					if (menuS == 1) {
						imprimirDatos(imp);
						if(imp.lista.size() > 0) {
							System.out.println("indica el indice que deseas eliminar");
							indice = datos.nextInt();
							if(indice >= 0 && indice < imp.lista.size()) {
								imp.delete(indice);
								System.out.println("Eliminacion exitosa");
							}else {
								System.out.println("ese indice no existe");
							}
						}
					}else if(menuS == 2) {
					System.out.println("Ingresa el nombre que deseas eliminar");
					String nombreEliminar = datos.nextLine();
					if(imp.eliminarEmpleadoPorNombre(nombreEliminar)) {
						System.out.println("Empleado eliminado existosamente");
					}else {
						System.out.println("No se encontro el nombre del empleado");
					}
				}else {
					System.out.println("Opcion Invalida");
				}
				break;
				case 5:
					System.out.println("<<<<<M O S T R A R>>>>>");
					if(imp.lista.size() > 0) {
						imp.read();
					}else {
						System.out.println("No hay registros disponibles");
					}
					break;
				case 6:
					System.out.println("<<<<<<C O N T A R>>>>>>");
					imp.contar();
					break;
				case 7:
					System.out.println("Saliendo del menu!!!");
					break;
					default:
						System.out.println("indice fuera de rango");
						break;
				}
			}catch(InputMismatchException e) {
				System.out.println("Entrada invalidad, por favor ingrese un numero");
				datos.nextLine();
				
			}catch(Exception e) {
				System.out.println("Ocurrio un error inesperado" + e.getMessage());
			}
			
		}while(menuP != 7);
		
	}//fin del main 

	private static void imprimirDatos(Implementacion imp) {
		System.out.println("-----Empleados Registrados------");
		if(imp.lista.size() > 0) {
			for(int i = 0; i < imp.lista.size(); i++) {
				System.out.println("El Empleado: [" + i + "] de nombre:" +
						imp.lista.get(i).getNombre());
			}
		}else {
			System.out.println("No hay empleados registrados");
		}
		
	}
	
	

}// fin de la clase 
