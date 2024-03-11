public class IterateurTableau implements Iterateur {
    int curseur, dernier;
    int[] tab;
    boolean suppr;
    IterateurTableau(SequenceTableau sequence){
        this.curseur = sequence.debut;
        this.dernier = sequence.taille;
        tab = sequence.elements;
    }

    @Override
    public boolean aProchain(){
        return curseur < dernier;
    }

    @Override
    public int prochain(){
        curseur +=1;
        suppr = true;
        return tab[curseur-1];
    }
    
    @Override
    public void supprime(){
        if(suppr){
            for(int i=this.curseur; i<=dernier; i++){
                tab[i-1] = tab[i];
            }
            dernier -= 1;
        }
        else{
            throw new IllegalStateException("necessite d'appeler prochain avant de supprimer");
        }
        suppr = false;
    }
}
