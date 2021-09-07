

1.1 [Introdução](#introdução)<br>
1.2 [Primeiro programa Java : imprimindo o "Olá Mundo"](#primeiro-programa-java)<br>
&nbsp;&nbsp;&nbsp;&nbsp; 1.2.1 [Declarando uma classe](#declarando-uma-classe)<br>
&nbsp;&nbsp;&nbsp;&nbsp; 1.2.2 [Nomes e identificadores de classe](#nomes-e-identificadores-de-classe)<br>
&nbsp;&nbsp;&nbsp;&nbsp; 1.2.3 [Corpo de classe](#corpo-de-classe)<br>
&nbsp;&nbsp;&nbsp;&nbsp; 1.2.4 [Declarando um método](#declarando-um-método)<br>
&nbsp;&nbsp;&nbsp;&nbsp; 1.2.5 [Gerando saída com System.out.println](#gerando-saída)<br>
1.3 [Entrada de dados apartir da classe Scanner](#entrada-de-dados-apartir-da-classe-scanner)<br>
&nbsp;&nbsp;&nbsp;&nbsp; 1.3.1 [Declaração import](#declaração-import)<br>
&nbsp;&nbsp;&nbsp;&nbsp; 1.3.2 [Declarando e criando um Scanner](#declarando-e-criando-um-scanner)<br>
&nbsp;&nbsp;&nbsp;&nbsp; 1.3.3 [Declarando variáveis para armazenar números inteiros](#declarando-variáveis-para-armazenar-números-inteiros)<br>
&nbsp;&nbsp;&nbsp;&nbsp; 1.3.4 [Obtendo um int como entrada do usuário](#obtendo-um-int-como-entrada-do-usuário)<br>


# Introdução 

Neste documento, será apresentado a programação de app Java, começaremos com exemplos básicos, até problemas mais complexos. Se preferir utilizar um ambiente de desenvolvimento integrado(integrated development environment - IDE) - existem ótimas opções, como, Eclipse, Intellij IDEA e o NetBeans o qual, eu gosto de utilizar, mas fica a seu critério.<br><br>

[Download Eclipse](https://www.eclipse.org/downloads/packages/installer)<br>
[Download Intellij](https://www.jetbrains.com/pt-br/idea/download/#section=windows)<br>
[Download NetBeans](https://netbeans.apache.org/download/index.html)

# Primeiro programa Java

![imga](https://github.com/SamuelCaitano/Java/blob/main/Tutorial/imagens/img01_OlaMundo.png)

BOA PRÁTICA DE PROGRAMAÇÃO :+1::green_book:|
:--------------------------- |
Algumas organizações exigem que todo programa comece com um comentário, informando o objetivo e o autor dele, data e a hora que foi modificado pela última vez. A medida que for escrevendo novos códigos, mantenha os comentários atualizados. Comente apenas o necessário|
## ***Declarando uma classe***
```public class Intro```

Na linha 1, temos a declaração da **classe Intro**, todo programa consiste em pelo menos uma classe, deve ser definido desta forma:<br><br> 
Exemplo: **NomeDaClasse**<br>

## ***Nomes e identificadores de classe***
<code>value ! Value</code>

Por convenção, os nomes de classes apresenta a letra inicial de cada palavra que eles incluem em maiúscula e o restante minúsculo.
O Java faz **distinção entre maiúscolas e minúsculas** - são diferentes - assim, *value e Value* são identificadores diferentes (mas ambos válidos) 

## ***Corpo de classe***
A **chave esquerda** (como na linha 2), **{** , inicia o **corpo** de cada declaração. Uma **chave direita** correspondente (na linha 8), **}** , termina cada declaração de classe

ERRO COMUM DE PROGRAMAÇÃO :-1::closed_book:|
:--------------------------- |
 Esquecer um dos delimitadores causa **erro de sintaxe**

## ***Declarando um método***
  <code>public static void main(String[] args)</code>
  
É o ponto de partida de cada app Java. Os parênteses depois do indentificador *main* indicam que ele é um **método**.
A palavra-chave **void** indica que esse método *não* retornará nenhuma informação.
As chaves esquerda e direita nas linhas 5 e 7, delimitam o **corpo da declaração do método**.

## ***Gerando saída***
<code>System.out.println("Olá Mundo!");</code>

Exibe os caracteres contidos entre as aspas dupla (mas as aspas não serão exibidas). Espaços em branco não serão ignorados pelo compilador.
O método **System.out.println** exibe (ou imprime) uma linha de texto. Não podemos nos esquecer de colocar o **ponto e vírgula(;)** no final da instrução.

# Entrada de dados apartir da classe Scanner
Nosso proxímo porgrama lê dois **inteiros**, digitados por um usuário no teclado, calcula sua soma e a exibe.

![](https://github.com/SamuelCaitano/Java/blob/main/Tutorial/ex05_EntradaDoTeclado/img02_EntradaDeDados.png)

## ***Declaração import***
<code>import java.util.Scanner;</code>

Ponto forte do Java é seu rico conjunto de classes predefinidas que você pode **reutilizar** em vez de "reinventar a roda".
Essas classes são agrupadas em **pacotes** - chamadas de  **bibliotecas de classes Java**, ou **Java Programming Interface (Java API)**.<br>
É uma **declaracão import** que ajuda o compilador a localizar um classe utilizada nesse programa

ERRO COMUM DE PROGRAMAÇÃO :-1::closed_book:|
:--------------------------- |
 Esquecer de incluir uma declaração **import** resulta em erro de cmpilação
 
ERRO COMUM DE PROGRAMAÇÃO :-1::closed_book:|
:--------------------------- |
 Todas as declarações **import** devem aparecer antes da primeira declaração da classe no programa. Incluir dentro ou depois de uma declaração de classe é um erro de sintaxe.

## ***Declarando e criando um Scanner***
<code>Scanner input = new Scanner(System.in)</code>

Na linha 11 é uma **instrução de declaração de váriavel** que especifica o nome (*input*) e o tipo (*Scanner*) de uma váriavel utlizada nesse programa. Um **Scanner** permite leitura de dados (por exemplo, números e strings).
O sinal de  igual (=) indica que a váriavel Scanner Input deve se **inicializada**. A palavra-chave **new** cria um objeto Scanner. O **objeto de entrada padrão, System in**, permite a leitura de *bits* de informações digitados pelo usúario.


## ***Declarando variáveis para armazenar números inteiros***

As instruções de declaração de variável nas linhas 13 a 15

![](https://github.com/SamuelCaitano/Java/blob/main/Tutorial/imagens/variaveis-int-01.png)

declaramos que as variáveis num1, num2 e soma armaznam dados do tipo **int** - elas podem armazenar valores *inteiros* (exemple: 23, -1129, 0). Essas variáveis ainda não são inicializadas. O intervalo para um **int** é **-2.147.483.648** a **+2.147.483.647**.

```OBS:``` os valores *int* que você usa em um programa não podem conter postos.

Veremos mais sobre **tipos primitivos** mais a frente. As linha 13 a 15 também podem ser escritas como:

![](https://github.com/SamuelCaitano/Java/blob/main/Tutorial/imagens/variaveis-int-02.png)

Sendo as do mesmo tipo de dado, basta separá-las por vírgula.

BOA PRÁTICA DE PROGRAMAÇÃO :+1::green_book:|
:--------------------------- |
Declarar cada variável com sua própria declaração permite que um comentário descritivo seja inserido, de modo geral torna o código fácil de ler|

BOA PRÁTICA DE PROGRAMAÇÃO :+1::green_book:|
:--------------------------- |
Escolher nomes de variáveis signifcativas ajuda o programa a ser autodocumentado(diminuindo a quantidade excessivo de comentários)|

BOA PRÁTICA DE PROGRAMAÇÃO :+1::green_book:|
:--------------------------- |
Por convenção, identificadores de nomes de variáveis iniciam com letra mínuscula e cada palavra após a primeira palavra começa com uma letra maiúscula. Exemplo: ```nomeCompleto```|

## ***Obtendo um int como entrada do usuário***
Nas linhas 18 e 21

![](https://github.com/SamuelCaitano/Java/blob/main/Tutorial/imagens/obtendo-entrada.png)

utiliza o método **nexInt** do valor do input do objeto Scanner para obter um inteiro digitado peloo usúario. Nesse momento o programa aguarda que usúario digite o número e tecla *Enter*.

Nosso programa assume que o usúario insere um valor válido de inteiro. Se não, um erro de lógica em tempo de execução ocorrerá. Mais a frente veremos sobre **Tratamento de exeção**.

A instrução inteira ```input.nextInt();``` apartir do **operador binário** ```=``` atribui um valor a váriavel.












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
