package com.ivson.modelagemconceitual.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Pedido implements Serializable {
	
	/**
	 * Versao numero 1 dessa classe
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	
	private Date instant;
	
	//newcessario para nao dar erro de entidade transiente ao salvar (do JPA)
	@OneToOne(cascade = CascadeType.ALL, mappedBy="pedido")	
	private Pagamento pagamento;

	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="endereco_de_entrega_id")
	private Endereco enderecoDeEntrega;
	
	public Pedido() {

	}

	public Pedido(Integer id, Date instant, Cliente cliente, Endereco enderecoDeEntrega) {
		super();
		this.id = id;
		this.instant = instant;
		//this.pagamento = pagamento;
		this.cliente = cliente;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	public Integer getId() {
		return id;
	}

	public Date getInstant() {
		return instant;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Endereco getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setInstant(Date instant) {
		this.instant = instant;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
