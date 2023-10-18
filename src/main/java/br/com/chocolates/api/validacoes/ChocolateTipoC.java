package br.com.chocolates.api.validacoes;

public class ChocolateTipoC implements Chocolates {

	@Override
	public String quantidadeNecessaria() {
		return "Para produzir chocolate tipo C, serão necessários 90% de cacau";
	}

}
