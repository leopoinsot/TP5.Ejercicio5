package ar.unrn.model;

import static org.junit.jupiter.api.Assertions.*;

class RemeraTest {

	@org.junit.jupiter.api.Test
	void precioFinalRemeraimportadaTest() {
		var recargoRemeraImportada = new Recargo(3);
		var margenDeGananciaRemeraImportada = new MargenGanancia(25);
		var remeraImportada = new RemeraImportada(100, recargoRemeraImportada, margenDeGananciaRemeraImportada, 5);
		assertEquals(135.1875, remeraImportada.precioFinal());
	}

	@org.junit.jupiter.api.Test
	void precioFinalRemeraNacionalTest() {
		var recargoRemeraNacional = new Recargo(1.5);
		var margenDeGananciaRemeraNacional = new MargenGanancia(15);

		var remeraNacional = new RemeraNacional(100, recargoRemeraNacional, margenDeGananciaRemeraNacional, 20);
		assertEquals(93.38, remeraNacional.precioFinal());
	}
}