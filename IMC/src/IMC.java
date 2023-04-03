import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Paciente paciente = new  Paciente();		
		
		System.out.print("Informe o seu peso: ");
		paciente.peso = input.nextFloat();
		
		System.out.print("Informe a sua altura: ");
		paciente.altura = input.nextDouble();
		
		System.out.println("Informe o sexo: F ou M");
		paciente.sexo = input.next().toUpperCase(); 		
		
		System.out.println(paciente.sexo);
		
		paciente.calcularIMC(paciente.sexo, paciente.peso, paciente.altura);
		 
		
		input.close();
	}

}
