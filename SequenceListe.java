

class SequenceListe{
	Maillon tete;
	Maillon queue;

	public void insereTete(int element){
		Maillon nouvelletete = new Maillon(element, this.tete);
		nouvelletete.valeur = element;
		nouvelletete.chaine = this.tete;
		if (this.tete == null){
			this.tete = nouvelletete;
			this.queue = nouvelletete;
		}
		else{
			this.tete = nouvelletete;
		}
	}

	public void insereQueue(int element){
		Maillon nouvellequeue = new Maillon();
		nouvellequeue.valeur = element;
		nouvellequeue.chaine = null;
		if(this.tete == null){
			this.tete = nouvellequeue;
			this.queue = nouvellequeue;
		}
		else{
			this.queue.chaine = nouvellequeue;
			this.queue = nouvellequeue;
		}
	}

	int extraitTete(){
		if (this.estVide()){
			throw new RuntimeException("Sequence vide");
		}
		int resultat = this.tete.valeur;
		this.tete = this.tete.chaine;
		return resultat;
	}

	boolean estVide(){
		return this.tete == null;
	}

	public String toString(){
		String resultat = "[ ";
		Maillon courant = tete;
		while (courant != null) {
			resultat += courant.valeur + " ";
			courant = courant.chaine;
		}
		resultat += "]";
		return resultat;
	}
}
