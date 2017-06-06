import java.util.*;
import java.io.*;

class viterbi {
	private int qt_bits;
	private int[] entrada, modificado[];

	public viterbi () {
	}
	
	public void set_qt_bits (int qt_bits) {
		this.qt_bits = qt_bits;
	}

	//vetor de int com a entrada mais o tamanho
	public void set_entrada (int[] entrada) {
		this.entrada = new int[get_qt_bits()];
		for (int i = 0; i < get_qt_bits(); i++) {
			this.entrada[i] = entrada[i];
		}
	}

	public int get_qt_bits () {
		return this.qt_bits;
	}
}
