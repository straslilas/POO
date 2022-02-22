import java.util.Scanner;
public class App {
    public static void main (String[] args) throws Exception {
    int tempoSeg;
    Scanner teclado = new Scanner (System.in);
    System.out.println("ESCOLHA UMA OPÇÃO");
    System.out.println("1 - ABRIR A PORTA DO FORNO");
    System.out.println("2 - FECHAR A PORTA DO FORNO");
    System.out.println("3 - LIGAR O FORNO");
    System.out.println("4 - DESLIGAR/PAUSAR O FORNO");
    System.out.println("5 - FINALIZAR");
    int menu = teclado.nextInt;
    Microondas microondas = new Microondas () {
           switch (menu) {
               case 1:
               menu.abrirPorta();
           }
    }
    }
}
}