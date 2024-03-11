class IterateurListe implements Iterateur{
    Maillon courant, precedent, arrierePrecedent;
    SequenceListe s;
    boolean suppr;

    IterateurListe(SequenceListe l){
        this.courant = l.tete;
        this.s = l;
    }

    @Override
    public boolean aProchain(){
        return (this.courant.chaine!=null);
    }

    @Override
    public int prochain(){
        int res = this.courant.valeur;
        this.arrierePrecedent = this.precedent;
        this.precedent = this.courant;
        this.courant = this.courant.chaine;
        suppr = true;
        return res;
    }

    @Override
    public void supprime(){
        if(suppr){
            if(this.arrierePrecedent != null){
                this.arrierePrecedent.chaine = this.courant;
            }
            else{
                this.s.tete = this.courant;
            }
            this.precedent = this.arrierePrecedent;
        }
        else{
            throw new IllegalStateException("besoin d'effectuer prochain() avant supprime");
        }
        suppr = false;
    }
}