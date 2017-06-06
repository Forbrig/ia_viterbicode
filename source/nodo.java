
// serao utilizado no maximo 8 nodos, pois sao 4 estados possiveis que podem ir (por 0 e 1) 
// para 8 nodos, entre os quais haverao estados repetidos. Para eliminar os estados repetidos
// e escolhido o estado com menor erro.
// Sempre ficara na situacao de ter 4 estados que se ramificam em 8 possibilidades em que ha repeticao.
class nodo {
	private int estado_atual;
	private int erro;

	public nodo () {
		this.set_estado_atual(00);
		this.set_erro(0);
	}

	public void set_erro (int erro) {
		this.erro = erro;
	}

	public int get_erro () {
		return this.erro;
	}

	public void set_estado_atual (int estado) {
		this.estado_atual = estado;
	}

	public int get_estado_atual () {
		return this.estado_atual;
	}
}
