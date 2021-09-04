import java.util.Scanner; // programa utiliza a classe Scanner para a entrada de dados

public class If_Else 
{
    // método main inicia a execusão do aplicativo Java
    public static void main(String[] args) 
    {
         // cria um Scanner para obter entrada a partir da janela de comando        
        Scanner input = new Scanner(System.in);
        
        float nota; // váriavel float para a entrada de números reais
        float media = 6;
        
        System.out.print("Informe sua nota: ");
        nota = input.nextFloat(); // lê o número fornecido pelo usúario
        
        /* se formos utilizar apenas uma instrução dentro do if else, não necessita colocar chaves,
        por legibilidade SEMPRE utilize o bloco de chaves de abertura e fechamento */
        if (nota >=media)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
        
        // essa impressão será mostrada, independente do resultado, pois não está dentro da instrução
        System.out.println("fim do programa");
    } // fim do método main    
} // fim da classe If_Else
