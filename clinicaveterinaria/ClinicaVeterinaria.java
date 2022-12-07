
package clinicaveterinaria;
import java.util.Scanner;
public class ClinicaVeterinaria {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Vacinas vacina = new Vacinas();
        int menu;
        boolean encerrar = true;
        //menu-------------------------------
        while(encerrar != false){
            System.out.println("\n        Bem Vindo            ");
            System.out.println("Qual vacina sera aplicada hoje?");
            System.out.println("1 - Vacina para Gripe");
            System.out.println("2 - Vacina para Raiva");
            System.out.println("3 - Vacina para Vermes tipo 1");
            System.out.println("4 - Vacina para Vermes tipo 2");
            System.out.println("5 - Deseja encerrar o dia?");
            menu = scan.nextInt();
        //opcoes de menu----------------------------
            switch(menu){
                case 1: 
                    if (vacina.VacinaGripe >0){
                        vacina.VacinaGripe--;
                        vacina.DoseGripe ++;
                        System.out.println("Retire seu comprovante de vacinacao contra GRIPE, \nObrigado!");
                        //System.out.println("Total de vacinas restantes: " +( vacina.VacinaGripe));
                    }
                    else {
                        System.out.println("As vacinas para gripe acabaram.");
                    }
                break;
                case 2:
                    if (vacina.VacinaRaiva > 0){
                        vacina.VacinaRaiva--;
                        vacina.DoseRaiva++;
                        System.out.println("Retire seu comprovante de vacinacao contra RAIVA, \nObrigado!");
                        //System.out.println("Total de vacinas restantes: " +( vacina.VacinaRaiva));
                    }
                    else{
                        System.out.println("As vacinas para raiva acabaram.");
                    }
                break;
                case 3:
                    if (vacina.VacinaVerme1 > 0){
                        vacina.VacinaVerme1--;
                        vacina.DoseVerme1++;
                        System.out.println("Retire seu comprovante de vacinacao contra VERMES TIPO 1, \nObrigado!");
                        //System.out.println("Total de vacinas restantes: " +( vacina.VacinaVerme1));
                    }
                    else{
                        System.out.println("As vacinas para vermes tipo 1 acabaram.");
                    }
                break;
                case 4:
                    if (vacina.VacinaVerme2 > 0){
                        vacina.VacinaVerme2--;
                        vacina.DoseVerme2++;
                        System.out.println("Retire seu comprovante de vacinacao contra VERMES TIPO 2, \nObrigado!");
                        //System.out.println("Total de vacinas restantes: " +( vacina.VacinaVerme2));
                    }
                    else{
                        System.out.println("As vacinas para vermes tipo 2 acabaram.");
                    }
                break;
                case 5:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Dia finalizado.");
                    System.out.println("Total de vacinas aplicadas: " + vacina.TotalDoses());
                    System.out.println("-------------------------------------------------");
                    System.out.println("Total de vacinas aplicadas para Gripe: " + vacina.DoseGripe);
                    System.out.println("Total de vacinas aplicadas para Raiva: " + vacina.DoseRaiva);
                    System.out.println("Total de vacinas aplicadas para Vermes Tipo 1: " + vacina.DoseVerme1);
                    System.out.println("Total de vacinas aplicadas para Vermes Tipo 2: " + vacina.DoseVerme2);
                    System.out.println("-------------------------------------------------");
                    System.out.println("Total de doses restantes para GRIPE: " + vacina.VacinaGripe);
                    System.out.println("Total de doses restantes para RAIVA: " + vacina.VacinaRaiva);
                    System.out.println("Total de doses restantes para VERMES TIPO 1: " + vacina.VacinaVerme1);
                    System.out.println("Total de doses restantes para VERMES TIPO 2: " + vacina.VacinaVerme2);
                    System.out.println("-------------------------------------------------");
                    if(vacina.VacinaGripe <= 10){
                        System.out.println("E necessario comprar mais " + (vacina.DoseGripe)+ " doses de vacina para Gripe.");
                    }
                    if(vacina.VacinaRaiva <= 10){
                        System.out.println("E necessario comprar mais " + (vacina.DoseRaiva)+ " doses de vacina para Raiva.");
                    }
                    if(vacina.VacinaVerme1 <= 10){
                        System.out.println("E necessario comprar mais " + (vacina.DoseVerme1)+ " doses de vacina para Vermes Tipo 1.");
                    }
                    if(vacina.VacinaVerme2 <= 10){
                        System.out.println("E necessario comprar mais " + (vacina.DoseVerme2)+ " doses de vacina para Vermes Tipo 2.");
                    }
                    encerrar = false;
                break;
            }
        }    
    }   
}
