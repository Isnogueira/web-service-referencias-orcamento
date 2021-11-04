package br.com.mirante.webReferencias.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="REFERENCIAS_PRODUTO")
public class ReferenciasProduto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String codigo;
	private Integer mes;
	private Integer ano;
	private String unidade;
	private String descricao;
	
	@Column(name="VALOR_INFORMADO")
	private Float valorInformado;
	
	@ManyToOne
	@JoinColumn(name="CODIGO_PRODUTO")
	@JsonIgnore
	private Produto produto;
	
	protected ReferenciasProduto() {}

	public ReferenciasProduto(String codigo, Integer mes, Integer ano, String unidade, String descricao,
			Float valorInformado) {
		super();
		this.codigo = codigo;
		this.mes = mes;
		this.ano = ano;
		this.unidade = unidade;
		this.descricao = descricao;
		this.valorInformado = valorInformado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getValorInformado() {
		return valorInformado;
	}

	public void setValorInformado(Float valorInformado) {
		this.valorInformado = valorInformado;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
}
