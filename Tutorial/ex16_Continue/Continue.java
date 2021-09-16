public class Continue 
{
    public static void main(String[] args) 
    {        
        // loop for que vai de 1 à 5
        for (int i = 1; i <= 5; i++) {
            
            /*  se a condição do if for true,
                pula as proximas instruções,
                e prossegue para as proximas iteração do loop */
            if (i == 3) 
            {
                continue;
            }

            System.out.print(i + " ");
        } // fim do loop for
        
        System.out.println("\nFIM!");
    } // fim do método main
} // fim da classe Continue

