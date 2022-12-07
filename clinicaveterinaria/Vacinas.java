
package clinicaveterinaria;

public class Vacinas {
    int VacinaRaiva = 100;
    int DoseRaiva;
    int VacinaGripe = 100;
    int DoseGripe;
    int VacinaVerme1 = 100;
    int DoseVerme1;
    int VacinaVerme2 = 100;
    int DoseVerme2;
    
    public int TotalDoses(){
        return (DoseRaiva + DoseGripe + DoseVerme1 + DoseVerme2);
    }
}
