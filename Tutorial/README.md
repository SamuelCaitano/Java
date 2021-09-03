<h1>1.1 Introdução</h1>
Neste documento, será apresentado a programação de app Java, começaremos com exemplos básicos, até problemas mais complexos. Se preferir utilizar um ambiente de desenvolvimento integrado(integrated development environment - IDE) - existem ótimas opções, como, Eclipse, Intellij IDEA e o NetBeans o qual, eu gosto de utilizar, mas fica a seu critério.<br><br>

[Download Eclipse](https://www.eclipse.org/downloads/packages/installer)<br>
[Download Intellij](https://www.jetbrains.com/pt-br/idea/download/#section=windows)<br>
[Download NetBeans](https://netbeans.apache.org/download/index.html)

<h1>1.2 Primeiro programa Java: imprimindo o "Olá Mundo"</h1>

![imga](https://github.com/SamuelCaitano/Java/blob/main/Tutorial/img/img01_OlaMundo.png)
Na linha




# Aritmética
A maioria dos programas realizam cálculos aritméticos.
## Parênteses para agrupar subexpressôes
Os parênteses são utilizados para agrupar termos em expressões Java. Exemplo, para multiplicar ***a*** pela quatidade de ***b + c*** escrevemos <br><br>
**a * (b + c)** <br><br>
Se uma expressão contiver **parênteses aninhados**, como <br><br>
**((a + b) * c)** <br><br>
a expressão no conjunto *mais interno* dentro dos parênteses (a+ b, nesse caso) é avalidada *primeiro*
## Regras de precedência de operador
O Java aplica os operadores em expressões aritméticas em uma sequência precisa determinada pela seguintes regras de prêcedencia, que são geralmente as mesmas que aquelas seguidas em álgebra:
<ol>
  <li> As operações de multiplicação, divisão e de resto são aplicados primeiro, da esquerda para a direita. Possuem o mesmo nível de precedência.</li>
  <li> As operações de adção e subtração são aplicadas em seguida, da esquerda para a direita. Possuem o mesmo nível de precedência.</li>
 </ol>
