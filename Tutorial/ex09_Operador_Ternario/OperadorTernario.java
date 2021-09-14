// retorna se o número digitado é PAR ou IMPAR
import java.util.Scanner;

public class OperadorTernario 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Informe um número real: ");
        num = input.nextInt();
        
        // se o resto da divisão por 2 for 0, imprimira PAR, se não, imprimira IMPAR
        System.out.println(num % 2 == 0 ? "PAR" : "IMPAR");
    }    
}
