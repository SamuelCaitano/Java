package automovel;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.SourceVersion;

public class CarroEletrico extends Automovel implements Pedais, Chave, Portas, Sinalizacao, Seguranca, TetoPanoramico, Cambio {

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
        this.alarme = true;
        this.portas = true;
        this.portaMalas = true;
        this.TampaCarregador = true;
        this.sintoSeguranca = false;
        this.chavePresenca = false;
        this.velocidadeAtual = 0;
        this.velocidadeMax = 250;
        this.tetoPanoramico = true;
        this.tetoBloqueado = true;
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
        if (this.alarme == true && this.portas == true){
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
        if (this.marcha == 'R'){
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
        if(ligado == true)
        System.out.println("O farol alto foi ativado");
    }

    @Override
    public void bozina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        this.sintoSeguranca = true;
        System.out.println("Você colocou o sinto");
        System.out.println("---------------");
    }

    @Override
    public void retirarSintoSegurança() {
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
