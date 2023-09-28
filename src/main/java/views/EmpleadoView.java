package views;

import controlador.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear
		
		//String Empleado = new EmpleadoController().createEmpleado("cespedes","angie",18,"femenino",900.00);
		//System.out.println(Empleado);
		//String Empleado = new EmpleadoController().createEmpleado("graciela","gianella",32,"femenino",9000);
		//System.out.println(Empleado);
		
		
		
		//eliminar
		
		//String empleado= new EmpleadoController().deleteEmpleado(2);
		//System.out.println(empleado);
	
		//ACTUALIZAR EMPLEADO
		String empleado= new EmpleadoController().updateEmpleado(1, "lopez");
		System.out.println(empleado);
		
	}
}