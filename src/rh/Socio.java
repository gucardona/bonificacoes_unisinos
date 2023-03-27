package rh;

public class Socio implements Bonificavel {
	private String nome;
	private double prolabore;

	public Socio(String nome, double prolabore) {
		this.nome = nome;
		this.prolabore = prolabore;
	}

	public String getNome() {
		return nome;
	}

	public double getProlabore() {
		return prolabore;
	}

	@Override
	public double getBonificacao() {
		return prolabore * 1.35;
	}

}