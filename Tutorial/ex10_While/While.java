// recebe as notas ate o termino do loop, realiza o calculo e retorna o resultado

import java.util.Scanner;

public class While 
{    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        float[] nota = new float[4];
        float soma = 0;
        float media;
        
        while ( i < 4) 
        {
            System.out.printf("Informe a nota %d: ", i+1);
            nota[i] = input.nextFloat();
            
            soma += nota[i]; // soma recebe, soma + nota[i] (nota na posição i do vetor)
            i++; // incrementando a variável de controle (i)           
        }
                
        media = soma / 4; // media obtém a divisão de soma por 4
        
        // exibe Aprovado se a condição for true e Reprovado se a condição for false
        System.out.println(media >=6 ? "Aprovado": "Reprovado");        
    }    
}

