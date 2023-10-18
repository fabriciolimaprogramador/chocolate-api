package br.com.chocolates.api.validacoes;

public class ChocolateTipoA implements Chocolates {

	@Override
	public String quantidadeNecessaria() {
		return "Para produzir chocolate tipo A, serão necessários 80% de cacau";
	}


}
