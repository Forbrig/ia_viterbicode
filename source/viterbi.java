import java.util.*;
import java.io.*;

class viterbi {
	private int qt_bits;
	private int[] entrada, modificado[];
	private int[] codificado;
	private int[] codificado_ruido;

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
		codifica();
	}

	public int get_qt_bits () {
		return this.qt_bits;
	}

	public int[] get_entrada () {
		return this.entrada;
	}

	public void codifica () {
		int estado_atual = 00;
		int[] aux = this.get_entrada();
		codificado = new int[get_qt_bits() * 2];
		int j = 0;
		for (int i = 0; i < get_qt_bits(); i++) {
			switch (aux[i]) {
			case 0:
				if (estado_atual == 00) {
					codificado[j] = 0;
					codificado[j+1] = 0;
					estado_atual = 00;						
				} else if (estado_atual == 01) {
					codificado[j] = 1;
					codificado[j+1] = 1;
					estado_atual = 00;
				} else if (estado_atual == 10) {
					codificado[j] = 1;
					codificado[j+1] = 0;
					estado_atual = 01;
				} else if (estado_atual == 11) {
					codificado[j] = 0;
					codificado[j+1] = 1;
					estado_atual = 01;
				}
				j = j +2;
				break;
			case 1:
				if (estado_atual == 00) {
					codificado[j] = 1;
					codificado[j+1] = 1;
					estado_atual = 10;						
				} else if (estado_atual == 01) {
					codificado[j] = 0;
					codificado[j+1] = 0;
					estado_atual = 10;
				} else if (estado_atual == 10) {
					codificado[j] = 0;
					codificado[j+1] = 1;
					estado_atual = 11;
				} else if (estado_atual == 11) {
					codificado[j] = 1;
					codificado[j+1] = 0;
					estado_atual = 11;
				}
				j = j +2;
				break;
			}
		}
		/*
		for (int x : codificado) {
			System.out.print(x);
		}
		System.out.print("\n");
		*/
	}

	public void aplica_ruido () {
		codificado_ruido = new int[get_qt_bits() * 2];
		for (int i = 0; i < get_qt_bits() * 2; i++) {
			
		}
	}

}
