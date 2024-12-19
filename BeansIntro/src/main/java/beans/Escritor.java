package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Esta notacion le indica que a continuación hay un bean
//@Service
//@Repository 

// si escribo aqui @Scope ("prototype") al pedir un objeto lo crea de nuevo

public class Escritor {

	@Autowired // si hago autowired en una variable de instancia debo tener el metodo set
	private Lector lector;
	
	private String saludo = "Saludo por defecto";
	
	public void setLector(Lector lector) {
		this.lector = lector;
	}
	
	public void setSaludo (String saludo) {
		this.saludo = saludo;
	}
	
	public void escribirSaludo ()	{
		
		String saludod = lector.leer();
		if(saludod.length() > 0)	{
			System.out.println(saludod);
		} else	{
			System.out.println(saludo);
		
		}
	}
}
