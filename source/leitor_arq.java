import java.util.*;
import java.io.*;

class leitor_arq {
	private Scanner ler;
	private int debugger = 0; /* COLOCAR 1 PARA DEBUGAR */
	private int qt_testes = 0;
	private viterbi _viterbi;

	public leitor_arq () throws FileNotFoundException {
		//cria um scanner padrão com a entrada ".dat" e uma expressão regular com delimitadores \n (ou |) " " (espaço)
		try {
			File arquivo = new File("testes.dat");
			ler = new Scanner(arquivo); //.useDelimiter("\\n| ");	
			
			if (debugger == 1) { //printa tudo debug
				while(ler.hasNext()) { 
					System.out.println(ler.next());
				}
			}
    		alimenta_viterbi();
		}
		
		catch (FileNotFoundException ex) {
			System.out.println("arquivo de entrada não encontrado\n");
    	}
	}

	public void alimenta_viterbi () {
		/* ENTRADA */
		qt_testes = ler.nextInt();
		String entrada1 = ler.next();
		if (debugger == 1) {
			System.out.println("qt_testes == "+ qt_testes);
			System.out.println("quantidade de bits == "+ entrada1.length());
		}
		
		//for (int i = 0; i < qt_testes; i++) {
			
			//_viterbi
		//}
	}
}
