package automovel;

public  interface Sinalizacao {
    void setaDireita();
    void setaEsquerda();
    void piscaAlerta(int num);
    void luzDeRe();
    void LuzDeFreio();
    void farolBaixo();
    void farolAlto();
    void bozina();
    void somAlarme();
    void despararAlarme();    
}