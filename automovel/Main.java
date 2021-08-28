package automovel;

import java.util.Scanner;

/**
 *
 * @author smlca
 */
public  class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CarroEletrico c1 = new CarroEletrico();
        /*System.out.println("Informe a placa do carro: ");
        c1.placa = input.nextLine();
        System.out.print("Informe a cor do carro: ");
        c1.cor = input.nextLine();
        System.out.println("O carro é " + c1.getCor());
        System.out.print("Informe o renavan: ");
        c1.renavan = input.nextInt();
        c1.setRenavan(c1.renavan);
        System.out.println("O numero do renavan é " + c1.getRenavan());*/
        
        //c1.ligarAlarme();
        //c1.desligarAlarme();
       // c1.ligarAlarme();
       // c1.despararAlarme();
        //c1.desligarAlarme();        
       // c1.pisarAcelerador();
       c1.fecharPortaMalas();
       c1.abrirPortaMalas();
               
    }
}
