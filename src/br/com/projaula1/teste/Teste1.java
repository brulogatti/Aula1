package br.com.projaula1.teste;

import br.com.projaula1.entidade.Pessoa;

public class Teste1 {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setId(1);
		p.setNome("Felipe");
		
		System.out.println(p.imprimir());
		
		

	}

}
