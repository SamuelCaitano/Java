package automovel;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.SourceVersion;

public class Carro extends Automovel implements Pedais, Chave, Portas, Sinalizacao {

    // atributos
    public int marchaAtual;
    public int velocidadeMax;
    public int velocidadeAtual;
    public boolean portas;
    public boolean portaDianteiraDireto;
    public boolean portaDianteiraEsquerdo;
    public boolean portaTraseiraDireito;
    public boolean portaTraseiraEsquedo;
    public boolean portaMalas;
    public boolean despararAlarme;
    public int piscaAlerta;
    protected float qtdAbastecerTanque;
    public float dinheiro;
    public float litros;

    // Construtor
    public Carro() {
        this.alarme = true;

    }// fim do método construtor

    // metodo para travar o alarme do carro
    @Override
    public void ligarAlarme() {
        if (this.alarme == true) { // verifica se o valor de alarme é igual a true
            System.out.println("O alarme já está ligado ");
            this.piscaAlerta();
            System.out.println("---------------");
        } else { // executa se o valor de alarme for false
            this.alarme = true; // alarme recebe true
            this.somAlarme();// chama o método somAlarme
            this.travarPortas(); // chama o método travarPortas()
            this.subirVidros(); // chama o método subirVidros()
            System.out.println("Você ligou o alarme do carro ");
            System.out.println("---------------");
        }
    }// fim do método ligarAlarme()

    // metodo para destravar o alarme e carro
    @Override
    public void desligarAlarme() {
        if (this.alarme == false) { // executa se o valor for false
            System.out.println("O alarme já está desligado ");
            System.out.println("---------------");
        } else { // executa se o valor de alarme for true
            this.alarme = false; // alarme recebe false
            this.somAlarme(); // chama o método somAlarme
            this.destravarPortas(); // chama o método destravarPortas
            System.out.println("Você desligou o alarme do carro, as portas foram destravadas ");
            System.out.println("---------------");
        }
    } // fim do método desligarAlarme

    // método para fazer o som do alarme
    @Override
    public void somAlarme() {
        if (this.alarme == true) {
            System.out.println("BiBi");
        } else {
            System.out.println("Bi");
        } // fim da instrução de seleção if else
    } // fim do método somAlarme

