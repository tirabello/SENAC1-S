
package caracoroa;
import java.util.Scanner;
import java.util.Random;

public class CaraCoroa {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random rand = new Random ();
        
        int Jogador;
        int Pc;
        int ganhou = 0;
        int contador = 1;
        
        while(contador <6){
            System.out.println("\nRODADA " + contador);
            System.out.println("Qual voce escolhe?");
            System.out.println("0 - CARA");
            System.out.println("1 - COROA");
            Jogador = scan.nextInt();
            if(Jogador<0 || Jogador>1){
            System.out.println("\nResposta invalida");
            }else{

                Pc = rand.nextInt(2);
                if(Pc == 0){
                    System.out.println("\nPC escolheu CARA");
                }
                else if(Pc == 1){
                    System.out.println("\nPC escolheu COROA");
                }

                switch(Jogador){
                    case 0:
                        if(Jogador == Pc){
                            System.out.println("\nVoce ganhou a rodada");
                            ganhou++;
                        }
                        else{
                            System.out.println("\nVoce perdeu");
                        }
                    break;
                    case 1:
                        if(Jogador == Pc){
                            System.out.println("\nVoce ganhou a rodada");
                            ganhou++;
                        }
                        else{
                            System.out.println("\nVoce perdeu");
                        }
                    break;
                }
                contador ++;
            }
        }
        System.out.println("\nVoce venceu " + ganhou + " partidas");
              
    }  
}
