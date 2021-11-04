package br.com.mirante.webReferencias.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String codigo;
	private String descricao;
	private String unidade;
	
	@Column(name="VALOR_INFORMADO")
	private String valorInformado;
	
	protected Produto() {}
	
	public Produto(String codigo, String descricao, String unidade, String valorInformado) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.unidade = unidade;
		this.valorInformado = valorInformado;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getUnidade() {
		return unidade;
	}

	public String getValorInformado() {
		return valorInformado;
	}
	
	
}

/*
 * 
 *  CODIGO varchar(500) NOT NULL,
    DESCRICAO VARCHAR(500) NOT NULL,
    UNIDADE VARCHAR(500) NOT NULL,
    VALOR_INFORMADO FLOAT NOT NULL,
    CONSTRAINT PK_PRODUTO primary key (CODIGO)
 */
