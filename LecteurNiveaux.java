import java.io.OutputStream;
import java.io.PrintStream;

class LecteurNiveau{
    PrintStream stream;

    LecteurNiveau(OutputStream out){
        stream = new PrintStream(out);
    }

    public void printNiveau(Niveau niveau){
        for (int i=0; i<niveau.nb_lignes; i++){
            for(int j=0; j< niveau.nb_colonnes; j++){
                if(niveau.aMur(i,j)){
                    stream.print("#");
                }
                else if(niveau.aPousseur(i,j)){
                    if(niveau.aBut(i,j)){
                        stream.print("+");
                    }
                    else{
                        stream.print("@");
                    }
                }
                else if(niveau.aCaisse(i,j)){
                    if(niveau.aBut(i,j)){
                        stream.print("*");
                    }
                    else{
                        stream.print("$");
                    }
                }
                else if(niveau.aBut(i,j)){
                    stream.print(".");
                }
                else{
                    stream.print(" ");
                }
            }
            stream.println();
        }
        stream.println(";" + niveau.nom_niveau);
    }
}