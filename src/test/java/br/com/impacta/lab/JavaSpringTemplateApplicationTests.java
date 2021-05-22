package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import br.com.impacta.models.*;

public class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldMontarResumoWithNewProdutoCodigo1() {
		
		Produto produto = new Produto();
		produto.setCodigo(1);
		produto.setDescricao("Camisa");
		produto.setValor(70.00);
		
		String resumo = produto.montarResumo(produto);
		
		assertEquals("codigo: 1, descricao: Camisa, valor: 70.0".toUpperCase(), resumo.toUpperCase());
		
	}

	@Test
	public void shouldMontarResumoWithNewProdutoCodigo15() {
		
		Produto produto = new Produto();
		produto.setCodigo(15);
		produto.setDescricao("Tenis");
		produto.setValor(200.0);
		
		String resumo = produto.montarResumo(produto);
		
		assertEquals("codigo: 15, descricao: Tenis, valor: 200.0".toUpperCase(), resumo.toUpperCase());
		
	}
	
}
