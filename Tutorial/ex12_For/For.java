import java.util.Scanner; // programa utiliza a classe Scanner para a entrada de dados

public class For 
{
    // método main inicia a execusão do aplicativo Java
    public static void main(String[] args) 
    {
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Informe qual tabuada você quer: ");
        num = input.nextInt(); // lê o número fornecido pelo usúario
        
        /* iniciamos o contador em 1, verificamos se o contador atende a condição,
        após realizar a intrução dentro do for, incrementa 1 ao contador 
        esse loop será realizado até que contador seja MENOR IGUAL a 10*/
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + "x" + i +  " = " + (num * i));
        }
    } // fim do método main    
} // fim da classe For
