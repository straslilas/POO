/*
- Atributos necessários: int temporizadorEmSeg; boolean porta;
- Métodos necessários: ligar; desligar; abrirPorta; fecharPorta; avisoTempo;s
*/

public Microondas {
    private int temporizadorEmSeg;
    private boolean porta;

    public Microondas {
        int temporizadorEmSeg = 0;
        boolean porta = false; 
    }

    public String ligar (tempoSeg) {
        if (porta == false) {
            temporizadorEmSeg = tempoSeg;
            return "Ligando o forno por: " + Integer.toString(tempoSeg) + "segundos.";
        else {
            return "Feche a porta antes de ligar";
        }
        }
    }

    public String desligar () {
       temporizadorEmSeg = 0;
       return "Desligado."
    }

    public String abrirPorta () {
        if (temporizadorEmSeg == 0 && porta = false) {
            porta = true;
            return "Abrindo porta..";
        }
        else {
            return "Desligue antes de abrir.";
        }
    }

    public String fecharPorta () {
        if (porta == true) {
            porta = false;
            return "Fechando porta..";
        }
        else {
            return "Porta fechada.s"
        }
    }
}