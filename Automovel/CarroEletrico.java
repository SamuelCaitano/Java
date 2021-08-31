package automovel;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.SourceVersion;

public class CarroEletrico extends Automovel implements Pedais, Chave, Portas, Sinalizacao, Seguranca, TetoPanoramico, Cambio, Vidros {

    // atributos    
    int velocidadeAtual;
    boolean portas;
    boolean portaDianteiraDireto;
    boolean portaDianteiraEsquerdo;
    boolean portaTraseiraDireito;
    boolean portaTraseiraEsquedo;
    boolean vidroFrenteDireito;
    boolean vidroFrenteEsquerdo;
    boolean vidroAtrasDireito;
    boolean vidroAtrasEsquerdo;
    boolean portaMalas;
    boolean luzPortaMalas;
    boolean travaPortas;
    boolean despararAlarme;
    boolean sintoSeguranca;
    boolean chavePresenca;
    int piscaAlerta;
    boolean tetoPanoramico;
    boolean tetoBloqueado;

    //protected float qtdAbastecerTanque;
    //public float dinheiro;
    //public float litros;
    // Construtor
    public CarroEletrico() {
        this.alarme = true; //ligado
        this.portas = true; //fechadas
        this.portaMalas = true; //fechado
        this.TampaCarregador = true; //fechado
        this.ligado = false; //desligado
        this.sintoSeguranca = false; //não conectados
        this.chavePresenca = false;
        this.velocidadeAtual = 0;
        this.tetoPanoramico = true; //fechado
        this.tetoBloqueado = true; //bloqueado
    }

    // metodo para travar as portas e ligar o alarme do carro
    @Override
    public void ligarAlarme() {
        if (this.alarme == true) { // verifica se o alarme já está ligado
            this.piscaAlerta(1);
            System.out.println("O alarme já está ligado ");
        } else { // executa se o alarme estiver desligado
            this.alarme = true;
            this.somAlarme();
            this.piscaAlerta(1);
            this.travarPortas();
            this.subirVidros();
            System.out.println("Você ligou o alarme do carro ");
        }
        System.out.println("---------------");
    }

    // metodo para destravar o alarme e carro
    @Override
    public void desligarAlarme() {
        if (this.alarme == false) { // verifica se o alarme já está desligado
            this.piscaAlerta(1);
            System.out.println("O alarme já está desligado ");
        } else { // executa se o alarme estiver ligado
            this.alarme = false;
            this.somAlarme();
            this.piscaAlerta(1);
            this.destravarPortas();
            this.ligado = true;
            System.out.println("Você desligou o alarme do carro, as portas foram destravadas ");
        }
        System.out.println("---------------");
    }

    // método para fazer o som do alarme
    @Override
    public void somAlarme() {
        if (this.alarme == true) { // executa se o alarme estiver sendo ligado
            System.out.println("BiBi");
        } else { // executa se o alarme estiver sendo desligado
            System.out.println("Bi");
        }
        System.out.println("---------------");
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
        if (portas == true) { // verificar se as portas estão travadas
            System.out.println("A porta já está travada");
        } else { // executa se as portas estiverem destravadas
            this.portas = true;
            System.out.println("A porta foi travada");
        }
        System.out.println("---------------");
    }

    // método para destravar as portas
    @Override
    public void destravarPortas() {
        if (portas == false) { // verifica se a portas já estão destravadas 
            System.out.println("As portas já estão destravadas");
        } else { // executa se as portas estiverem travadas
            this.portas = false;
            System.out.println("As portas foram destravadas");
        }
        System.out.println("---------------");
    }

    // método para abrir o porta-malas
    @Override
    public void abrirPortaMalas() {
        if (portaMalas == false) { // verfica se o porta-malas já está aberto
            System.out.println("O porta-malas já está aberto");
        } else { // executa se o porta-malas estiver fechado
            this.portaMalas = false;
            this.LuzPortaMalas();
            System.out.println("O porta-malas foi aberto");
        }
        System.out.println("---------------");
    }

    // método para acender a luz do porta-malas
    @Override
    public void LuzPortaMalas() {
        if (portaMalas == false) { // verfica se o porta-malas está aberto 
            luzPortaMalas = true;
            System.out.println("Luz do porta-malas está acessa");
        } else { // verifica se o porta-malas está fechado 
            System.out.println("Luz do porta-malas está apagada");
            System.out.println("Abra o porta-malas para acionar as luzes");
        }
        System.out.println("---------------");
    }

    // método para fechar o porta-malas
    @Override
    public void fecharPortaMalas() {
        if (portaMalas == true) { // verifica-se, o porta-malas já está fechado
            System.out.println("O porta-malas já está fechado");
        } else { // executa se o porta-malas estiver aberto
            this.portaMalas = true;
            luzPortaMalas = false;
            System.out.println("O porta-malas foi fechado");
        }
        System.out.println("---------------");
    }

    // método para fechar todos os vidros (ao ligar o alarme)
    @Override
    public void subirVidros() {
        this.subirVidroFrenteDireito();
        this.subirVidroAtrasDireito();
        this.subirVidroFrenteEsquerdo();
        this.subirVidroAtrasEsquerdo();
    }

