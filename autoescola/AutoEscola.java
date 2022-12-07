
package autoescola;
import java.util.Scanner;

public class AutoEscola {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu;
        int encerrar = 0;
        int marcha = 1;
        
        
        while(encerrar ==0){
            //com o carro parado
            System.out.println("--------------------------------------");
            System.out.println("Estado atual do carro: Desligado");
            System.out.println("--------------------------------------");
            System.out.println("1)Ligar o carro");
            System.out.println("0)Encerrar o programa");
            System.out.println("--------------------------------------");
            menu = scan.nextInt();
            if(menu == 1){
                encerrar++;
            }
            else{
                encerrar = -8;
            }
            //com o carro ligado, porem parado 
            while(encerrar == 1){
                System.out.println("--------------------------------------");
                System.out.println("Bem vindo ao simulador da Autoescola");
                System.out.println("Se Acalma que estou Aprendendo");
                System.out.println("--------------------------------------");
                System.out.println("--------------------------------------");
                System.out.println("Estado atual do carro: Ligado");
                System.out.println("--------------------------------------");
                System.out.println("O carro esta parado");
                System.out.println("--------------------------------------");
                System.out.println("1)Desligar o carro");
                System.out.println("2)Andar");
                System.out.println("3)Engatar a re");
                System.out.println("--------------------------------------");
                menu = scan.nextInt();
                switch (menu){
                    case 1: encerrar = 0;
                    break;
                    case 2: 
                        encerrar++;
                        marcha = 1;
                    break;
                    case 3: encerrar = 3;
                    break;
                }
                //carro dando re               
                while(encerrar == 3){
                    System.out.println("--------------------------------------");
                    System.out.println("Estado atual do carro: Ligado");
                    System.out.println("--------------------------------------");
                    System.out.println("O carro esta na marcha re");
                    System.out.println("--------------------------------------");
                    System.out.println("1)Parar o carro");
                    System.out.println("3)Desligar o carro");
                    System.out.println("--------------------------------------");
                    menu = scan.nextInt();
                    switch (menu){
                        case 1: encerrar = 1;
                        break;
                        case 3: encerrar = 0;
                        break;
                    }               
                }
                // carro andando 
                while (encerrar == 2){
                    if(marcha >= 8){
                        System.out.println("--------------------------------------");
                        System.out.println("Estado atual do carro: Ligado");
                        System.out.println("--------------------------------------");
                        System.out.println("o carro esta andando na marcha " + marcha);
                        System.out.println("--------------------------------------");
                        System.out.println("1)Parar o carro");
                        System.out.println("3)Descer a marcha");
                        System.out.println("--------------------------------------");
                        menu = scan.nextInt();
                        switch (menu){
                            case 1: encerrar = 1;
                            break;
                            case 3: 
                                marcha --;
                            break;
                        }
                    }
                    else if (marcha <8){
                        System.out.println("--------------------------------------");
                        System.out.println("Estado atual do carro: Ligado");
                        System.out.println("--------------------------------------");
                        System.out.println("o carro esta na andando marcha " + marcha);
                        System.out.println("--------------------------------------");
                        System.out.println("1)Parar o carro");
                        System.out.println("2)Subir a marcha ");
                        System.out.println("3)Descer a marcha");
                        menu = scan.nextInt();
                        switch (menu){
                            case 1: encerrar = 1;
                            break;
                            case 2: marcha += 1;
                            break;
                            case 3: 
                                if(marcha == 1){
                                    encerrar =1;
                                }
                                else{
                                    marcha --;
                                }
                            break;
                        }
                    }
                }               
            }
        }
    }
}
