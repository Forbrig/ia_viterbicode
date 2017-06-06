import java.util.*;
import java.io.*;

class leitor_arq {
	private Scanner ler;
	private int debugger = 0; /* COLOCAR 1 PARA DEBUGAR */
	private int qt_testes = 0;
	private viterbi _viterbi = new viterbi();

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
			/* RESETA O PONTEIRO DE LEITURA TEM UMA FORMA DE VOLTAR O PONTEIRO ARRUMA ISSO POHA*/
			arquivo = new File("testes.dat");
			ler = new Scanner(arquivo);
			
			//arquivo = new File("testes.dat");//reset
    		alimenta_viterbi();
		}
		
		catch (FileNotFoundException ex) {
			System.out.println("arquivo de entrada não encontrado\n");
    	}
	}

	public void alimenta_viterbi () { /* ENTRADA */ 
		qt_testes = ler.nextInt();
		if (debugger == 1) {
			System.out.println("\n\nqt_testes == "+ qt_testes);
		}

		
		for (int j = 0; j < qt_testes; j++) {
			String _string = ler.next(); //so` usado para saber a quantidade de bits com o .lengt()
			int[] entrada = new int[_string.length()]; //transforma o vetor de string no vetor exato de int
			for (int i = 0; i < _string.length(); i++) {
				entrada[i] = Character.getNumericValue(_string.charAt(i));
				if (debugger == 1) {
					System.out.print(entrada[i]);
				}
			}
			if (debugger == 1) {
				System.out.println("\nqt_bits == "+ _string.length());
			}	

			_viterbi.set_entrada(entrada);
		}
	}
}
