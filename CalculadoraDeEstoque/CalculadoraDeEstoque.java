package CalculadoraDeEstoque;

import java.util.Scanner;

public class CalculadoraDeEstoque {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Entre com o 1 num: ");
    double livroJava8 = input.nextDouble();
    System.out.print("Entre com o 2 num: ");
    double livroTDD = input.nextDouble();


    double soma = livroJava8 + livroTDD;

    System.out.println("O total em estoque é " + soma);

    if (soma < 150)
      System.out.println("Seu estoque está muito baixo!");
    else if (soma > 2000)
      System.out.println("Seu estoque está muito alto!");
    else
      System.out.println("Seu estoque está bom");

      int contador = 0;
      double somatorio = 0;

    while (contador < 9 ) {
      double valorDoLivro = 59.90;
      somatorio += valorDoLivro;

      contador++;
    }

    System.out.println("contador = " + contador + ", somatorio = " + somatorio);

    // for (double i = 0; i < contador; i++) {
      
    //   System.out.println(i + "* vez");
    // }
  }
}
