import java.util.*;
import java.io.*;

class viterbi {
	private int[] entrada, modificado[];

	public viterbi () {
	}
	
	//vetor de int com a entrada mais o tamanho
	public void set_entrada (int[] entrada, int tamanho) {
		this.entrada = new int[tamanho];
		this.entrada = entrada;
	}
}
