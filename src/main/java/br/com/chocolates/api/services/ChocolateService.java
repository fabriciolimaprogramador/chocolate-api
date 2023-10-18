package br.com.chocolates.api.services;

import org.springframework.stereotype.Service;

import br.com.chocolates.api.enums.TipoChocolate;
import br.com.chocolates.api.validacoes.ChocolateTipoA;
import br.com.chocolates.api.validacoes.ChocolateTipoB;
import br.com.chocolates.api.validacoes.ChocolateTipoC;
import br.com.chocolates.api.validacoes.Chocolates;

@Service
public class ChocolateService {
	
	public String getQuantidadeNecessaria(TipoChocolate tipoChocolate) {
		
		switch (tipoChocolate) {
		case CHOCOLATE_TIPO_A: return getQuantidadeNecessaria(new ChocolateTipoA());
		case CHOCOLATE_TIPO_B: return getQuantidadeNecessaria(new ChocolateTipoB());
		case CHOCOLATE_TIPO_C: return getQuantidadeNecessaria(new ChocolateTipoC());
		default:
			throw new IllegalArgumentException("Tipo de chocolate inválido");
		}
	}

	private String getQuantidadeNecessaria(Chocolates chocolates) {
		return chocolates.quantidadeNecessaria();
	}
	
	

}
