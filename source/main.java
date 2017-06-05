import java.util.*;
import java.io.*;

class main {
	public static void main (String[] args) throws FileNotFoundException {
		try {
			leitor_arq leitor = new leitor_arq();
		}
		
		catch (FileNotFoundException ex) {
			System.out.println("arquivo não encontrado\n");
    	}
	}
}
