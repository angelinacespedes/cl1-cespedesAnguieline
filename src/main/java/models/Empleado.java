package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="empleados")
public class Empleado {
	

	@Column(name="idempleado")
	private int idempleado;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos1;
	
	@Column(name="edad")
	private int edad;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="salario")
	private double salario;
	

	
	//constructor con datos
	public Empleado() {}
	public Empleado( String apellidos, String nombres, int edad, String sexo, double salario) {
		
		
		this.apellidos1 = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	//declaracion de los accesos a las propiedades
	public int getIdEmpleado() {
		return idempleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idempleado = idEmpleado;
	}
	public String getApellidos() {
		return apellidos1;
	}
	public void setApellidos(String apellidos) {
		this.apellidos1 = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		sexo = sexo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	//declaracion del metodo para mostrar los datos
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idempleado + ", apellidos=" + apellidos1 + ", Nombres=" + nombres + ", Edad="
				+ edad + ", Sexo=" + sexo + ", Salario=" + salario + "]";
	}
	
	
	}