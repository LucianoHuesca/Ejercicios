package com.mx.Empleado;
//interface es como un contrato que la clase que la implemente debe implemtar si o si
//todos sus metodos
public interface IMetodos {
	
	public void create(Empleado empleado);
	public void update(int indice, Empleado empleado);
	public void read();
	public void delete(int indice);
	public Empleado found(int indice);

}