    // métodos dos vidros
    @Override
    public void subirVidroFrenteDireito() {
        this.vidroFrenteDireito = true;
        System.out.println("Subindo o vidro direito da frente ");
    }

    @Override
    public void subirVidroFrenteEsquerdo() {
        this.vidroFrenteEsquerdo = true;
        System.out.println("Subindo o vidro esquerdo da frente ");
    }

    @Override
    public void subirVidroAtrasDireito() {
        this.vidroAtrasDireito = true;
        System.out.println("Subindo o vidro esquerdo de trás ");
    }

    @Override
    public void subirVidroAtrasEsquerdo() {
        this.vidroAtrasEsquerdo = true;
        System.out.println("Subindo o vidro esquerdo de trás ");
    }

    @Override
    public void abaixarVidroFrenteDireito() {
        this.vidroFrenteDireito = false;
        System.out.println("Abaixando o vidro direito da frente ");
    }

    @Override
    public void abaixarVidroFrenteEsquerdo() {
        this.vidroFrenteEsquerdo = false;
        System.out.println("Abaixando o vidro esquerdo da frente ");
    }

    @Override
    public void abaixarVidroAtrasDireito() {
        this.vidroAtrasDireito = false;
        System.out.println("Abaixando o vidro esquerdo de trás ");
    }

    @Override
    public void abaixarVidroAtrasEsquerdo() {
        this.vidroAtrasEsquerdo = false;
        System.out.println("Abaixando o vidro esquerdo de trás ");
    }

    // método para aumentar a velocidade
    @Override
    public void acelerar() {
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
                    portas = true;
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
    public void frear() {
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
    public void marcha(char marcha) {
        if (this.alarme == true && this.portas == true) {
            System.out.println("Entre no carro primeiro");
        } else {
            this.marcha = 'R';
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
                // adcionar uma pausa de tempo
                System.out.println("piscando");// pisca quando aciona o alerta ou viola-se o carro
            } while (num > 1);
        }
    }

    @Override
    public void luzDeRe() {
        if (this.marcha == 'R') {
            System.out.println("Luz de ré acesa");
        }
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
        if (ligado == true) {
            System.out.println("O farol alto foi ativado");
        }
    }

    @Override
    public void bozina() {
        
    }

    @Override
    public void soltarAcelerador() {
        
    }

    @Override
    public void soltarFreio() {
        
    }

    // método para a segurança do passageiro
    @Override
    public void seguranca() {
        if (sintoSeguranca == false && ligado == true) { // executa se o carro estiver ligado e o sinto não estiver conectado
            System.out.println("Coloque o sinto de segurança");
        } else
            System.out.println();
    }

    // método para colocar o sinto de segurança
    @Override
    public void colocarSintoSeguranca() {
        this.sintoSeguranca = true;
        System.out.println("Você colocou o sinto");
        System.out.println("---------------");
    }

    // método para retirar o sinto de segurança
    @Override
    public void retirarSintoSeguranca() {
        this.sintoSeguranca = false;
        System.out.println("Você retirou o sinto o sinto");
        System.out.println("---------------");
    }

    // método para abrir o teto
    @Override
    public void abrirTeto() {
        if (this.tetoBloqueado == true) { // verifica se o teto está bloqueado
            System.out.println("Desbloqueie o teto primeiro");
            System.out.println("---------------");
        } else { // executa se o teto estiver desbloqueado
            if (this.tetoPanoramico == false) { // verifica se o teto já esta aberto
                System.out.println("O teto já está aberto");
                System.out.println("---------------");
            } else { // executa se o teto estiver fechado
                this.tetoPanoramico = false;
                System.out.println("O teto foi aberto");
                System.out.println("---------------");
            }
        }
    }

    // método para fechar o teto
    @Override
    public void fecharTeto() {
        if (this.tetoPanoramico == true) { // verifica se o teto está fechado
            System.out.println("O teto já está fechado");
            System.out.println("---------------");
        } else { // executa se o teto estiver aberto
            this.tetoPanoramico = true;
            System.out.println("O teto foi fechado");
            this.bloquearTeto(); // chama o método bloquearTeto()
        }
    }

    // método para bloquear o teto
    @Override
    public void bloquearTeto() {
        if (this.tetoBloqueado == true) { // verifica se o teto está bloqueado
            System.out.println("O teto já está bloqueado");
            System.out.println("---------------");
        } else { // executa se o teto estiver desbloqueado
            this.tetoBloqueado = true;
            System.out.println("O teto foi bloqueado");
            System.out.println("---------------");
        }
    }

    // método para desbloquear o teto (trás segurança à integridade física dos passageiros)
    @Override
    public void desbloquearTeto() {
        if (this.tetoBloqueado == false) { // verifica se o teto está desbloqueado
            System.out.println("O teto já está desbloqueado");
            System.out.println("---------------");
        } else { // executa se o teto estiver bloqueado
            this.tetoBloqueado = false;
            System.out.println("O teto foi desbloqueado");
            System.out.println("---------------");
        }
    }

    // métodos Getter and Setter
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

} // fim da classe Carro
