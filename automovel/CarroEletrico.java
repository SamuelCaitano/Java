package automovel;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.SourceVersion;

public class CarroEletrico extends Automovel implements Pedais, Chave, Portas, Sinalizacao, Seguranca {

    // atributos
    public int velocidadeMax;
    public int velocidadeAtual;
    public boolean portas;
    public boolean portaDianteiraDireto;
    public boolean portaDianteiraEsquerdo;
    public boolean portaTraseiraDireito;
    public boolean portaTraseiraEsquedo;
    public boolean portaMalas;
    public boolean travaPortas;
    public boolean despararAlarme;
    public int piscaAlerta;
    protected boolean freio;
    //protected float qtdAbastecerTanque;
    //public float dinheiro;
    //public float litros;

    // Construtor
    public CarroEletrico() {
        this.alarme = true;
        this.portas = true;
        this.portaMalas = true;
        this.TampaCarregador = true;
        this.velocidadeAtual = 0;
        this.velocidadeMax = 250;

    }

    // metodo para travar o alarme do carro
    @Override
    public void ligarAlarme() {
        if (this.alarme == true) { // verifica se o valor de alarme é igual a true
            this.piscaAlerta(1);
            System.out.println("O alarme já está ligado ");
            System.out.println("---------------");
        } else { // executa se o valor de alarme for false
            this.alarme = true; // alarme recebe true
            this.somAlarme();// chama o método somAlarme
            this.piscaAlerta(1);
            this.travarPortas(); // chama o método travarPortas()
            this.subirVidros(); // chama o método subirVidros()
            System.out.println("Você ligou o alarme do carro ");
            System.out.println("---------------");
        }
    }

    // metodo para destravar o alarme e carro
    @Override
    public void desligarAlarme() {
        if (this.alarme == false) { // executa se o valor for false
            this.piscaAlerta(1);
            System.out.println("O alarme já está desligado ");
            System.out.println("---------------");
        } else { // executa se o valor de alarme for true
            this.alarme = false;
            this.somAlarme(); // chama o método somAlarme
            this.piscaAlerta(1); //
            this.destravarPortas(); // chama o método destravarPortas
            this.ligado = true;
            System.out.println("Você desligou o alarme do carro, as portas foram destravadas ");
            System.out.println("---------------");
        }
    }

    // método para fazer o som do alarme
    @Override
    public void somAlarme() {
        if (this.alarme == true) {
            System.out.println("BiBi");
        } else {
            System.out.println("Bi");
        }
    }

    // método para fazer o som do alarme desparado
    @Override
    public void despararAlarme() {
        if (this.despararAlarme == true) {
            while (this.despararAlarme == true) {
                System.out.print("Bi");
                try {
                    new Thread().sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CarroEletrico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    // método para travar as portas
    @Override
    public void travarPortas() {
        if (portas == true) {
            System.out.println("A porta já está travada");
            System.out.println("---------------");
        } else {
            this.portas = true;
            System.out.println("A porta foi travada");
            System.out.println("---------------");
        }
    }

    // método para destravar as portas
    @Override
    public void destravarPortas() {
        if (portas == false) {
            System.out.println("A porta já está destravada");
            System.out.println("---------------");
        } else {
            this.portas = false;// as portas foram destravadas
            System.out.println("A porta foi destravada");
            System.out.println("---------------");
        }
    }

    // metodo para abrir o porta malas
    @Override
    public void abrirPortaMalas() {
        if (portaMalas == false) {
            System.out.println("O porta-malas já está aberto");
            System.out.println("---------------");
        } else {
            this.portaMalas = false; // o porta malas foi aberto
            System.out.println("O porta-malas foi aberto");
            System.out.println("---------------");
        }
    }

    @Override
    public void fecharPortaMalas() {
        if (portaMalas == true) {
            System.out.println("O porta-malas já está fechado");
            System.out.println("---------------");
        } else {
            this.portaMalas = true; // o porta malas foi fechado
            System.out.println("O porta-malas foi fechado");
            System.out.println("---------------");
        }
    }

    // método para fechar os vidros
    @Override
    public void subirVidros() {
        this.subirVidroFrenteDireito();
        this.subirVidroAtrasDireito();
        this.subirVidroFrenteEsquerdo();
        this.subirVidroAtrasEsquedo();
    }

    // métodos dos vidros
    public void subirVidroFrenteEsquerdo() {
        System.out.println("Subindo o vidro esquerdo da frente ");
    }

    public void subirVidroFrenteDireito() {
        System.out.println("Subindo o vidro direito da frente ");
    }

    public void subirVidroAtrasDireito() {
        System.out.println("Subindo o vidro esquerdo de trás ");
    }

    public void subirVidroAtrasEsquedo() {
        System.out.println("Subindo o vidro esquerdo de trás ");
    }

    // método para abaixar os vidros
    @Override
    public void abaixarVidros() {

    }

    // método para aumentar a velocidade
    @Override
    public void pisarAcelerador() {
        if (ligado == true) {
            if (portas = true) {
                acelerador = true;
                if (velocidadeAtual == velocidadeMax) {
                    System.out.println("Velocidade maxima já atingida ");
                    System.out.println("---------------");
                } else if (velocidadeAtual >= 0) {
                    velocidadeAtual += 10;
                    System.out.println("A velocidade do carro está em " + velocidadeAtual + "km/h");
                    System.out.println("---------------");

                }
                if (velocidadeAtual >= 10 && portas == false) {
                    System.out.println("Travamento automático das postas");
                    System.out.println("---------------");
                }
            } else {
                System.out.println("Alguma porta está aberta");
            }
        } else {
            System.out.println("O carro está desligado, ligue-o primeiro");
            System.out.println("---------------");
        }
    }

    // método para diminuir a velocidade
    @Override
    public void pisarFreio() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 10;
            System.out.println("A velocidade do carro está em " + velocidadeAtual + "km/h");
            System.out.println("---------------");
        } else {
            System.out.println("O carro já está parado");
            velocidadeAtual = 0;
            System.out.println("---------------");
        }
    }

    @Override
    public void abrirPortas() {

    }

    @Override
    public void fecharPortas() {

    }

    // método para piscar a seta da direita
    @Override
    public void setaDireita() {
        if (setaEsquerda == true) {
            setaEsquerda = false;
            System.out.println("desativando seta da esquerda");
            System.out.println("---------------");
            System.out.println("Piscando seta da direita");
        } else {
            System.out.println("Piscando seta da direita");
        }
    }

    // método para piscar a seta da direita
    @Override
    public void setaEsquerda() {
        if (setaDireita == true) {
            setaDireita = false;
            System.out.println("desativando seta da direita");
            System.out.println("---------------");
            System.out.println("Piscando seta da esquerda");
        } else {
            System.out.println("Piscando seta da esquerda");
        }
    }

    // método para indicar o pisca alerta do carro
    @Override
    public void piscaAlerta(int num) {
        if (num == 1) {
            System.out.println("piscando 1 vez..");// pisca uma vez para indicar que está ligando ou desligando o alarme
        } else {
            do {
                System.out.println("piscando");// pisca quando aciona o alerta ou viola-se o carro
            } while (num > 1);
        }
    }

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

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

    @Override
    public void soltarAcelerador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void soltarFreio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void colocarSintoSegurança() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void retirarSintoSegurança() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

} // fim da classe Carro
