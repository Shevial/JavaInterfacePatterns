package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext appContext =
				new AnnotationConfigApplicationContext (Appconfig.class);
		//En lugar de importar la clase, le digo en qué paquete se encuentra
		beans.Escritor reverteArturo = appContext.getBean(beans.Escritor.class);
		
		reverteArturo.escribirSaludo();
		
		reverteArturo.setSaludo("Hello");
		
		beans.Escritor cervantesMiguel = appContext.getBean(beans.Escritor.class);
		
		cervantesMiguel.escribirSaludo();
	}

}
