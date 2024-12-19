package beans;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lector {

	private Scanner entrada; //variable de tipo scanner
	
	@Autowired // notacion (clase) Incorpora la clase al proyecto. Se puede recibir en un CONSTRUCTOR, METHOD, PARAMETER, FIELD, ANNOTATION_TYPE. 
	public Lector (Scanner entrada) {
		
		this.entrada = entrada;
		
	}
	
	public String leer() {
		
		System.out.println("Indique un saludo: ");
		return entrada.nextLine();
	}
}
