package br.com.mirante.webReferencias.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mirante.webReferencias.domain.Produto;
import br.com.mirante.webReferencias.domain.ReferenciasProduto;
import br.com.mirante.webReferencias.repository.ProdutoRepositoryJpa;
import br.com.mirante.webReferencias.repository.ReferenciaProdutoRepository;

@Service
public class CadastrarProdutoService {
	
	@Autowired
	private ProdutoRepositoryJpa produtoRepository;
	
	@Autowired
	private ReferenciaProdutoRepository referenciaRepository;
	
	@Transactional
	public Produto cadastrar(Produto produto, List<ReferenciasProduto> referencias) {
		
		produtoRepository.salvar(produto);
		referencias.forEach(referencia -> referencia.setProduto(produto));
		referenciaRepository.saveAll(referencias);
		
		return produto;
		
	}

}
