package br.com.mirante.webReferencias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mirante.webReferencias.domain.Produto;
import br.com.mirante.webReferencias.domain.ReferenciasProduto;
import br.com.mirante.webReferencias.service.CadastrarProdutoService;

@RestController
public class ProdutoController {
	
	
	@Autowired
	private CadastrarProdutoService cadastrarService;
	
	@PostMapping("/produtos")
	public Produto salvarProduto (@RequestBody CadastrarProdutoRequest requisicao) {
		
		return cadastrarService.cadastrar(requisicao.produto, requisicao.referencias);
				
				
	}			
				
	}
	
	class CadastrarProdutoRequest {
		
		Produto produto;
		
		List<ReferenciasProduto> referencias;

		public Produto getProduto() {
			return produto;
		}

		public void setProduto(Produto produto) {
			this.produto = produto;
		}

		public List<ReferenciasProduto> getReferencias() {
			return referencias;
		}

		public void setReferencias(List<ReferenciasProduto> referencias) {
			this.referencias = referencias;
		}

		
		
		}
		
