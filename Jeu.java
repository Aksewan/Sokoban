public class Jeu {
    Niveau[] niveaux;
    int nombre_niveaux;
    int niveau_actuel;

    public Niveau niveau(){
        return niveaux[niveau_actuel]; 
    }

    public boolean prochainNiveau(){
        if(niveau_actuel<nombre_niveaux-1){
            niveau_actuel +=1;
            return true;
        }
        return false;
    }
}
