package testes;

import rh.*;

public class ControleBonificacoesTeste {
	public static void main(String[] args) {
		Bonificavel g = new Gerente("Maria", "01455563416", 15000);
		Bonificavel o = new Operador("João", "12475569483", 5000);
		Bonificavel s = new Socio("Joana", 17500);
		
		ControleBonificacoes cb = new ControleBonificacoes();
		
		cb.registraBonificacoes(g);
		cb.registraBonificacoes(o);
		cb.registraBonificacoes(s);
		
		System.out.println("Total bonificações: " + cb.getTotalBonificacoes());
	}
}
