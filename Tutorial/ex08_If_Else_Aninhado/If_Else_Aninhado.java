// Este programa tem a finalidade de mostrar o uso do IF e ELSE, somente para fins didáticos
import java.util.Scanner; // programa utiliza a classe Scanner para a entrada de dados

public class If_Else_Aninhado 
{
    public static void main(String[] args) 
    {
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int idade;
        System.out.print("Insira sua idade: ");
        idade = input.nextInt(); // lê o número fornecido

        // usamos o if e o else if para verificar qual classificação você está
        if (idade <= 12) {
            System.out.println("Você é criança!");
        } else if (idade <= 18) {
            System.out.println("Você é adolecente");
        } else if (idade <= 59) {
            System.out.println("Você é jovem");
        } else if (idade <= 122) {
            System.out.println("Você é idoso");
        } else if (idade > 122){
            System.out.println("Você é imortal");
        }
    } // fim do método main
} // fim da classe
