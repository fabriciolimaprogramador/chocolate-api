package br.com.chocolates.api.utils;

import org.springframework.core.convert.converter.Converter;

import br.com.chocolates.api.enums.TipoChocolate;

public class ConvertStringToEnum implements Converter<String, TipoChocolate> {

	@Override
	public TipoChocolate convert(String source) {
		try {
			return TipoChocolate.valueOf(source.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Tipo de chocolate é inválido");
		}
	}

}
