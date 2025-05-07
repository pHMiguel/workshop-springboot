package com.aphonso.curso.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.aphonso.curso.entities.Order;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class PaymentPK implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		return Objects.hash(order);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentPK other = (PaymentPK) obj;
		return Objects.equals(order, other.order);
	}
}
