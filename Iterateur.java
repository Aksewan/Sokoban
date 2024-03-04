public interface Iterateur {
    int curseur;
    iterateur(){
        this.curseur = 0;
    }

    public boolean aProchain();
    public int prochain();
    public void supprime();
}
