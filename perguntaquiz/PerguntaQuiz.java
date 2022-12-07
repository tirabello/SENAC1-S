
package perguntaquiz;
import java.util.Scanner;

public class PerguntaQuiz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int LeResposta;
       boolean parar = false;

        while(parar != true){
            System.out.println("Pergunta: ");
            System.out.println("Quem foi o primeiro homem a pisar na lua? ");
            System.out.println("1) Neil ArmStrong");
            System.out.println("2) Buzz Aldrin");
            System.out.println("3) Laika");
            System.out.println("4) Buzz Lightyear");
            LeResposta = scan.nextInt();
            if(LeResposta<0 || LeResposta>4){
            System.out.println("Resposta invalida");
            }else{
                switch(LeResposta){
                    case 1: 
                        System.out.println("Resposta certa");
                        parar = true;
                    break;
                    case 2:
                        System.out.println("Poxa, errou ;(");
                        System.out.println("Buzz Aldrin foi o SEGUNDO homem a pisar na lua, foi quase hahaha\n");
                        System.out.println("Quer tentar de novo? \n 1-SIM \n 2-NAO");
                        LeResposta = scan.nextInt();
                        if(LeResposta == 2){
                            parar = true;
                        }
                        else if (LeResposta == 1){
                            parar = false;
                        }                  
                    break;
                    case 3:
                        System.out.println("ERROU!!");
                        System.out.println("Laika foi a primeira CACHORRA a ir para o espaco");
                        System.out.println("Infelizmente ela nao chegou a ir para lua.");
                        System.out.println("Quer tentar de novo? \n 1-SIM \n 2-NAO");
                        LeResposta = scan.nextInt();
                        if(LeResposta == 2){
                            parar = true;
                        }
                        else if (LeResposta == 1){
                            parar = false;
                        }
                    break;
                    case 4:
                        System.out.println("Resposta incorreta");
                        System.out.println("Buzz Lightyear e o  famoso patrulheiro espacial da famosa franquia Toy Story");
                        System.out.println("Sua primeira aparicao foi como brinquedo de Andy no filme Toy story em 1995");
                        System.out.println("Quer tentar de novo? \n 1-SIM \n 2-NAO");
                        LeResposta = scan.nextInt();
                        if(LeResposta == 2){
                            parar = true;
                        }
                        else if (LeResposta == 1){
                            parar = false;
                        }
                    break;
                }
            }
        }
    }   
}
