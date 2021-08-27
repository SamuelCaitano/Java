package automovel;

/**
 *
 * @author smlca
 */
public abstract class Automovel {
    
    // Atributos
    protected int renavan;
    protected String placa;
    protected String chassi;
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    protected String cor;
    protected boolean TipoCombustivel;
    protected int capacidadeTanque;
    protected char cambio;
    protected int marchas;
    protected int qtdPortas;
    protected boolean embreagem;
    protected boolean acelerador;
    protected boolean freio;
    
    protected boolean ligado;
    protected boolean alarme;
    protected double kmPorLitro;
    
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

    public boolean isTipoCombustivel() {
        return TipoCombustivel;
    }

    public void setTipoCombustivel(boolean TipoCombustivel) {
        this.TipoCombustivel = TipoCombustivel;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public char getCambio() {
        return cambio;
    }

    public void setCambio(char cambio) {
        this.cambio = cambio;
    }
    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }
    
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
    public double getKmPorLitro() {
        return kmPorLitro;
    }

    public void setKmPorLitro(double kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
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
