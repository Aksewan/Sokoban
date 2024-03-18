

class SequenceListe<E>{
	Maillon<E> tete;
	Maillon<E> queue;

	public void insereTete(E element){
		Maillon<E> nouvelletete = new Maillon<E>(element, this.tete);
		if (this.tete == null){
			this.tete = nouvelletete;
			this.queue = nouvelletete;
		}
		else{
			this.tete = nouvelletete;
		}
	}

	public void insereQueue(E element){
		Maillon<E> nouvellequeue = new Maillon<E>(element, null);
		if(this.tete == null){
			this.tete = nouvellequeue;
			this.queue = nouvellequeue;
		}
		else{
			this.queue.chaine = nouvellequeue;
			this.queue = nouvellequeue;
		}
	}

	E extraitTete(){
		if (this.estVide()){
			throw new RuntimeException("Sequence vide");
		}
		E resultat = this.tete.valeur;
		this.tete = this.tete.chaine;
		return resultat;
	}

	boolean estVide(){
		return this.tete == null;
	}

	public String toString(){
		String resultat = "[ ";
		Maillon<E> courant = tete;
		while (courant != null) {
			resultat += courant.valeur + " ";
			courant = courant.chaine;
		}
		resultat += "]";
		return resultat;
	}
}
