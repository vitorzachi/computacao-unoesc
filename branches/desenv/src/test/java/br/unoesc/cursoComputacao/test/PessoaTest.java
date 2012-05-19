package br.unoesc.cursoComputacao.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.unoesc.cursoComputacao.model.Pessoa;

public class PessoaTest {

	@Test
	public void testPessoa() {
		Pessoa pessoa = new Pessoa("Andre");

		assertNotNull(pessoa.getNome());
		assertEquals("Andre", pessoa.getNome());
	}

}
