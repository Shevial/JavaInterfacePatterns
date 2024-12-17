package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.Scanner;

@Configuration
@ComponentScan (basePackages="beans")
public class Appconfig {

	@Bean 
	public Scanner Scanner () {
		
		return new Scanner(System.in);
	}

}
