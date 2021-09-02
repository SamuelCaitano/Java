public class CaracteresDeEscape 
{

    public static void main(String[] args) 
    {
        // Algumas sequências de escape comuns
        System.out.println("\\n = Nova linha. Posiciona o cursor no início da próxima linha");
        System.out.println("\\t = Tabulação. Move o cursdor para a próxima parada de tabulação");
        System.out.println("\\r = Retorno do carro. Posiciona o cursor no início da linha atual,\n"
                + "Qualquer saída de caracteres depois do retorno do carro sobrescreve a saída de caracteres gerada anteriormente");
        System.out.println("\\\\ = Barras invertidas. Imprime um caractere de barra invertida");
        System.out.println("\\\" = Aspas duplas. Imprime um caractere de aspas duplas");
    }    
}
