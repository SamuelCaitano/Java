public class Break 
{
    public static void main(String[] args) 
    {
        // loop for que vai de 1 à 5
        for (int i = 1; i <= 5; i++) 
        {
            /*  se a condição do if for true,
                ocasiona a saída imediata */
            if (i == 4) {
                break;
            }

            System.out.print(i + " ");
        }
        System.out.println("\nFIM");
    }
}

