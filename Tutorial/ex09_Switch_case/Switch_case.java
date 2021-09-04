import java.util.Scanner; // programa utiliza a classe Scanner para a entrada de dados

public class Switch_case 
{
    // método main inicia a execusão do aplicativo Java
    public static void main(String[] args) 
    {
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        int num;
        
        Menu telaMenu = new Menu(); // cria um objeto Menu e o atribui a telaMenu
        Ajuda telaAjuda = new Ajuda();// cria um objeto Ajuda e o atribui a telaMenu   
                       
        do 
        {
            System.out.println("Digite:\n[1] Menu\n[2] Ajuda\n[3] Sair");
            num = input.nextInt(); // lê o número fornecido pelo usúario

            switch (num) 
            {
                case 1:
                    telaMenu.menu(); // chaama o método menu() da classe Menu
                    break; // sai do switch
                case 2:
                    telaAjuda.ajuda(); // chaama o método ajuda() da classe Ajuda
                    break; // sai do switch
                case 3:
                    System.out.println("Obrigado por utilizar nossos serviços!");
                    System.exit(0); // fecha o programa
                default:
                    System.out.println("Escolha uma opção válida");                  
            }
        } while (num != 1 && num!= 2 && num != 3); // condição do (do while).
    }// fim do método main
} // fim da classe Switch_case