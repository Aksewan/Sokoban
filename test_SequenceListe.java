import java.io.PrintStream;

class test_SequenceListe{
	public static void main(String[] args){
		SequenceListe test = new SequenceListe();
		for(int i=0; i<10; i++){
			test.insereTete(i);
		}
		System.out.println(test.toString());
	}
}
	
