import java.util.Scanner;

public class FolhaDePagamento {

	public static void main(String[] args) {
		CalcPagamento pgtoFunc = new CalcPagamento();
		
		Scanner input = new Scanner(System.in);		
		
		int diasTrabalhados;
		float horasTrabalhadas;
		
		System.out.print("Informe quantos dias trabalhou: ");
		diasTrabalhados = input.nextInt();
		
		System.out.print("Informe quantas horas trabalhou no total: ");
		horasTrabalhadas = input.nextFloat();
		
		double receber = pgtoFunc.pagamentoFunc(diasTrabalhados, horasTrabalhadas);
		
		System.out.println("Voce deve receber R$" + receber + " reais");
		
		input.close();
	}

}
