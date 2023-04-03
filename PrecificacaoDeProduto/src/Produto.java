public class Produto {   
	double precoFinal;	
	double valorAtualRevenda = 59;	  

	void calcPreco(Preco preco) {
		double precoFinal = ((preco.valorCusto + preco.embalagens + preco.diversos) + 
							(preco.valorCusto * preco.marckup)) * preco.taxaMaquininha;
		 
		setPrecoFinal(precoFinal);		
	}
	
	void verificarLucro(double valorAtualRevenda, double precoFinal) {  
		
		if(valorAtualRevenda < precoFinal ) {   
			setValorAtualRevenda(precoFinal);			
		} else {
			System.out.println("Você já está lucrando!");
		}
	}
	 
	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	
	public double getValorAtualRevenda() {
		return valorAtualRevenda;
	}
	
	public void setValorAtualRevenda(double valorAtualRevenda) {
		this.valorAtualRevenda = valorAtualRevenda;
	}
}
