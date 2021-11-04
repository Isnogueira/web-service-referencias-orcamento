package br.com.mirante.webReferencias.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import br.com.mirante.webReferencias.domain.ReferenciasProduto;

public interface ReferenciaProdutoRepository extends JpaRepository<ReferenciasProduto, String> {

	
	@Modifying
	@Query("delete from ReferenciasProduto r where r.produto.codigo = :codigoProduto")
	void deleteByCodigoProduto(String codigoProduto);
	
	@Modifying
	@Query("from ReferenciasProduto r where r.produto.codigo = :codigoProduto")
	List<ReferenciasProduto> listarPorCodigoProduto(String codigoProduto);

}
