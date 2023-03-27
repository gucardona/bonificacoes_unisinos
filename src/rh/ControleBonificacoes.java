package rh;

public class ControleBonificacoes {
	private static final int NUMERO_FUNCIONARIOS = 10;
	private Bonificavel[] folha;
	private int numeroElementos;

	public ControleBonificacoes(Bonificavel[] folha, int numeroElementos) {
		folha = new Bonificavel[NUMERO_FUNCIONARIOS];
		numeroElementos = 0;
	}
	
	public ControleBonificacoes() {
		folha = new Bonificavel[NUMERO_FUNCIONARIOS];
		numeroElementos = 0;
	}

	public void registraBonificacoes(Bonificavel pessoaBonificavel) {
		folha[numeroElementos++] = pessoaBonificavel;
	}
	
	public double getTotalBonificacoes() {
		double total = 0.0;
		for(int i = 0; i < folha.length; i++) {
			Bonificavel f = folha[i];
			if(f != null)
				total += f.getBonificacao();
		}
		return total;
	}
}