package conversorTemperatura;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double Celsius = entrada.nextDouble();
		
		double Fahrenheit = ( 9 * Celsius + 160 ) / 5;

		System.out.println("A medida convertida é " + Fahrenheit + "ºF");
	}

}
