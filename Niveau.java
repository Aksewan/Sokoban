import java.util.Scanner;

class Niveau{
    int nb_lignes;
    int nb_colonnes;
    String nom_niveau;
    int[][] tab_niveau;
    final int MUR = 1;
    final int POUSSEUR = 2;
    final int BUT = 4;
    final int CAISSE = 8;

    Niveau(){
        tab_niveau = new int[100][100];
        nb_lignes = 0;
        nb_colonnes = 0;
    }

    void redimmensionne(int i, int j){
        if(nb_lignes<=i){
            nb_lignes = i+1;
        }
        if(nb_colonnes<=j){
            nb_colonnes = j+1;
        }
    }

    public void fixeNom(String s){
        this.nom_niveau = s;
    }

    public void videCase(int i, int j){
        this.tab_niveau[i][j] = 0;
    }

    public void ajouteMur(int i, int j){
        redimmensionne(i,j);
        this.tab_niveau[i][j] |= MUR;
    }

    public void ajoutePousseur(int i, int j){
        redimmensionne(i,j);
        this.tab_niveau[i][j] |= POUSSEUR;
    }

    public void ajouteCaisse(int i, int j){
        redimmensionne(i,j);
        this.tab_niveau[i][j] |= CAISSE;
    }

    public void ajouteBut(int i, int j){
        redimmensionne(i,j);
        this.tab_niveau[i][j] |= BUT;
    }

    public int lignes(){
        return nb_lignes;
    }

    public int colonnes(){
        return nb_colonnes;
    }

    public String nom(){
        return nom_niveau;
    }

    public boolean estVide(int l, int c){
        return this.tab_niveau[l][c] == 0;
    }

    public boolean aMur(int l, int c){
        return (this.tab_niveau[l][c] & MUR) !=0;
    }

    public boolean aBut(int l, int c){
        return (this.tab_niveau[l][c] & BUT) !=0;
    }

    public boolean aPousseur (int l, int c){
        return (this.tab_niveau[l][c] & POUSSEUR) != 0;
    }

    public boolean aCaisse(int l, int c){
        return (this.tab_niveau[l][c] & CAISSE) !=0;

    }
}
