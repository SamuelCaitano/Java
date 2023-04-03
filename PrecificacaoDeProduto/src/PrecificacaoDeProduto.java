public class PrecificacaoDeProduto {
	public static void main(String[] args) {  
		Preco preco = new Preco();
		Produto produto = new Produto();
		 
		preco.valorCusto = 35; 
		  		
		produto.calcPreco(preco);
							
		produto.verificarLucro(produto.getValorAtualRevenda(), produto.getPrecoFinal()); 
		
		System.out.println("valorAtualRevenda: " + produto.getValorAtualRevenda());
	}
}
