
public class Fakul
{
    public Fakul()
    {
        //
    }
    
    public int iterativ (int zahl) {
        int ergebnis=1;
        for (int i=1; i<=zahl; i++) {
            ergebnis *= i;
        }
        return ergebnis;
    }
    
    public int rekursiv(int zahl) {
        if (zahl == 1) {
            return 1;
        } else {
            return rekursiv(zahl-1)*zahl;
        }
    }
}