    // método para fazer o som do alarme desparado
    @Override
    public void despararAlarme() {
        if (this.despararAlarme == true) {
            while (this.despararAlarme == true) {
                System.out.print("Bi");
                try {
                    new Thread().sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }// fim do método despararAlarme

    // método para travar as portas
    @Override
    public void travarPortas() {
        this.portas = true;
        System.out.println("A porta está travada");
    }// fim do método travarPortas

    // método para destravar as portas
    @Override
    public void destravarPortas() {
        this.portas = false;
        System.out.println("A porta está destravada");
    }// fim do método destravarPortas

    @Override
    public void subirVidros() {
        this.subirVidroFrenteDireito();
        this.subirVidroAtrasDireito();
        this.subirVidroFrenteEsquerdo();
        this.subirVidroAtrasEsquedo();
    }

    private void subirVidroFrenteEsquerdo() {
        
    }

    public void subirVidroFrenteDireito() {

    }

    public void subirVidroAtrasDireito() {
    }

    private void subirVidroAtrasEsquedo() {

    }

    // metodo para abrir o porta malas
    @Override
    public void abrirPortaMalas() {
        this.portaMalas = true;
        System.out.println("O porta-malas está aberto");
    }// fim do método abrirPortaMalas

    // metodo para ligar o carro
    @Override
    public void ligar() {
        if (this.alarme == true) {
            System.out.println("Status: O carro está travado, destrave-o para poder ligar ");
        } else {
            if (this.ligado == true) {
                System.out.println("Status: O carro já está ligado ");
            } else {
                System.out.println("Status: O carro está desligado ");
                this.ligado = true;
                System.out.println("Você ligou o carro ");
            }
        }
    }

    @Override
    public void desligar() {
        if (ligado == false) {
            System.out.println("O carro já está desligado ");
        } else {
            System.out.println("STATUS: O carro está ligado ");
            this.ligado = false;
            System.out.println("Você desligou o carro ");
        }
    }

    // metodo para aumentar a velocidade
    @Override
    public void aumentarVelocidade() {
        if (velocidadeAtual == velocidadeMax) {
            System.out.println("Velocidade maxima já atingida ");
        } else if (velocidadeAtual >= 0) {
            velocidadeAtual += 10;
            this.setVelocidadeAtual(this.getVelocidadeAtual() + 10);
            System.out.println("A velocidade do carro está em " + velocidadeAtual + "km/h");
            if (this.velocidadeAtual >= 10) {
                System.out.println("Travamento aumomatico das postas ");
            }
        }
    }

    @Override
    public void diminuirVelocidade() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 10;
            System.out.println("A velocidade do carro está em " + velocidadeAtual + "km/h");
        } else {
            System.out.println("O carro já está parado");
            velocidadeAtual = 0;
        }
    }// fim do métomo diminuirVelocidade

    // método para pisar na embreagem
    @Override
    public void pisarEmbreagem() {
        if (embreagem == true) {
            System.out.println("Você já está pisado na embreagem");
        } else {
            this.embreagem = true;
            System.out.println("Você pisou na embreagem");
        }
    }// fim do método pisarEmbreagem

    // método para soltar a embreagem
    @Override
    public void soltarEmbreagem() {
        if (embreagem == false) {
            System.out.println("Você não está pisado na embreagem");
        } else {
            this.embreagem = false;
            System.out.println("Você tirou o pé da embreagem");
        }
    }// fim do método soltarEmbreagem

    void MarchaCima() {
        if (marchaAtual == marchas) {
            System.out.println("Você já está na " + marchaAtual + "º marcha, que é a ultima marcha");
        } else {
            marchaAtual++;
            System.out.println("Você passou a marcha para a " + marchaAtual + "º marcha");
        }
    }

    void MarchaBaixo() {
        if (marchaAtual == 0) {
            System.out.println("A marcha está no neutro");
        } else if (marchaAtual <= marchas) {
            marchaAtual--;
            System.out.println("Você está na " + marchaAtual + "º marcha");
        }
    }

    @Override
    public void abaixarVidros() {

    }

    @Override
    public void abrirPortas() {

    }

    @Override
    public void fecharPortas() {

    }

    @Override
    public void setaDireita() {

    }

    @Override
    public void setaEsquerda() {

    }

    // método para indicar o pisca alerta do carro
    @Override
    public void piscaAlerta() {
        if (piscaAlerta == 1) {
            System.out.println("piscando..");// pisca uma vez para indicar que está ligando ou desligando o alarme
        } else {
            do {
                System.out.println("piscando");// pisca quando aciona o alerta ou viola-se o carro
            } while (piscaAlerta > 1);
        }
    } // fim do método piscaAlerta

    @Override
    public void luzDeRe() {
        System.out.println("Luz de ré acesa");
    }

    @Override
    public void LuzDeFreio() {
        System.out.println("Farol de freio aceso");
    }

    @Override
    public void farolBaixo() {

    }

    @Override
    public void farolAlto() {

    }

    @Override
    public void bozina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getQtdAbastecerTanque() {
        return qtdAbastecerTanque;
    }

    public void setQtdAbastecerTanque(float qtdAbastecerTanque) {
        this.qtdAbastecerTanque = qtdAbastecerTanque;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isPortaDianteiraDireto() {
        return portaDianteiraDireto;
    }

    public void setPortaDianteiraDireto(boolean portaDianteiraDireto) {
        this.portaDianteiraDireto = portaDianteiraDireto;
    }

    public boolean isPortaDianteiraEsquerdo() {
        return portaDianteiraEsquerdo;
    }

    public void setPortaDianteiraEsquerdo(boolean portaDianteiraEsquerdo) {
        this.portaDianteiraEsquerdo = portaDianteiraEsquerdo;
    }

    public boolean isPortaTraseiraDireito() {
        return portaTraseiraDireito;
    }

    public void setPortaTraseiraDireito(boolean portaTraseiraDireito) {
        this.portaTraseiraDireito = portaTraseiraDireito;
    }

    public boolean isPortaTraseiraEsquedo() {
        return portaTraseiraEsquedo;
    }

    public void setPortaTraseiraEsquedo(boolean portaTraseiraEsquedo) {
        this.portaTraseiraEsquedo = portaTraseiraEsquedo;
    }

    public boolean isPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(boolean portaMalas) {
        this.portaMalas = portaMalas;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

} // fim da classe Carro
