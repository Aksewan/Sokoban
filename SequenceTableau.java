import java.util.ArrayList;

public class SequenceTableau<E>{
	ArrayList<E> elements;
	int debut, taille;

	SequenceTableau() {
		elements = new ArrayList<E>(1);
	}

	private void redimensionne() {
		if (taille >= elements.size()) {
			System.out.println("Redimensionne de " + elements.size() + " à " + elements.size()*2);
			ArrayList<E> nouveau = new ArrayList<E>(elements.size()*2);
			int fin = Math.min(debut+taille, elements.size());
			for (int i=debut; i<fin; i++)
				nouveau.set(i,elements.elementData(i));
			fin = (debut+taille)-elements.size();
			for (int i=0; i<fin; i++) {
				nouveau.set(i+elements.size(),elements.elementData(i));
			}
			elements = nouveau;
		}
	}

	public void insereTete(E element) {
		redimensionne();
		debut--;
		if (debut < 0)
			debut += elements.size();
		elements.set(debut,element);
		taille++;
	}

	public void insereQueue(E element) {
		redimensionne();
		int position = (debut+taille)%elements.size();
		elements.set(position,element);
		taille++;
	}

	public E extraitTete() {
		if (taille == 0)
			throw new RuntimeException("Sequence vide");
		E resultat = elements.elementData(debut);
		taille--;
		debut = (debut+1)%elements.size();
		return resultat;
	}

	public boolean estVide() {
		return taille == 0;
	}

	public String toString() {
		String resultat = "[ ";
		int fin = Math.min(debut+taille, elements.size());
		for (int i=debut; i<fin; i++)
			resultat += elements[i] + " ";
		fin = (debut+taille)-elements.size();
		for (int i=0; i<fin; i++)
			resultat += elements[i] + " ";
		resultat += "]";
		return resultat;
	}

    public Iterateur<E> iterateur(){
        return new IterateurTableau<E>(this);
    }
}