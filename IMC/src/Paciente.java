
public class Paciente { 
	
	protected float peso;
	double altura;
	String sexo;
	
	void calcularIMC(String sexo, float peso, double altura) {
		double imc = peso / (altura * altura);

		if ((sexo.equals("F") && imc < 19.1) || (sexo.equals("M") && imc < 20.7) ) {
			System.out.println("Abaixo do peso");
		} else if ((sexo.equals("F") && imc < 25.8) || (sexo.equals("M") && imc < 26.4)) {
			System.out.println("No peso ideal");
		} else if ((sexo.equals("F") && imc < 27.3) || (sexo.equals("M") && imc < 27.8)) {
			System.out.println("Um pouco acima do peso");
		} else if ((sexo.equals("F") && imc < 32.2) || (sexo.equals("M") && imc < 31.1)) {
			System.out.println("Acima do peso");
		} else {
			System.out.println("Obeso");
		}
	}
}
