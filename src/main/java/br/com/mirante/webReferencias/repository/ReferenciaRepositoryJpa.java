package br.com.mirante.webReferencias.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.mirante.webReferencias.domain.ReferenciasProduto;

@Repository
public class ReferenciaRepositoryJpa implements ReferenciaRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void excluir(String codigoReferencia) {
	
		var referenciaRecuperada = entityManager.find(ReferenciasProduto.class, codigoReferencia);
		
		if(referenciaRecuperada != null) {
			
			entityManager.getTransaction().begin();
			entityManager.remove(referenciaRecuperada);
			entityManager.getTransaction().commit();
		}
	}

	@Override
	public void salvar(List<ReferenciasProduto> referencias) {
		
		referencias.forEach(entityManager::persist);
	}

	
}
