public class Microondas {
    private int temporizadorEmSegundos;
    private boolean porta;

    public Microondas () {
        temporizadorEmSegundos = 0;
        porta = false;
    }

    public String ligar (int tempoSeg) {
        if (porta == false) {
            temporizadorEmSegundos = tempoSeg;
            return "Ligado por " + Integer.toString(tempoSeg) + " segundos";
        }
        else {
            return "Favor fechar a porta antes de inciar";
        }        
    }

    public String desligar () {
        temporizadorEmSegundos = 0;
        return "Microondas desligado.";
    }

    public String abrirPorta () {
        if (porta == false) {
            porta = true;
            return "Porta aberta com sucesso";
        }
        else {
            return "Porta já se encontra aberta";
        }
    }

    public String fecharPorta () {
        if (porta == true) {
            porta = false;
            return "Porta fechada com sucesso";
        }
        else {
            return "Porta já se encontra fechada";
        }
    }
}