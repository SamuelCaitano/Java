
public class CalcPagamento {
	float valorPorHora = 13;
	float transporte = 10;

	double pagamentoFunc(int diasTrabalhados, float horasTrabalhadas) {
		
		double receber = (valorPorHora * horasTrabalhadas)+ (transporte * diasTrabalhados);
		
		return receber;
	}
}
