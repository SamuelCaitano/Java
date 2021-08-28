package automovel;

/**
 *
 * @author Samuel Caitano
 */
public abstract class Automovel {

    // Atributos
    protected int renavan;
    protected String placa;
    protected String chassi;
    protected String marca;
    protected String categoria;
    protected String modelo;
    protected int anoFabricacao;
    protected String cor;
    protected int autonomia;
    protected char marcha;
    protected int qtdPortas;
    protected int qtdBancos;
    protected boolean TampaCarregador;
    protected boolean acelerador;
    protected boolean freio;
    protected boolean tetoPanoramico;
    protected boolean setaDireita;
    protected boolean setaEsquerda;
    protected boolean ligado;
    protected boolean alarme;

    // Métodos Especiais

    public int getRenavan() {
        return renavan;
    }

    public void setRenavan(int renavan) {
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

    public int getQtdBancos() {
        return qtdBancos;
    }

    public void setQtdBancos(int qtdBancos) {
        this.qtdBancos = qtdBancos;
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

    public boolean isTetoPanoramico() {
        return tetoPanoramico;
    }

    public void setTetoPanoramico(boolean tetoPanoramico) {
        this.tetoPanoramico = tetoPanoramico;
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