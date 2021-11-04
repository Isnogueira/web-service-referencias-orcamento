package br.com.mirante.webReferencias.repository;

import java.util.List;

import br.com.mirante.webReferencias.domain.ReferenciasProduto;

public interface ReferenciaRepository {
	
	void excluir(String codigoReferencia);

	void salvar(List<ReferenciasProduto> referencias);

}
