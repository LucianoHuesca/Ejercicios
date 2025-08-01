package com.mx.Empleado;
//se utiliza la palabre reservada implements para poder implementar un interfaz

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements IMetodos{
	List<Empleado> lista = new ArrayList<Empleado>();

	@Override
	public void create(Empleado empleado) {
		lista.add(empleado);
		
	}

	@Override
	public void update(int indice, Empleado empleado) {
		lista.set(indice, empleado);
		
	}

	@Override
	public void read() {
		System.out.println(lista);
		
	}

	@Override
	public void delete(int indice) {
		lista.remove(indice);
		
	}

	@Override
	public Empleado found(int indice) {
		
		return lista.get(indice);
	}
	
	//metodos personalizados
	
	//metodo personalizado poara contabilizar los elementos que hay en lista
	public void contar() {
		int cont = lista.size();
		System.out.println("La lista contiene: " + cont + " empleados");
	} 
	
	//metodo validacion de exitencia de duplicados
	public boolean existeDuplicado(Empleado empleado) {
		for(Empleado e : lista) {
			if(e.getNombre().equalsIgnoreCase(empleado.getNombre()) && e.getApellido().equalsIgnoreCase(empleado.getApellido())
					&& e.getEdad() == empleado.getEdad() && e.getContacto() == empleado.getContacto() 
					&& e.getPuesto().equalsIgnoreCase(empleado.getPuesto()) && e.getArea().equalsIgnoreCase(empleado.getArea())){
				return true; //si esxiste un empleado igual
			}
		}
		return false;
	}
	
	//metodo para buscar empleado por nombre
	public Empleado buscarPorNombre(String nombre) {
		for(Empleado e : lista) {
			if(e.getNombre().equalsIgnoreCase(nombre)) {
				return e;
			}
		}
		return null;
	}

	//Metodo para eliminar empleado por nombre

	public boolean eliminarEmpleadoPorNombre (String nombre) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNombre().equalsIgnoreCase(nombre)){
				lista.remove(i);
				return true;
			}
		}
		return false;
	}
}
