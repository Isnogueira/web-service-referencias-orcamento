package br.com.mirante.webReferencias.repository;

import java.util.List;

import br.com.mirante.webReferencias.domain.Produto;

public interface ProdutoRepository {

	void salvar(Produto produto);
	
	List<Produto> listar();
	
	Produto recuperar(String codigo);
	
	void excluir(String codigo);
	
}
