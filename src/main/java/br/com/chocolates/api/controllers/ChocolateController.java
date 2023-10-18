package br.com.chocolates.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.chocolates.api.enums.TipoChocolate;
import br.com.chocolates.api.services.ChocolateService;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/chocolates")
@Tag(name = "open-api")
public class ChocolateController {

	@Autowired
	private ChocolateService chocolateService;

	@GetMapping
	public ResponseEntity<String> getQuantidadeNecessaria(
			@RequestParam(name = "tipoChocolate", required = true) TipoChocolate tipoChocolate) {
		return ResponseEntity.ok(chocolateService.getQuantidadeNecessaria(tipoChocolate));
	}

}
