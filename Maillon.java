public class Maillon<E>{
	E valeur;
	Maillon<E> chaine;


    Maillon(E element, Maillon<E> m){
        this.valeur = element;
        this.chaine = m;
    }
}

