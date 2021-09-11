package automovel;

/**
 *
 * @author Samuel Caitano
 */
public abstract class Automovel {

    // Atributos
    protected double renavan;
    protected String placa = "MGD-4480";
    protected String chassi;
    protected String marca = "Tesla";
    protected String categoria = "Esportivo";
    protected String modelo = "Model Mark X";
    protected int anoFabricacao = 2022;
    protected String cor = "Branco";
    protected int autonomia = 620;
    protected int velocidadeMax = 250;
    protected char marcha;
    protected int qtdPortas = 4;
    protected int qtdAssentos = 5;
    protected boolean TampaCarregador;
    protected boolean acelerador;
    protected boolean freio;
    protected boolean setaDireita;
    protected boolean setaEsquerda;
    protected boolean ligado;
    protected boolean alarme;

    @Override
    public String toString() {
        return "Automovel{" + "\nrenavan = " + renavan + "\nplaca = " + placa + "\nchassi = " + chassi + "\nmarca = " + marca + "\ncategoria = " + categoria 
                + "\nmodelo = " + modelo + "\nanoFabricacao =" + anoFabricacao + "\ncor = " + cor + "\nautonomia = " + autonomia + "\nqtdPortas = " + qtdPortas + "\nqtdAssentos = " + qtdAssentos + '}';
    }
    

    // Métodos Especiais

    public double getRenavan() {
        return renavan;
    }

    public void setRenavan(double renavan) {
        this.renavan = renavan;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public char getMarcha() {
        return marcha;
    }

    public void setMarcha(char marcha) {
        this.marcha = marcha;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getQtdAssentos() {
        return qtdAssentos;
    }

    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }

    public boolean isTampaCarregador() {
        return TampaCarregador;
    }

    public void setTampaCarregador(boolean TampaCarregador) {
        this.TampaCarregador = TampaCarregador;
    }

    public boolean isAcelerador() {
        return acelerador;
    }

    public void setAcelerador(boolean acelerador) {
        this.acelerador = acelerador;
    }

    public boolean isFreio() {
        return freio;
    }

    public void setFreio(boolean freio) {
        this.freio = freio;
    }

    public boolean isSetaDireita() {
        return setaDireita;
    }

    public void setSetaDireita(boolean setaDireita) {
        this.setaDireita = setaDireita;
    }

    public boolean isSetaEsquerda() {
        return setaEsquerda;
    }

    public void setSetaEsquerda(boolean setaEsquerda) {
        this.setaEsquerda = setaEsquerda;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }    
}