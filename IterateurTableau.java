import java.util.ArrayList;

public class IterateurTableau<E> implements Iterateur<E> {
    int curseur, dernier;
    ArrayList<E> tab;
    boolean suppr;
    IterateurTableau(SequenceTableau<E> sequence){
        this.curseur = sequence.debut;
        this.dernier = sequence.taille;
        tab = sequence.elements;
    }

    @Override
    public boolean aProchain(){
        return curseur < dernier;
    }

    @Override
    public E prochain(){
        curseur +=1;
        suppr = true;
        return tab.get(curseur-1);
    }
    
    @Override
    public void supprime(){
        if(suppr){
            for(int i=this.curseur; i<=dernier; i++){
                tab.set(i-1,tab.get(i));
            }
            dernier -= 1;
        }
        else{
            throw new IllegalStateException("necessite d'appeler prochain avant de supprimer");
        }
        suppr = false;
    }
}
