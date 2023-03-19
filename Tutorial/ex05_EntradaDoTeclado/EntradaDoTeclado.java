import java.util.Scanner; // programa utiliza a classe Scanner para a entrada de dados

public class EntradaDoTeclado 
{
    // método main inicia a execusão do aplicativo Java
    public static void main(String[] args) 
    {
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        int soma;
        
        System.out.print("Entre com o primeiro número inteiro: ");
        num1 = input.nextInt(); // lê o primeiro número fornecido pelo usúario
        
        System.out.print("Entre com o segundo número inteiro: ");
        num2 = input.nextInt(); // lê o segundo número fornecido pelo usúario

        input.close(); // Use o método close() para fechar o Scanner em Java após ler o conteúdo de um arquivo
        
        soma = num1 + num2; // soma os números e armazena o total em soma
        
        System.out.printf("A soma de %d + %d = %d%n", num1, num2, soma);
    }
}