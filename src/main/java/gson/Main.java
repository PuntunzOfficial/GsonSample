package gson;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Persona human = new Persona();
		
			System.out.println("Introduce tu nombre: ");
			human.setNombre(scan.nextLine());
		
			System.out.println("Ahora tu apellido: ");
			human.setApellidos(scan.nextLine());

			System.out.println("Para acabar, introduce la edad: ");
			human.setEdad(scan.nextInt());
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(human);
		System.out.println(json);
		
		scan.close();
	}

}