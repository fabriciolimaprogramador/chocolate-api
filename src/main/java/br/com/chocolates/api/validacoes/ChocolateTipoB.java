package br.com.chocolates.api.validacoes;

public class ChocolateTipoB implements Chocolates {

	@Override
	public String quantidadeNecessaria() {
		return "Para produzir chocolate tipo B, serão necessários 85% de cacau";
	}


}
