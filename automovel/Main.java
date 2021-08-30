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
        //System.out.println(c1.toString());
        
        c1.LuzPortaMalas();
        c1.abrirPortaMalas();
        c1.abrirPortaMalas();
    }
}
